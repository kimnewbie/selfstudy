package Day034;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class GuiEvent {
	JFrame frame;
	JButton[] button;
	public GuiEvent() {
		frame = new JFrame("BOX");
		button = new JButton[] {new JButton("ONE"),new JButton("TWO"),new JButton("THREE"),new JButton("FOUR"),new JButton("FIVE")};
	} // end constructor
	public void create() {
		frame.setLayout(new FlowLayout());
		for(int i=0; i<button.length; i++) {
			button[i].setBackground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256))); //2^8=256 | 0~255 컬러 색
			button[i].setForeground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256))); //2^8=256 | 0~255 컬러 색
			button[i].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
			button[i].setPreferredSize(new Dimension(100,100));
			button[i].addActionListener(new ActionListener() { // 누르는 숫자마다 다 나오게
				@Override public void actionPerformed(ActionEvent e) {
					for(int i=0; i<button.length; i++) { // 포문 다시 입히기
					if(e.getSource().equals(button[i])) {JOptionPane.showMessageDialog(null, button[i].getText()); break;}
//					JOptionPane.showMessageDialog(null, "TWO");					
				}}			
			});
		}
		
		for(int i=0; i<button.length; i++) {frame.add(button[i]);}
		frame.setSize(600,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false); // 크기조절못하게
		frame.setLocationRelativeTo(null); // 가운데 팝업
	}	
}
public class Day034_2_GuiEvent5Buttons {
	public static void main(String[] args) {	
		new GuiEvent().create();
	}
}