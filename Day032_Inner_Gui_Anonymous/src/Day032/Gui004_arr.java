package Day032;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Gui004{
	JFrame frame; //java.lang.Object <-- java.awt.Component <-- java.awt.Container <-- java.awt.Window <-- java.awt.Frame <-- javax.swing.JFrame
	JButton[] button;
	
	public Gui004() {
		frame = new JFrame("BOX");
		 // container위에 component들을 올릴 때 자리 배치 방법
		button = new JButton[] {new JButton("ONE"),new JButton("TWO"),new JButton("THREE")}; //JButton 배열을 넣는다.
//		button[0] = new JButton("ONE");
//		button[1] = new JButton("TWO");
//		button[2] = new JButton("THREE");
	}
	public void create() {
//		frame.add(button[0]); frame.add(button[1]); frame.add(button[2]);
		for(int i=0; i<button.length; i++) { frame.add(button[i]); }
		//배치관리자가 필요하다. THREE마지막 버튼밖에 보이지 않아서 나머지가 보여야됨
		frame.setLayout(new FlowLayout());
		frame.setSize(600,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class Gui004_1{
	JFrame frame; 
	JButton[] button;
	String[] names;
	
	public Gui004_1() {
		frame = new JFrame("BUTTONS-ARR");
		button = new JButton[4];
		names = new String[] {"ONE","TWO","THREE","FOUR","FIVE"};
		
//		button[0] = new JButton(names[0]);
		for(int i=0; i<names.length; i++) { button[i]= new JButton(names[i]); }
		
	}
	public void create() {
		//배치관리자가 필요하다. THREE마지막 버튼밖에 보이지 않아서 나머지가 보여야됨
		frame.setLayout(new FlowLayout());
//		frame.add(button[0]); frame.add(button[1]); frame.add(button[2]);
		for(int i=0; i<button.length; i++) { frame.add(button[i]); }		
		frame.setSize(600,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}
public class Gui004_arr {
	public static void main(String[] args) {
		new Gui004().create();
		new Gui004_1().create();
	}
}
