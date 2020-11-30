package Mvc_CRUD;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class A_Update implements A_inter {

	@Override public void exec(ArrayList<YJ_Dto> users) {
		System.out.println("Update : ");
		Iterator<YJ_Dto> iter = users.iterator();		
		int tempno = Integer.parseInt(JOptionPane.showInputDialog("수정할 번호를 입력해주세요 > "));
		
		while(iter.hasNext()) {
			YJ_Dto temp = iter.next();
			if(temp.getNo()==tempno) {
				iter.remove(); 
				users.add(new YJ_Dto(tempno, JOptionPane.showInputDialog("수정할 이메일을 입력해주세요."))); 
				break;
			}
		} System.out.println(users);
	}

}
