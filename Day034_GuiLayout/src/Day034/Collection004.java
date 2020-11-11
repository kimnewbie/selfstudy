package Day034;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class CollectionGui{
	JFrame frame; // 기본틀, 전체박스
	JPanel[] panel; // 칸 나누기 [1층,2층,3층]
	JButton[] btn; // ADD/GET/REMOVE/SHOW-ALL
	JLabel label; // COLLECTION
	JTextField field; // 가운데
	String[] btname;
	
	public CollectionGui() {
		frame = new JFrame(); //[전체틀]
		panel = new JPanel[3]; //[1층,2층,3층]
		for(int i=0; i<panel.length; i++) { panel[i] = new JPanel(); } // 패널이 늘어날거같아서 
		label = new JLabel("COLLECTION", JLabel.CENTER); //[1층손님]
		field = new JTextField(); //[2층손님]
		btn = new JButton[4]; //[3층손님]
		for(int i=0; i<btn.length; i++) { btn[i] = new JButton(); } // 버튼이 늘어날거같아서 
		btname = new String[] {"ADD","GET","REMOVE","SHOW-ALL"};
		for(int i=0; i<btn.length; i++) { btn[i] = new JButton(btname[i]); }		
	}
	
	public void create(){
		//전체 레이아웃(3층1칸)
		frame.setLayout(new GridLayout(3,1));
		for(int i=0; i<panel.length; i++) { frame.add(panel[i]); }
		//세부레이아웃 -1층 (panel[0] - label)
		panel[0].setLayout(new GridLayout());
		panel[0].add(label, BorderLayout.CENTER);
		panel[0].setBackground(Color.BLACK);
		label.setForeground(Color.LIGHT_GRAY); // panel안 collection은 label이므로 색 변경
		// 세부레이아웃 - 2층 (panel[1] - textField)
		panel[1].setLayout(new GridLayout());
		panel[1].add(field);
		// 세부레이아웃 - 3층 (panel[2] - btn)
		panel[2].setLayout(new GridLayout(4,1)); // 3번째꺼에 4개의 버튼을 넣어야해 4층1칸
		for(int i=0; i<btn.length; i++) { panel[2].add(btn[i]);} // 3번째 panel에 버튼을 넣어
		
		label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		field.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		

		field.setMargin(new Insets(10,10,10,10)); //여백
		for(int i=0; i<btn.length; i++) {
			btn[i].setBackground(Color.BLACK);
			btn[i].setForeground(Color.MAGENTA);
			btn[i].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		}		
		frame.setSize(600,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}	
}
class Collection_Using {
	Vector model; // Vector<string> vec;
	CollectionGui gui; // 클래스를 변수화
	
	public Collection_Using() {
		model = new Vector(); // vector생성
		gui = new CollectionGui();
		gui.create(); // 생성자에 함수 넣기
		gui.btn[0].addActionListener(new ActionListener() { // 메서드라서 함수를 넣어줌 이벤트
			@Override
			public void actionPerformed(ActionEvent e) {
				if(gui.field.getText().equals("")) {JOptionPane.showMessageDialog(null, "빈칸입니다. \t확인해주세요");}	
				else {model.add(gui.field.getText()); // Text안에 있는 것을 model에 입력값 저장
				JOptionPane.showMessageDialog(null, gui.field.getText()+" 추가했습니다~");}
			}			
		});
		gui.btn[1].addActionListener(new ActionListener() { // Get - String!이 리턴값이어서 int로 받아줘야하는 부분
			@Override
			public void actionPerformed(ActionEvent e) {
				if(gui.field.getText().equals("")) {JOptionPane.showMessageDialog(null, "원하는 단어의 번호를 입력해주세요.");}	
				else{JOptionPane.showMessageDialog(null, model.get(Integer.parseInt(gui.field.getText())));} 
			}			
		});
		gui.btn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(gui.field.getText().equals("")) {JOptionPane.showMessageDialog(null, "원하는 단어의 번호를 입력해주세요.");}	
				else{model.remove(Integer.parseInt(gui.field.getText())); // String이라서 int형으로 바꿔야해
				JOptionPane.showMessageDialog(null, model);}
			}			
		});
		gui.btn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<model.size(); i++) {
					JOptionPane.showMessageDialog(null, "["+i+"]"+model.get(i));
				}
			}			
		});		
	}
//		public void actionPerformed(ActionEvent e){
//			if(e.getSource().equals(gui.btn[0])){
//				//1.빈칸검사
//				String userinput = gui.field.getText();				
//				//2. 사용자가 입력하면 입력한 값 가져오기
//				if(userinput.equals("")){
//					JOptionPane.showMessageDialog(null, "빈칸입니다.");
//					gui.field.requestFocus(); // 커서가기;
//					return;
//				}else {
//				//3. model(Vector)에 데이터 삽입
//					model.add(userinput);
//					JOptionPane.showMessageDialog(null, "을 추가했습니다.");}
//				//4. 입력한 창 데이터 지우기
//				gui.field.setText("");
//			}else if(e.getSource().equals(gui.btn[1])){
//			
//	}	}
}
public class Collection004 {
	public static void main(String[] args) {
		System.out.println("\n[ver-1] GUI확인");
		new CollectionGui().create();
//		System.out.println("\n[ver-2] MODEL확인 : add, get, size, remove");
		Collection_Using modelTest = new Collection_Using();
//		//add
//		modelTest.model.add("white"); modelTest.model.add("choco"); System.out.println(modelTest.model);
//		//get
//		System.out.println(modelTest.model.get(0));
//		//size
//		System.out.println(modelTest.model.size());
//		//remove
//		modelTest.model.remove("white"); System.out.println(modelTest.model);
//		//size + for
//		for(int i=0; i<modelTest.model.size(); i++) {
//			System.out.println(modelTest.model.get(i));
//		}
		System.out.println("\n[ver-3] Controller 이벤트 연결확인");
	}
}
