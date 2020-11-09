package Day032;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Gui001 { //extends WindowAdapter 이러면 상속 못받아서 어나너머스 익명 
	//멤버변수
	Frame frame; // ctrl+shift+o import 해줘야 Frame의 오류가 사라짐
	Button button; // ctrl+shift+o import 해줘야 Button의 오류가 사라짐
	
	//생성자	
	public Gui001(Frame frame, Button button) {
		super();
		this.frame = frame;
		this.button = button;
	}

	public Gui001() {
		frame = new Frame("BOX"); //Frame​(String title)  Constructs a new, initially invisible Frame objectwith the specified title.
		button = new Button("BTN1"); //Button​(String label)  Constructs a button with the specified label.
	}
	
	//멤버함수
	public void create() {
		// 1.프레임.add(컴포넌트) --> 다형성[부모는 자식을 담을 수 있다] java.lang.Object <-- java.awt.Component <--java.awt.Button
		frame.add(button);
		// 2.프레임.setSize 사이즈지정
		frame.setSize(300, 300);
		// 3.프레임.setVisible
		frame.setVisible(true); // 화면으로 보여줄게~
		// 이벤트대상(frame).이벤트(해결사:Event Handler:~이렇게 처리해줄게)
		frame.addWindowListener(new WindowListener(){

			@Override public void windowActivated(WindowEvent arg0) {  }
			@Override public void windowClosed(WindowEvent arg0) {  }
			@Override public void windowClosing(WindowEvent arg0) { System.exit(0); } // 0은 상수의미 
			@Override public void windowDeactivated(WindowEvent arg0) {  }
			@Override public void windowDeiconified(WindowEvent arg0) {  }
			@Override public void windowIconified(WindowEvent arg0) {  }
			@Override public void windowOpened(WindowEvent arg0) {  } // abstract라서 구현해줘야해
			
		});
	}
	
}
public class Gui001_awt {
	public static void main(String[] args) {
		new Gui001().create(); // 만했더니 창이 안닫힘(작업관리자에서 꺼줘야해..) BTN1 이란 글씨가 적힌 게 나옴
	}
}
