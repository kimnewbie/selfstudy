package GUI;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lesson001_Basic {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		panel.add(new JLabel("Welcome this lecture"));

		frame.add(panel);

		frame.setResizable(false); // 사이즈 고정 false
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9);
		frame.setLocationRelativeTo(null); // 위치 가운데 팝업
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}