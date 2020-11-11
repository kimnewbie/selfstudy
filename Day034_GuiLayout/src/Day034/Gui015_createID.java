package Day034;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Ex001_1{
	JFrame frame;
	JButton btn;
	JLabel label;
	JTextField field; // 텍스트필드
	
	public Ex001_1() {
		frame = new JFrame("USERID");
		label = new JLabel("아이디", JLabel.CENTER); // 중앙정렬
		field = new JTextField(10); // 뒤에 길이
		btn = new JButton("입력");
	}
	
	void create() {
		field.setMargin(new Insets(5,5,5,5)); // 필드 여백
		///
		field.setPreferredSize(new Dimension(60,30)); // 필드 사이즈
		btn.setBackground(Color.BLACK);
		btn.setForeground(Color.GRAY);
		btn.setFont(new Font(Font.MONOSPACED, Font.BOLD, 13));
		btn.setPreferredSize(new Dimension(60,30));
		frame.setLayout(new FlowLayout()); // 가운데 몰려 있어라~ FlowLayout
		frame.add(label); frame.add(field); frame.add(btn); // add 라벨, 필드, 버튼
		frame.setSize(300,80);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(btn, BorderLayout.SOUTH);
		//////////////////////////////////////////////
		label.getText();	
	}
}

public class Gui015_createID {
	public static void main(String[] args) {
		new Ex001_1().create();
	}
}
