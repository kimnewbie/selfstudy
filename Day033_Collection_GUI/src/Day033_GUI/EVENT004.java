package Day033_GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class EVENT022 implements ActionListener{ //##001 interface
	
	JFrame frame;
	JButton btn;
	JLabel label;
	JTextField field;
	
	public EVENT022() {
		frame = new JFrame("YJ COFFEE");
//		label = new JLabel("주문한 우유 이름을 적으시오"); 도 가능한데 정렬하고 싶으면 밑에!
		label = new JLabel("주문한 우유 이름을 적으시오", JLabel.CENTER); // 중앙정렬
		field = new JTextField("예) white", 15); // 뒤에 길이
		btn = new JButton("CLICK");
	}
	
	void create() {

		btn.setBackground(Color.BLACK);
		btn.setForeground(Color.CYAN);
		btn.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
		btn.addActionListener(this); // 이거 없으면 JOptionPane 안나와~
		//////////////////////////////////////////////
//		frame.setLayout(new FlowLayout());
		frame.setLayout(new GridLayout()); // 표로 바뀐다.
		frame.add(label);
		frame.add(field);
		frame.add(btn);
		frame.setSize(600,150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//////////////////////////////////////////////
		label.getText();
	}
	//##002. 버튼에 이벤트걸기
			//이벤트대상.이벤트
	@Override	
	public void actionPerformed(ActionEvent e) {
		field.setText(this.field.getText()+" MILK~!");
	}
}
public class EVENT004 {
	public static void main(String[] args) {
		new EVENT022().create();
	}
}
