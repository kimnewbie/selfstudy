import java.awt.*;
import javax.swing.*;

public class table001 {
	public static void main(String[] args) {
		Dimension dim = new Dimension(400,150);
		
		JFrame frame = new JFrame("JTable 예제");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);
		
		String header[] = {"NO","NAME"};
		String contents[][] = {
								{"1","RED"},
								{"2","GREEN"},
								{"3","BLUE"}};
		
		JTable table = new JTable(contents, header);
		JScrollPane scrollpane = new JScrollPane(table);
		
		frame.add(scrollpane);
		
//		table.setValueAt("200", 1, 1); 이렇게 하면 자료 업데이트 가능 GREEN 자리에 200이 들어가
//		setValueAt(바꿀데이터,세로인덱스,가로인덱스)
//		System.out.println(table.getValueAt(1, 1));
		
		frame.pack();
		frame.setVisible(true);		
	}
}
