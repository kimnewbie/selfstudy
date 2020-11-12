package Day035_arrEvent;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayList002 {
	public static void main(String[] args) {
//		ArrayList avengers = new ArrayList();
//		String[] heros = new String[] {"IRON","HULK","CAPTAIN"};
//		for(int i=0; i<avengers.size(); i++) {avengers.add(heros[i]);}
//		String num = JOptionPane.showInputDialog("[IRON, HULK, CAPTAIN] 당신의 영웅의 번호(1,2,3)를 입력해주세요.");
//		for(;;) {
//			if(num.equals("1")) {JOptionPane.showMessageDialog(null, "부자남자 IRON"); break;}
//			else if(num.equals("2")) {JOptionPane.showMessageDialog(null, "초록색남자 HULK"); break;}
//			else if(num.equals("3")) {JOptionPane.showMessageDialog(null, "항상대장 CAPTAIN"); break;}
//			else {JOptionPane.showMessageDialog(null, "종료."); break;}
//		} 
		ArrayList avengers = new ArrayList();
		String[] users =  {"IRON","HULK","CAPTAIN"};
		//users.length 대신 avengers.size() 로 했더니 오류났음 -- 아직 0이어서
		for(int i=0; i<users.length; i++) {avengers.add(users[i]);}
		int num = -1;
		String[] ch = {"부자남자","초록색남자","항상대장"};
		while(num!=4) {
			num = Integer.parseInt(JOptionPane.showInputDialog("[ 1)IRON 2)HULK 3)CATAIN 4)종료]"));
			JOptionPane.showMessageDialog(null, ch[num-1]+" " +avengers.get(num-1));
		}		
	}
}
