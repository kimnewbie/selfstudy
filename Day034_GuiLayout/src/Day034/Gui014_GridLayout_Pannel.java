package Day034;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class Gui014{
	JFrame frame;
	JButton[] button;
	JPanel panel;	// 버튼 배치할 때 중간에 두개로 나누기 위해서 필요해~
	
	public Gui014() {
		frame = new JFrame("BOX");
		button = new JButton[] {new JButton("ONE"),new JButton("TWO"),new JButton("THREE"),
				new JButton("FOUR"),new JButton("FIVE"),new JButton("SIX")};
		panel = new JPanel();
	} // end constructor
	
	public void create() {
		for(int i=0; i<button.length; i++) {
			button[i].setBackground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256))); //2^8=256 | 0~255 컬러 색
			button[i].setForeground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256))); //2^8=256 | 0~255 컬러 색
			button[i].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
			button[i].setPreferredSize(new Dimension(100,100));
			button[i].addActionListener(new ActionListener() { // 누르는 숫자마다 다 나오게
				@Override public void actionPerformed(ActionEvent e) {
					for(int i=0; i<button.length; i++) { // 포문 다시 입히기
					if(e.getSource().equals(button[i])) {JOptionPane.showMessageDialog(null, button[i].getText()); break;}}}			
			});
		}
		panel.setLayout(new FlowLayout()); // ## 추가
		panel.add(button[4]);
		panel.add(button[5]);
		frame.setLayout(new BorderLayout());
		frame.add(button[0], BorderLayout.NORTH);
		frame.add(button[1], BorderLayout.EAST);
		frame.add(button[2], BorderLayout.SOUTH);
		frame.add(button[3], BorderLayout.WEST);
		frame.add(panel, BorderLayout.CENTER);  // ## 추가
//		frame.add(button[4], BorderLayout.CENTER);
//		frame.add(button[5], BorderLayout.CENTER); // 센터가 2개가 되지 않아~
		frame.setSize(600,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // 가운데 팝업
	}	
}
public class Gui014_GridLayout_Pannel {
	public static void main(String[] args) {
		new Gui014().create();
	}
}
