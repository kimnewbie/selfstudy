package Day034;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Ex002_1{
	JFrame frame;
	JPanel[] panel;	// 배치 1. 글쓰기가 들어오는 곳/ 2. 글쓰기+버튼
	JTextField field; // 채팅창
	JButton btn; // 버튼
	
	public Ex002_1() {
		frame = new JFrame("[talk!]");
		panel = new JPanel[2];
		for(int i=0; i<panel.length; i++) { panel[i]= new JPanel(); }
		field = new JTextField("", 20); // 뒤에 길이
		btn = new JButton("입력");
	}
	
	public void create() {
		field.setMargin(new Insets(4,4,4,4)); //f field와 입력사이의 간격 조절
		btn.setBackground(Color.DARK_GRAY);
		btn.setForeground(Color.LIGHT_GRAY);
		//////////////////////////////////////////////
		panel[1].setLayout(new FlowLayout());
		panel[1].add(field, "입력창");
		panel[1].add(btn, "전송버튼");		
		////////////////////////////////////////////// 큰 틀인 프레임 먼저!
		frame.setLayout(new BorderLayout()); 
		frame.add(panel[0], BorderLayout.CENTER);
		frame.add(panel[1], BorderLayout.SOUTH);
		frame.setSize(400,450);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		//////////////////////////////////////////////
	}
}
public class Gui016_Chatting {
	public static void main(String[] args) {
		new Ex002_1().create();
	}
}
