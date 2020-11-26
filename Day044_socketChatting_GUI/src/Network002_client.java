import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Network002_client {
	public static void main(String[] args) {
		Socket client = null;
		
		try {
			client = new Socket("127.0.0.1",523);
			System.out.println("[CLIENT] 2. AS센터에 연락하기");
			

//			말하기 (DataOutputStream)
			Network_Sender sender = new Network_Sender(client); sender.start(); //  스레드 만들기
//			듣기 (Data)
			Network_Receiver receiver = new Network_Receiver(client); receiver.start();
		} catch (UnknownHostException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace(); }
	}
}
/**
cs 가 고객 입장하면
연결요청확인[/127.0.0.1 : 12410
정보를 받게 된다.
*/