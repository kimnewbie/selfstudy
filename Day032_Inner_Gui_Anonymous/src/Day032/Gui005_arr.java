package Day032;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

class Gui005{
	JFrame frame; //java.lang.Object <-- java.awt.Component <-- java.awt.Container <-- java.awt.Window <-- java.awt.Frame <-- javax.swing.JFrame
	JButton[] button;
	
	public Gui005() {
		frame = new JFrame("BOX");
		 // container위에 component들을 올릴 때 자리 배치 방법
		button = new JButton[] {new JButton("COLOR"),new JButton("FONT"),new JButton("CURSOR"),new JButton("ENABLED"),new JButton("BTN-SIZE")}; //JButton 배열을 넣는다.
	}
	public void create() {
		//배치관리자가 필요하다. THREE마지막 버튼밖에 보이지 않아서 나머지가 보여야됨
		frame.setLayout(new FlowLayout());		
		for(int i=0; i<button.length; i++) { frame.add(button[i]); }		
		frame.setSize(600,200);
		frame.setVisible(true); // 없으면 창이 안나옴
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		////////////////////////////////////////////////////////////////
		// 1. 배경색 + 글자색 - 설정은 set 사용
		button[0].setBackground(Color.YELLOW);
		button[0].setForeground(Color.BLACK);
		button[1].setBackground(Color.BLUE);
		button[1].setForeground(Color.DARK_GRAY);
		button[2].setBackground(Color.CYAN);
		button[2].setForeground(Color.PINK);
		button[3].setBackground(Color.LIGHT_GRAY);
		button[3].setForeground(Color.CYAN);
		button[4].setBackground(Color.GREEN);
		button[4].setForeground(Color.BLACK);
		// 2. 폰트
		button[0].setFont(new Font(Font.SERIF, Font.BOLD, 20)); // new Font();
		button[1].setFont(new Font(Font.DIALOG,Font.ITALIC, 20));
		button[2].setFont(new Font(Font.SANS_SERIF,Font.ITALIC, 20)); // 문제
		//3. 커서
		button[0].setCursor(new Cursor(Cursor.WAIT_CURSOR));
		button[1].setCursor(new Cursor(Cursor.HAND_CURSOR));
		button[2].setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		button[4].setCursor(new Cursor(Cursor.MOVE_CURSOR));
		//4. 비활성화(세번째버튼 못누르게)
		button[3].setEnabled(false);		
		//5. 버튼사이즈 100*200
		button[0].setPreferredSize(new Dimension(100,120));
		button[1].setPreferredSize(new Dimension(100,120));
		button[2].setPreferredSize(new Dimension(100,120));
		button[3].setPreferredSize(new Dimension(100,120));
		button[4].setPreferredSize(new Dimension(100,120));
		//6. 프레임사이즈 수정불가하게
		frame.setResizable(false);
	}
}

public class Gui005_arr {
	public static void main(String[] args) {
		new Gui005().create();
	}
}
