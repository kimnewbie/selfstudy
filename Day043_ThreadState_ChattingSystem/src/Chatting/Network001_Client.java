package Chatting;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Network001_Client {
	public static void main(String[] args) {
//		고객 - 전화기	: 소켓
		try {
			Socket socket = new Socket("127.0.0.1", 523 );
			System.out.println("3. [CLIENT] 서버연결시도 ");
			
			DataInputStream message = new DataInputStream(socket.getInputStream());
			System.out.println("[CLIENT] 서버로부터 받은 메세지 : " + message.readUTF());
			
			message.close();
			socket.close();
			
		} catch (UnknownHostException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace(); }
	}
}
