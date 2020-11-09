package Day032;

import javax.swing.JButton;
import javax.swing.JFrame;

class Gui002{
	//멤버변수
	JFrame frame;
	JButton button;
	//생성자
	public Gui002() {
		frame = new JFrame("BOX");
		button = new JButton("BNT1");
	}
	//멤버함수
	public void create() {
		// 1.프레임.add(컴포넌트) 
		frame.add(button);
		// 2.프레임.setSize 사이즈지정
		frame.setSize(300, 300);
		// 3.프레임.setVisible
		frame.setVisible(true); // 화면으로 보여줄게~
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 메모리에 계속 창이 남아있어서 이걸로 꺼줌
	}
	
}
public class Gui002_Swing {
	public static void main(String[] args) {
		new Gui002().create();
	}
}
