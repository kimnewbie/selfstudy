package Day034;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Gui019 implements ActionListener{
	JFrame frame;
	JButton button;
	JPanel panel;
	JLabel label;
	int cnt = 1; // 1부터 시작 btn누르면 count
	
	public Gui019() {
		frame = new JFrame();
		button = new JButton("BTN");
		label = new JLabel("PANEL");
		panel = new JPanel();
	}
	public void create() {
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.GRAY);
		////////////////////////////////////////
		panel.setLayout(new BorderLayout());
		panel.add(label);
//		panel.add(button);		
		////////////////////////////////////////
		frame.setLayout(new BorderLayout());
		frame.add(panel);
//		frame.add(label); panel로 넣어줌
//		frame.add(button); 라벨 밑에 써주면 안먹혀서 panel.add로 해줌
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button, BorderLayout.SOUTH); // 버튼 맨 밑으로 보내기
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText("PANEL" + cnt);
		panel.add(label);
		cnt++;
	}	
}
public class Gui019_Event {
	public static void main(String[] args) {
		new Gui019().create();
	}
}
