import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class NetworkGui_View/* extends Thread */{
	JFrame frame;
	JLabel label;
	TextArea textArea;
	JPanel panel;
	JTextField textfield;
	JButton button;

	//
	public NetworkGui_View() {
		frame = new JFrame("[JAVA TALK!]");
		label = new JLabel("", JLabel.RIGHT);
		textArea = new TextArea();
		textfield = new JTextField(20);
		button = new JButton("전송");
		panel = new JPanel();
	}

	// 감사합니당
	public void create() {
//		1.전체 배치 frame : BorderLayout
		frame.setLayout(new BorderLayout());
		frame.add(label, BorderLayout.NORTH);
		frame.add(textArea, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.SOUTH);
		///
//		3. 맽밑에 컴포넌트 배치
//		panel에 textField, button1, button2 add
		panel.add(textfield);
		panel.add(button);
//		4. 컴포넌트 인테리어

		label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
		label.setOpaque(true); // 투명도 설정
		label.setBackground(Color.DARK_GRAY);
		label.setForeground(Color.LIGHT_GRAY);
		textfield.setMargin(new Insets(4, 4, 4, 4)); // 여백
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.LIGHT_GRAY);

		frame.setVisible(true);
		frame.setSize(400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

//class Timer202 extends NetworkGui_View{ // 메인클라스 상속받기
//	NetworkGui_View gui;
//	SimpleDateFormat sdf;
//	long milliseconds;
//	
//	public Timer202() {
//		milliseconds = 0;
//		sdf =new SimpleDateFormat("HH:mm:ss");
//		gui = new NetworkGui_View(); gui.create();
//	}
//	
//	@Override
//	public void run() {
//		while(true) {
//			milliseconds = System.currentTimeMillis();
//			gui.label.setText(sdf.format(milliseconds)); // 라벨에 달기
//			gui.frame.repaint(); // 걸어야해~
//			try { Thread.sleep(1000); }
//			catch (InterruptedException e) { e.printStackTrace(); }			
//		}
//	}
//}
public class Network003_Server_Gui {
	public static void main(String[] args) {
		ServerSocket ascenter = null;
		Socket info = null;
		NetworkGui_View gui = new NetworkGui_View();
		gui.create();

//		1. ascenter 문열기
		try {
			ascenter = new ServerSocket(523);
			System.out.println("1.[Server] 서버준비완료");
			gui.textArea.append("1.[Server] 서버준비완료\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

//		2. 손님기다리는 중
		System.out.println("2.[Server] 연결요청기다리는 중\n");
		gui.textArea.append("2.[Server] 연결요청기다리는 중\n");

//		3. 손님들어옴
		try {
			info = ascenter.accept();
			System.out.println("4.[Server] 연결요청들어옴\n");
			gui.textArea.append("4.[Server] 연결요청들어옴\n");

//			[controller]NetworkGui_Sender - DataOutputStream
			NetworkGui_Sender sender = new NetworkGui_Sender(info, gui);
			sender.start();
//			[controller]NetworkGui_Receiver - DataInputStream			
			NetworkGui_Receiver receiver = new NetworkGui_Receiver(info, gui);
			receiver.start();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//// 말하기기능
class NetworkGui_Sender extends Thread {
	Socket info;
	NetworkGui_View gui;
	DataOutputStream out;
	SimpleDateFormat sdf;
	String who;

	public NetworkGui_Sender() {
		who = "";
		sdf = new SimpleDateFormat("HH:mm:ss");
		info = null;
		gui = null;
		out = null;
	}

	public NetworkGui_Sender(Socket info, NetworkGui_View gui) {
		this(); // 초기화
		this.info = info; // 사용자가 넘겨준 정보
		this.gui = gui; // 사용자가 넘겨준 화면
		who = (info.getPort() == 523) ? "[Client " : "[Server ";
		try {
			out = new DataOutputStream(info.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		gui.button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String message = "\n" + who + sdf.format(System.currentTimeMillis()) + "] "
							+ gui.textfield.getText() + "\n";
					out.writeUTF(message); // 상대방에게 말하기
					gui.textfield.setText(""); // textfield비우고
					gui.textArea.append(message); // 내화면에 띄우기
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		});
	}
}

//// 듣기기능 
class NetworkGui_Receiver extends Thread {
	Socket info;
	NetworkGui_View gui;
	DataInputStream in;

	public NetworkGui_Receiver() {
		info = null;
		gui = null;
		in = null;
	}

	public NetworkGui_Receiver(Socket info, NetworkGui_View gui) {
		this.info = info;
		this.gui = gui;
		try {
			in = new DataInputStream(info.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (in != null) {
			try {
				gui.textArea.append(in.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}