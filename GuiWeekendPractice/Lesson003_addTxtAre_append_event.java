package GUI;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Lesson003_addTxtAre_append_event {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Some Text");
		JButton btn1 = new JButton("Click me!");
		JButton btn2 = new JButton("Exit");
		JTextArea txtArea = new JTextArea();
		JPanel btnPanel = new JPanel();
		panel.setLayout(new BorderLayout());

		btnPanel.add(btn1);
		btnPanel.add(btn2);
		panel.add(label,BorderLayout.NORTH);
		panel.add(btnPanel,BorderLayout.WEST);
		panel.add(txtArea,BorderLayout.CENTER);

		btn1.addActionListener(new ActionListener(){ // 기능넣기

			@Override
			public void actionPerformed(ActionEvent arg0) {
				txtArea.append("You are amazing\n"); // 버튼 누를 때마다 텍스트 추가
				label.setText(txtArea.getText()); // txtArea에 글을 쓰면 라벨 위치에 표시
			}

		});

		btn2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0); // btn2를 누르면 종료해라
			}

		});

		frame.add(panel);

		frame.setResizable(false);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}