import javax.swing.*;
class Jtable{
	JFrame frame;
	JTable jtable;
	Object[] columnNames;
	Object[][] rowData;
	JScrollPane jscrollPane;
	
	public Jtable() {
		frame = new JFrame("JTable 예제");
		columnNames = new String[] {"NO","NAME","PRICE","DESC"};
		rowData = new Object[][] {
									{1,"WHITE",1000,"우유는 하얗다"},
									{2,"CHOCO",1200,"초코는 검하다"},
									{3,"BANANA",1300,"바나나는 노랗다"}
		};
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
public class Jtable002 {
	public static void main(String[] args) {
		new Jtable().create();
	}
}
