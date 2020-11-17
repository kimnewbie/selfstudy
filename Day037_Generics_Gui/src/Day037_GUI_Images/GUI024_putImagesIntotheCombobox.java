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

class Gui024{
	JFrame frame;
	JLabel label;
	ImageIcon[] images;
	JComboBox<String> combobox;			String[] items;
	JPanel panel;
	
	public Gui024(){
		frame = new JFrame("COMBOBOX");
		items = new String[] {"네오","무지와콘","제이지"};
		combobox = new JComboBox<String>(items);
		images = new ImageIcon[] {
				new ImageIcon("images/neo.png"),
				new ImageIcon("images/muzi.png"),
				new ImageIcon("images/jayZ.png"),
		};
		label = new JLabel(images[0]); // 초기값 [0] 안정해주면 다른 곳 다녀와야 보임
		panel = new JPanel();
	}
	
	public void create() {
		frame.setLayout(new BorderLayout());
		frame.setSize(400,400);
		frame.add(label,BorderLayout.CENTER); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(new FlowLayout()); // 그림을 가운데 정렬시키기 위해서 panel
		panel.add(combobox);
		frame.add(panel,BorderLayout.NORTH);
		combobox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<Object> cb = (JComboBox)e.getSource(); // 동작이 일어날 소스를 JComboBox 형태로 받습니다.
				int index = cb.getSelectedIndex(); //  int 타입 index를 선언하고 콤보박스에서 선택된 번호 값으로 저장합니다.
				label.setIcon(images[index]); // label에 image[index]를 불러옵니다.
			}			
		});
	}
}

public class GUI024_putImagesIntotheCombobox {
	public static void main(String[] args) {
		new Gui024().create();
	}
}
