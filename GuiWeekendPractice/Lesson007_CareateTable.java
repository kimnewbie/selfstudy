package GUI;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Lesson007_CareateTable {
	public static void main(String[] args) {
		JFrame frame = new JFrame ("Table Prac");
		JPanel panel = new JPanel();
		String[] headings = new String[] {"ID","NAME","COUNTRY"};
		Object[][] data = new Object[][] {
			{"1","Youjin","Korea"},
			{"2","Sunny","France"},
			{"3","John","Japan"}
		};
		JTable table = new JTable(data,headings);
		table.setPreferredScrollableViewportSize(new Dimension(700,600)); // setPreferredScrollableViewportSize - Dimension
		
		table.setFillsViewportHeight(true); // setVisible과 비슷한 기능
		
//		panel.add(table); // 패널에 테이블추가
		panel.add(new JScrollPane(table)); // 테이블 열 위치변경, 사이즈 크게 만들어줌
		
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setSize(800,640);
		frame.setLocationRelativeTo(null); // 프레임 가운데에 뜨기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
