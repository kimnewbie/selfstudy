package Day033_GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Gui001{
	
	JFrame frame;
	JButton[] button;
	public Gui001() {
		frame = new JFrame("YJ COFFEE");
		button = new JButton[] {new JButton("커피주문"),new JButton("메뉴보기"),new JButton("회원가입"),new JButton("카드정보"),new JButton("고객센터")}; //JButton 배열을 넣는다.
	}
	public void create() {
		//배치관리자가 필요하다. THREE마지막 버튼밖에 보이지 않아서 나머지가 보여야됨
		frame.setLayout(new FlowLayout());
		//버튼 추가
		for(int i=0; i<button.length; i++) {frame.add(button[i]);}
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,200);
		frame.setLocationRelativeTo(null); // size뒤에 나와야 가운데에서 팝업(왜지?)
		frame.setResizable(false); // 프레임 크기 조절못하게
		/////////////////////////////////////////
		button[0].setBackground(Color.YELLOW);
		button[0].setForeground(Color.GREEN);
		button[1].setBackground(Color.BLUE);
		button[1].setForeground(Color.GREEN);
		button[2].setBackground(Color.CYAN);
		button[2].setForeground(Color.GREEN);
		button[3].setBackground(Color.LIGHT_GRAY);
		button[3].setForeground(Color.GREEN);
		button[4].setBackground(Color.BLACK);
		button[4].setForeground(Color.GREEN);
		///////////////////////////////////////////
		button[0].setPreferredSize(new Dimension(100,100));
		button[1].setPreferredSize(new Dimension(100,100));
		button[2].setPreferredSize(new Dimension(100,100));
		button[3].setPreferredSize(new Dimension(100,100));
		button[4].setPreferredSize(new Dimension(100,100));
	
		button[1].addActionListener(new ActionListener (){ //##001.(this)대신 액션인터페이스사용
			@Override
			public void actionPerformed(ActionEvent e) { //##003.EVENTHANDLER
//				System.out.println(e); 이벤트 내용 보여
				JOptionPane.showMessageDialog(null, "TWO");
//				System.out.println(e.getSource()); //toString
//				System.out.println(e.getID());
//				System.out.println(e.getClass());
//				System.out.println(e.getSource().equals(this.botton[0]));
			}		
		});		
}	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println(e);
//		System.out.println(e.getSource());
//		System.out.println(e.getSource().equals(this.button[0]));
//		if(e.getSource().equals(this.button[0])) {JOptionPane.showMessageDialog(null,this.button[0].getText() );}
//		else if(e.getSource().equals(this.button[1])) {this.button[1].setBackground(Color.GREEN);}
//		else if(e.getSource().equals(this.button[2])) {this.button[2].setBackground(Color.BLUE); this.button[2].setText("파랑");}		
//	}
}
public class EVENT002_myself {
	public static void main(String[] args) {
		new Gui001().create();
	}
}
