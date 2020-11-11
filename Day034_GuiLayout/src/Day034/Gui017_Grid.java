package Day034;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class Gui017{
	JFrame frame;
	JButton[] button;
	
	public Gui017() {
		frame = new JFrame("Grid");
		button = new JButton[5];
		for(int i=0; i<button.length; i++) {
			button[i] = new JButton("BTN"+(i+1));
		}
	}
	public void create() {
		frame.setLayout(new GridLayout(2,3)); // 표 형식, 칸들 균등하게 행 기준! 열은 넘어도 자동으로 생김
		for(int i=0; i<button.length; i++) { frame.add(button[i]); } // 버튼 5개 출력~_~
		frame.setSize(500,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
public class Gui017_Grid {
	public static void main(String[] args) {
		new Gui017().create();
	}
}
