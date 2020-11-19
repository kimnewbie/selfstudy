import javax.swing.JFrame;
import javax.swing.*;
/*
	column1	column2
		no	name
		1	red		rowdata1
		2	green	rowdata2
		3	blue	rowdata3
*/
class Gui037{
	JFrame frame;
	JTable jtable;	
	Object[] columnNames;
	Object[][] rowData;
	JScrollPane jscrollPane;
	
	public Gui037() {
		frame = new JFrame(":::: Jjtable 예제");
		columnNames = new String[] {"NO","NAME"};
		rowData = new Object[][] {{1,"red"},{2,"green"},{3,"blue"}};
		jtable = new JTable(rowData, columnNames);
		jscrollPane = new JScrollPane(jtable);
	}

	public void create() {
		frame.add(jscrollPane);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class Gui037_JTable {
	public static void main(String[] args) {
		new Gui037().create();
	}
}
