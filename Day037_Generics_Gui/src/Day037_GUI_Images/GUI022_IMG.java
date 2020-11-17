package Day037_GUI_Images;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

//[영역 제목 + 내용 (Label / Button)] 이미지는 라벨에 꽂아줘야해 (이미지도 설명으로 본거야)
class Gui022{
	JFrame frame; // 그림 꽂기
	JLabel label;
	//생성자
	public Gui022() {
		frame = new JFrame("IMG");
		label = new JLabel( new ImageIcon ("images/amelink.jpg"));
	}
	public void create() {
		frame.add(label);
		frame.setSize(800,800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
public class GUI022_IMG {
	public static void main(String[] args) {
		new Gui022().create();
	}
}
