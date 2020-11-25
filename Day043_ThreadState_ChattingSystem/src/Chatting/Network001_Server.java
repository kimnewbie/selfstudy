package Chatting;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
		1) KT A/S : 서버프로그램이 먼저 실행되어 [서버소켓(KT)]을 사용해서 서벗 컴퓨터 특정포트에서
					클라이언트 프로그램의 연결 요청 기다리기.
		2) 고객1 : KT A/S 센터의 서버 IP와 포트정보를 가지고 (정보를 가지고 있어야해)
					[socket]을 생성해서 서버에 연결을 요청한다.
		3) 상담사-고객1 연결 : 서버소켓을 클라이언트의 연결요청을 받으면 서버에 새로운 [socket]을 생성해
							클라이언트의 소켓과 연결
		4)					일대일 통신
*/
public class Network001_Server {
	public static void main(String[] args) {
//		KT A/S			=> 서버소켓
//		1. 서버프로그램이 먼저 실행되어 [서버소켓]을 사용해
		ServerSocket serverSocket = null;
		System.out.println("1. 서버소켓만들기[as센터준비]");
//		2. 서버컴퓨터의 [특정포트]에서 클라이언트의 연결요청기다리기
		try { // 특정 포트에서 오류가 날 수 있어서
			serverSocket = new ServerSocket(523); }
		catch (IOException e) { e.printStackTrace(); }
		System.out.println("2. 9시가되면 포트번호 열어서 - 입장하길 기다리기");
		
//		상담사 - 전화기	=> 소켓
		try {
			Socket socket = serverSocket.accept(); // 서버소켓에 담아주기
			System.out.println("3. 고객연결요청 - 4. 요청성공시(accept) 5. 상담사연결");
			System.out.println("6. 상담사가 연결확인 메세지 보내기");
			DataOutputStream message = new DataOutputStream(socket.getOutputStream());//안녕하세요 고객님 writer
			message.writeUTF("[상담사] 안녕하세요 고객님!");
			System.out.println("7. 상담사 연결확인 메세지 보내기");
			message.close(); // 내가 말하는 걸 끊어야 상대방이 얘기하고 볼 수 있으니까	잘되어있는거예요?오 감사합니다!!
			socket.close();
		} catch(IOException e) {e.printStackTrace();}
	}
}
