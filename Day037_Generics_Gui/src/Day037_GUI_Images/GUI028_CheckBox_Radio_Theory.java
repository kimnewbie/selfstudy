package Day037_GUI_Images;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class Gui028 implements ActionListener{
	JFrame frame;
	JLabel[] label;
	JPanel[] panel;
	JCheckBox[] checkbox;
	JRadioButton[] radio;
	ButtonGroup group;
	public Gui028() {
		frame = new JFrame("CHECKBOX(다중선택)+RADIO(단일선택)");
		label = new JLabel[] {new JLabel("CHECKBOX"),new JLabel("RADIO")};
		checkbox = new JCheckBox[] {new JCheckBox("JAVA", false),new JCheckBox("JSP", false),new JCheckBox("SPRING", false)};
		radio = new JRadioButton[] {new JRadioButton("이메일 수신에 동의합니다.", false),
									new JRadioButton("이메일 수신에 동의합니다.", false)};
		panel = new JPanel[] {new JPanel(new GridLayout(3,1)),new JPanel(new GridLayout(2,1)),};
	}
	public void create() {
		/*	1	2 [checkbox,checkbox]		
		 	3	4*/
		frame.setLayout(new GridLayout(2,2));
		
		panel[0].add(checkbox[0]); panel[0].add(checkbox[1]); panel[0].add(checkbox[2]);
		panel[1].add(radio[0]); panel[1].add(radio[1]);
		
		frame.add(label[0]); frame.add(panel[0]);	// frame.add(checkbox); 에러나는 이유는? 컴포넌트가 아니라 묶음이라 Panel 사용해야해
		frame.add(label[1]); frame.add(panel[1]);		// frame.add(radio); 에러나는 이유는? 컴포넌트가 아니라 묶음이라 Panel 사용해야해
		frame.setVisible(true);
		frame.setSize(400,300);
		for(int i=0; i<checkbox.length; i++) {checkbox[i].addActionListener(this);}
		for(int i=0; i<radio.length; i++) {radio[i].addActionListener(this);}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
		
//		for(int i=0; i<checkbox.length; i++) {
//			checkbox[i].addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					for(int i=0; i<checkbox.length; i++) {
//					if(e.getSource().equals(checkbox[i])) {JOptionPane.showMessageDialog(null, checkbox[i].getText()+"를 선택했습니다.");}
//					}
//				}
//				
//			});
//		}			
			
	@Override public void actionPerformed(ActionEvent e) { 
		for(int i=0; i<checkbox.length; i++) {
			if(e.getSource().equals(checkbox[i])) {JOptionPane.showMessageDialog(null, checkbox[i].getText()+"를 선택했습니다.");}
		}
		if(e.getSource().equals(radio[0])) {radio[1].setSelected(false);} // radio 중복안되게
		else if(e.getSource().equals(radio[1])) {radio[0].setSelected(false);}
	}

}	

public class GUI028_CheckBox_Radio_Theory {
	public static void main(String[] args) {
		new Gui028().create();
	}
}
