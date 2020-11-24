import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.TextArea;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class TimerGui extends Thread{
	JFrame frame;
	JLabel label;
	TextArea textArea;
	JPanel panel;
	JTextField textfield;
	JButton[] button;
	//
	public TimerGui() {
		frame = new JFrame("[JAVA TALK!]");
		label = new JLabel("00시 00분 00초", JLabel.RIGHT);
		textArea = new TextArea();
		panel = new JPanel(new FlowLayout());
		textfield = new JTextField(20);
		button = new JButton[] {new JButton("전송"),new JButton("닫기")};
	}
	//
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
		frame.setSize(400,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
}
class TimerFunc extends TimerGui{ // 메인클라스 상속받기
	TimerGui gui;
	
	public TimerFunc() {
		gui = new TimerGui(); gui.create();
	}
	
	@Override
	public void run() {
		while(true) {
			Calendar today = Calendar.getInstance();
			gui.label.setText(today.get(Calendar.HOUR_OF_DAY)+"시 "+today.get(Calendar.MINUTE) + 
					"분 " + today.get(Calendar.SECOND) + "초");
			gui.frame.repaint(); // 걸어야해~
//			화면 업데이트 repaint. 업데이트 메서드를 호출해줌
//			화면이 자동 갱신되기때문에 화면에 남아있던 그래픽 요소는 다 사라짐
			try { Thread.sleep(1000); }
			catch (InterruptedException e) { e.printStackTrace(); }
			
		}
	}
}
public class Thread009_Timer_answer {
	public static void main(String[] args) {
//		1. GUI
//		new TimerGui().create();
//		2. TIMER FUNC
//		new TimerFunc().start();
//		3. GUI + TIMER
		new TimerFunc().start();
	}
}
