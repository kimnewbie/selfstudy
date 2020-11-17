package Day037_GUI_Images;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Gui024_{
	JFrame frame;
	JLabel label;
	ImageIcon[] images;
	JComboBox<String> combobox;			String[] items;
	
	public Gui024_(){
		frame = new JFrame("COMBOBOX+IMAGES");
		items = new String[] {"네오","무지와콘","제이지"};
		combobox = new JComboBox<String>(items);
		images = new ImageIcon[] {
				new ImageIcon("images\\neo.png"), // \\ 백슬러시도 사용 가능
				new ImageIcon("images/muzi.png"),
				new ImageIcon("images/jayZ.png"), };
		label = new JLabel(images[0]); // 초기값 [0] 안정해주면 다른 곳 다녀와야 보임
	}
	
	public void create() {
		frame.setLayout(new FlowLayout());
		frame.add(combobox); frame.add(label);
		frame.setSize(200,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		combobox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(combobox)) {label.setIcon(images[combobox.getSelectedIndex()]);}
			}			
		});
	}
}

public class GUI024_answer {
	public static void main(String[] args) {
		new Gui024_().create();
	}
}
