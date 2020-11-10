package Day033_GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Gui008 implements ActionListener{ //##001 interface
	
	JFrame frame;
	JButton[] btns;
	public Gui008() {
		frame = new JFrame("YJ COFFEE");
		btns = new JButton[] {new JButton("ONE"),new JButton("TWO"),new JButton("THREE"),new JButton("FOUR"),new JButton("FIVE")}; //JButton 배열을 넣는다.
	}
	public void create() {
		frame.setLayout(new FlowLayout());
		for(int i=0; i<btns.length; i++) {
			btns[i].setBackground(Color.DARK_GRAY);
			btns[i].setForeground(Color.PINK);
			btns[i].setPreferredSize(new Dimension(100,100));
			btns[i].addActionListener(this); // ##002 이벤트대상 : 버튼 / 이벤트 : ActionListener
		}
		for(int i=0; i<btns.length; i++) { frame.add(btns[i]);}
			frame.setSize(1000,200);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false); // 크기조절못하게
			frame.setLocationRelativeTo(null); // 가운데 팝업
	}	
	@Override
	public void actionPerformed(ActionEvent e) { // ##003 이벤트핸들러
		System.out.println(e);
		if(e.getSource().equals(this.btns[0])) {JOptionPane.showMessageDialog(null,this.btns[0].getText() );} // 클릭했을 때 버튼 이름인 ONE 출력
		else if(e.getSource().equals(this.btns[1])) {this.btns[1].setBackground(Color.GREEN);}
		else if(e.getSource().equals(this.btns[2])) {this.btns[2].setBackground(Color.BLUE); this.btns[2].setText("파랑");}
		else if(e.getSource().equals(this.btns[3])) {this.btns[3].setBackground(Color.RED); this.btns[3].setText("빨강");}
		else if(e.getSource().equals(this.btns[4])) {this.btns[4].setBackground(Color.GRAY); this.btns[4].setText("회색");}
		
	}
}
public class EVENT002 {
	public static void main(String[] args) {
		new Gui008().create();
	}
}
