package Day032;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class Gui003{
	JFrame frame; //java.lang.Object <-- java.awt.Component <-- java.awt.Container <-- java.awt.Window <-- java.awt.Frame <-- javax.swing.JFrame
	JButton button1, button2, button3;
	
	public Gui003() {
		frame = new JFrame("BOX");
		//배치관리자가 필요하다. THREE마지막 버튼밖에 보이지 않아서 나머지가 보여야됨
		frame.setLayout(new FlowLayout()); // container위에 component들을 올릴 때 자리 배치 방법
		button1 = new JButton("ONE");
		button2 = new JButton("TWO");
		button3 = new JButton("THREE");
	}
	public void create() {
		frame.add(button1); frame.add(button2); frame.add(button3);
		frame.setSize(600,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

public class Gui003_Layout {
	public static void main(String[] args) {
		new Gui003().create();
	}
}
