import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class T_EX_GUI implements MouseListener {
	JFrame frame; JTable table; Object[] col; Object[][] row;
	JScrollPane scroll; DefaultTableModel model;
	JPanel panel; JButton button; 
	static int cnt = 0;
	
	
	T_EX_GUI(){
		panel = new JPanel();
		button = new JButton("ADD");
		frame =new JFrame("EventText001");
		col = new String[] {"NO","NAME","PRICE"};
		row = new String[][] {
								{"1","red","1000"},
								{"2","green","1200"},
								{"3","blue","1300"}
		};
		model = new DefaultTableModel(row,col) {
			public boolean isCellEditable(int row, int column) {return false;}
		}; // 프레임 글자 화면에서 추가 못하도록
		table = new JTable(model);
		scroll = new JScrollPane(table);
		this.create();
		
	}
	public void create() {
		frame.setVisible(true);
		frame.setSize(400,200);
		frame.add(scroll);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // 가운데서 팝업	
		frame.setLayout(null);
		frame.add(panel);
		panel.setLayout(new FlowLayout());
		panel.setBounds(0,0,390,130);
//		panel.setPreferredSize(new Dimension(380,140));
		panel.add(scroll);
		scroll.setPreferredSize(new Dimension(380,140));
		table.addMouseListener(this);
		frame.add(button, BorderLayout.SOUTH);
		button.setBounds(0,140,395,20);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String input = JOptionPane.showInputDialog("테이블에 추가 데이터 예)green,1200");
				System.out.println(input);
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				System.out.println(row+"\t"+col);
			}
			
		});
	}
	public void mouseClicked(MouseEvent e) {
		int row = table.getSelectedRow();
		int col = table.getSelectedColumn();
		JOptionPane.showMessageDialog(null, model.getValueAt(row, col));
	}
		@Override public void mouseEntered(MouseEvent arg0) { }
		@Override public void mouseExited(MouseEvent arg0) {}
		@Override public void mousePressed(MouseEvent arg0) {}	
		@Override public void mouseReleased(MouseEvent arg0) {}
		public void actionPerformed(ActionEvent e) {
			String[] temp = new String[] {Integer.toString(++cnt),"",""};
			String input = JOptionPane.showInputDialog("테이블에 추가데이터 예)green,1200");
			String[] in = input.split(",");
			System.arraycopy(in, 0, temp, 1, in.length);
			model.insertRow(cnt-1, temp);
			table.updateUI();
		}
}
public class Thread006 {

	public static void main(String[] args) {
		new T_EX_GUI();
	}
}
