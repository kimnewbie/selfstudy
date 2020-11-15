package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel{
	private Image img;

	public ImagePanel(Image img) {
		this.img = img; // 이미지를 밖에서 사용할 수 있도록 생성자에 써줌
//		setSize(new Dimension(img.getWidth(null),img.getHeight(null))); // 패널의 사이즈가 자동으로 사진 크기에 맞게 됨
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	public void paintComponent (Graphics g) { // 백그라운드 이미지 넣는 것
		g.drawImage(img,0,0,null);
	}
}
public class Lesson008_ImagePanel {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Don Spike's Steak");
//		frame.setSize(640, 480); // 생성자에 한번만 써줘도 됨
//		frame.setPreferredSize(new Dimension(600,460)); // 생성자에 한번만 써줘도 됨
		frame.setLocationRelativeTo(null); // 창 가운데에 뜨게
		frame.setVisible(true);
		
		ImagePanel panel = new ImagePanel(new ImageIcon("./image/steak.jpg").getImage());
		frame.add(panel);
		frame.pack(); // 이게 없으면 화면창이 안나옴
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
