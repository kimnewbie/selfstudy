import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ChattingGUI extends Thread{
	JFrame frame;
	JLabel label;
	JTextArea textArea;
	JTextField textfield;
	JButton[] button;
	JPanel panel;
	
	public ChattingGUI() {
		frame = new JFrame();
		label = new JLabel("",JLabel.RIGHT);
		textArea = new JTextArea();
		textfield = new JTextField(20);
		panel = new JPanel();
		button = new JButton[]{new JButton("전송"),new JButton("닫기")};
	}
	public void create() {
//		1.전체 배치 frame : BorderLayout
		frame.setLayout(new BorderLayout());
//		2.각층마다 배치확인
//		맨위 - label frame에 label add 하기(BorderLayout.NORTH) 
		frame.add(label, BorderLayout.NORTH);
//		중간 - textarea frame에 textarea add 하기(BorderLayout.CENTER)
		frame.add(textArea, BorderLayout.CENTER);
//		맨밑 - panel에 frame에 panel add 하기(BorderLayout.SOUTH)
		frame.add(panel, BorderLayout.SOUTH);
//		3. 맽밑에 컴포넌트 배치
//		panel에 textField, button1, button2 add
		panel.add(textfield); panel.add(button[0]); panel.add(button[1]);
//		4. 컴포넌트 인테리어
		label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
		label.setOpaque(true); // 투명도 설정
		label.setBackground(Color.DARK_GRAY);
		label.setForeground(Color.LIGHT_GRAY);
		textfield.setMargin(new Insets(4,4,4,4)); // 여백
		for(int i=0; i<button.length; i++) {
			button[i].setBackground(Color.DARK_GRAY);
			button[i].setForeground(Color.LIGHT_GRAY);
		}		
		frame.setVisible(true);
		frame.setSize(400,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		5. 버튼연결
		button[0].addActionListener(new ActionListener() {

			@Override public void actionPerformed(ActionEvent e) {
				String msg = textfield.getText();
				textfield.setText("");
				textArea.append("[김유진] "+msg+"\n");
			}
			
		});
		button[1].addActionListener(new ActionListener() { // 닫기버튼 누르면 닫힘
			@Override public void actionPerformed(ActionEvent e) { frame.dispose(); } 
		});
	}	
}
class TimerFunc extends ChattingGUI{ // 메인클라스 상속받기
	ChattingGUI gui;
	long milliseconds;
	SimpleDateFormat sdf;
	
	public TimerFunc() {
		milliseconds=0;
		sdf = new SimpleDateFormat("HH:mm:ss");
		gui = new ChattingGUI(); gui.create();
	}
	
	@Override
	public void run() {
		while(true) {
			milliseconds = System.currentTimeMillis();
			gui.label.setText(sdf.format(milliseconds)); // 라벨에 달기
			gui.frame.repaint(); // 걸어야해~
			try { Thread.sleep(1000); }
			catch (InterruptedException e) { e.printStackTrace(); }			
		}
	}
}
public class NetworkChattingGUI {
	public static void main(String[] args) {
		new TimerFunc().start();
	}
}
