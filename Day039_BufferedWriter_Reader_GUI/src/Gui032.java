import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ScoreGui implements ActionListener{
	JFrame frame;
	JButton[] button;
	JPanel[] panel;
	JLabel[] label;
	JTextField[] txtfield;
	//
	public ScoreGui() {		
		frame = new JFrame(":::: FILE");
		button = new JButton[] { // 버튼 밑에 세개
								new JButton("1)성적입력"),
								new JButton("2)성적확인"),
								new JButton("3)전체성적")};
		label = new JLabel[] { // 라벨 5개
								new JLabel("ID"),
								new JLabel("JAVA"),
								new JLabel("JSP"),
								new JLabel("SPRING"),
								new JLabel("PROJECT"),
								new JLabel("JAVA SCORE", JLabel.CENTER)}; // 중앙배치
		txtfield = new JTextField[] {
								new JTextField(),
								new JTextField(),
								new JTextField(),
								new JTextField(),
								new JTextField()};
		panel = new JPanel[] {
								new JPanel(),
								new JPanel(),
								new JPanel()};		
	}

	public void create() {
//		--------------------------------------------		
//		1. 전체 레이아웃
//		--------------------------------------------		
		frame.setLayout(new GridLayout(3,2)); // 세로로 삼등분 가능
		for(int i=0; i<panel.length; i++) { frame.add(panel[i]); }
//		--------------------------------------------		
//		2. 세부 레이아웃
//		--------------------------------------------		
		panel[0].setLayout(new GridLayout());
		panel[1].setLayout(null);
		panel[2].setLayout(new GridLayout(1,3));
		panel[0].add(label[5]); // "JAVA SCORE" 가운데 위로 
//		--------------------------------------------
		for(int i=0; i<txtfield.length; i++) { panel[1].add(txtfield[i]); panel[1].add(label[i]);}
		int y=25;
		for(int i=0; i<txtfield.length; i++) {
			label[i].setBounds(10,y,150,25);	txtfield[i].setBounds(200,y,180,25);
			y+=25;
		}
//		label[0].setBounds(10,25,150,25);	txtfield[0].setBounds(200,25,180,25);
//		label[1].setBounds(10,50,150,25);	txtfield[1].setBounds(200,25,180,25);
//		label[2].setBounds(10,75,150,25);	txtfield[2].setBounds(200,25,180,25);
//		label[3].setBounds(10,100,150,25);	txtfield[3].setBounds(200,25,180,25);
//		label[4].setBounds(10,125,150,25);	txtfield[4].setBounds(200,25,180,25);
		
		for(int i=0; i<button.length; i++) {panel[2].add(button[i]);}
//		--------------------------------------------		
		//3. 인테리어 Interior
		for(int i=0; i<button.length; i++) {
			button[i].setBackground(Color.DARK_GRAY);
			button[i].setForeground(Color.LIGHT_GRAY);
		}		
		frame.setSize(500,520);
		frame.setVisible(true); // 보이게
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 꺼지는 기능
		frame.setLocationRelativeTo(null); // 가운데서 팝업		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}	
}
public class Gui032 {
	public static void main(String[] args) {
		new ScoreGui().create();
	}
}
