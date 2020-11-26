import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Network002_server {
	public static void main(String[] args) {
		ServerSocket asCenter = null;
		Socket cs = null;
//		1) [서버소켓] 만들기 - 서버 컴퓨터의 특정포트에서 클라이언트 프로그램의 연결요청 기다리기
		try {
			asCenter = new ServerSocket(523); // 열어놓고 고객 기다리기
			System.out.println("[SERVER] 1. 서버준비완료! - 고객님기다리기");
		} catch (IOException e) {e.printStackTrace();}
//		2) 상담사 - 전화기 [소켓: 말하기, 듣기]
		try { // accept 고객이 접속하는 걸 확인 accept, 소켓단위로 리턴
			cs = asCenter.accept(); 
			System.out.println("[SERVER] 3. 고객님들어와서 상담시작");
			System.out.println("연결요청확인["+cs.getInetAddress()+" : "+cs.getPort()+"]");
			
//			말하기 (DataOutputStream)
			Network_Sender sender = new Network_Sender(cs); sender.start(); //  스레드 만들기
//			듣기 (Data)
			Network_Receiver receiver = new Network_Receiver(cs); receiver.start();
		} 
		catch (IOException e) {e.printStackTrace(); }
	}
}
// 클래스 만들기 Network_Sender, Network_Receiver
class Network_Sender extends Thread{
	long milliseconds;
	SimpleDateFormat sdf;
	//
	DataOutputStream out;
	Socket socket;

	public Network_Sender() {
		/* milliseconds=0; sdf=new SimpleDateFormat("HH:mm:ss"); */ out=null; socket=null;}
	public Network_Sender(Socket socket) {
		milliseconds=0; sdf=new SimpleDateFormat("HH:mm:ss");
		this.socket = socket; // 고객에게 받은 정보 받기
		try { this.out = new DataOutputStream(socket.getOutputStream()); } // 말하기기능받기
		catch (IOException e) { e.printStackTrace(); }
	}
	@Override public void run() {	
	
		Scanner sc = new Scanner(System.in);
		while(out!=null) { // 조건 = 말할 수 있다면	
			if(socket.getPort()==523) { // 523은 클라이언트의 포트값. 소켓포트가 클라이언트와 같다면
				try {
					out.writeUTF("[CLIENT: "+sdf.format(System.currentTimeMillis())+"]" + sc.next()); // 쓸 때 CLIENT로
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else { // 523이 아니면 그건 SERVER
				try {
					out.writeUTF("[SERVER: "+sdf.format(System.currentTimeMillis())+"]" + sc.next());
				} catch(IOException e) {}
			}
		}
	}
}
class Network_Receiver extends Thread{
	DataInputStream in;
	Socket socket; // 말하는 정보 가져오기
	public Network_Receiver() {in=null; socket=null;}
	public Network_Receiver(Socket socket) {
		this.socket=socket;
		try { in = new DataInputStream(socket.getInputStream()); } // 들을 준비 끝
		catch (IOException e) { e.printStackTrace(); }
	}
	@Override
	public void run() {
		while(in!=null) { // 조건 : in이 끊기지 않는다면
			try { System.out.println(in.readUTF()); }
			catch (IOException e) { e.printStackTrace(); }
		}
	}	
}