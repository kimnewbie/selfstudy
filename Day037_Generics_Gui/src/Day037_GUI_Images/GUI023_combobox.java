package Day037_GUI_Images;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Gui023{
	JFrame frame;
	JLabel label;
	JComboBox<String> combobox;			String[] items;
	
	public Gui023(){
		frame = new JFrame("COMBOBOX");
		label = new JLabel("항목선택");
		items = new String[] {"----","ONE","TWO","THREE"};
		combobox = new JComboBox<String>(items);
	}
	
	public void create() {
		frame.setLayout(new FlowLayout());
		frame.setSize(400,200);
		frame.add(label); frame.add(combobox);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		combobox.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<items.length; i++) {
				if(combobox.getSelectedItem().toString().equals(items[i])){JOptionPane.showMessageDialog(null, items[i]);}
				}				
			}			
		});		
	}
}

public class GUI023_combobox {
	public static void main(String[] args) {
		new Gui023().create();
	}
}
