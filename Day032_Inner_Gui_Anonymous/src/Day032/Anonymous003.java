package Day032;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class AnonyEvent003 implements ActionListener{ //##001. 액션인터페이스 사용
	JFrame frame;
	JButton button;
	public AnonyEvent003() { frame = new JFrame(); button = new JButton(); }
	public void createGraphic() {
		button.setPreferredSize(new Dimension(250,100));
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.PINK);
		button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
		button.setText("COUNT");
		////////////////////////////////////////
		frame.setLayout(new FlowLayout());
		frame.add(button);
		frame.setSize(300,150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//##002. 버튼에 이벤트걸기
		button.addActionListener(this); // this = AnonyEvent003
	}
	@Override //##003. EventHandler:해결사
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "클릭");
		
	}	
}
public class Anonymous003 {
	public static void main(String[] args) {
		System.out.println("위의 EventHandler를 익명 클래스(Anonymous Class)로 변경하시오");
		new AnonyEvent003().createGraphic();
	}
}
