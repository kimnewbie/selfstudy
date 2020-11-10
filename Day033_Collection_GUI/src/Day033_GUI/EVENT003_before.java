package Day033_GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class EVENT001 implements ActionListener{ //##001 interface
	
	JFrame frame;
	JButton btn;
	
	public EVENT001() {
		frame = new JFrame("YJ COFFEE");
		btn = new JButton("홍길동");
	}
	
	public void create() {
		frame.setLayout(new FlowLayout());
		frame.add(btn); // 버튼 1개
		frame.setSize(300,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // 가운데 팝업
		//////////////////////////////////////////////
		btn.setPreferredSize(new Dimension(250,100));
		btn.setBackground(Color.PINK);
		btn.setForeground(Color.BLACK);
		btn.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
//		btn.setText("홍길동");
		btn.addActionListener(this); // 이거 없으면 JOptionPane 안나와~
		//////////////////////////////////////////////
		
	}
	//##002. 버튼에 이벤트걸기
			//이벤트대상.이벤트
	@Override
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(frame, "Hello" + btn.getText());
		this.btn.setText("Hello" +btn.getText());
//		JOptionPane.showMessageDialog(null,this.btn.getText() ); // 클릭했을 때 버튼 이름인 ONE 출력
	}
}
public class EVENT003_before {
	public static void main(String[] args) {
		new EVENT001().create();
	}
}
