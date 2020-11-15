package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Lesson002_Panel {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Some text"); // 글자표시기능만
		JButton btn1 = new JButton("Click me!");		
		JTextArea txtArea = new JTextArea(); // 많은 양의 글을 쓰고 싶을 때 사용
		JTextField txtField = new JTextField(200); // 사용할 때 꼭 숫자를 넣어야해
		
		panel.setLayout(new BorderLayout()); //BorderLayout 원하는 위치에 이동가능
		panel.add(label, BorderLayout.NORTH);
		panel.add(btn1, BorderLayout.WEST);
		panel.add(txtArea, BorderLayout.CENTER);

		frame.add(panel);

		frame.setResizable(false);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}