package Day035_arrEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayList000 {
	public static void main(String[] args) {
		System.out.println("\n[REPEAT+진도]-ArrayList");
		//Vector vec = new Vector(); - add, get, remove, size
		ArrayList vec = new ArrayList(); // 1) 순서가 있다 2) 데이터 중복허용 add, get, remove, size
		vec.add("피자"); vec.add(4500); vec.add(3);
		System.out.println("q1) list출력 : " +  vec);
		System.out.println("q2) size 개수 출력 : " +  vec.size());
		System.out.println("q3) 4500 출력 : " +  vec.get(1));
		System.out.println("q4) for구문이용해서 출력 - 각각의 요소들 출력");
		for(int i=0; i<vec.size(); i++) {System.out.println(vec.get(i)+"\t");}
		
		System.out.println("\n");
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요"); // return 값 확인
		JOptionPane.showMessageDialog(null, name + "님 반갑습니다.");
	}
}
