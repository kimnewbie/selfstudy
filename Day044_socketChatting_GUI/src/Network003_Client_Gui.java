import java.io.IOException;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class Network003_Client_Gui {
	public static void main(String[] args) {
		Socket info = null;
		NetworkGui_View gui = new NetworkGui_View(); gui.create();
		try {
			info = new Socket("127.0.0.1", 523);
			System.out.println("[Client] 3. asCenter에 전화하기...");
			gui.textArea.append("[Client] 3. asCenter에 전화하기...");

//			[controller]NetworkGui_Sender - DataOutputStream
			NetworkGui_Sender sender = new NetworkGui_Sender(info, gui); sender.start();
//			[controller]NetworkGui_Receiver - DataInputStream			
			NetworkGui_Receiver receiver = new NetworkGui_Receiver(info, gui); receiver.start();
			
		} catch (UnknownHostException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace(); }
	}	
}
