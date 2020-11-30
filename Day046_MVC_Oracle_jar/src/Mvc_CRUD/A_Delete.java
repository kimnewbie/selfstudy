package Mvc_CRUD;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class A_Delete implements A_inter {

	@Override public void exec(ArrayList<YJ_Dto> users) { 
		System.out.println("delete : ");
		users.remove(Integer.parseInt(JOptionPane.showInputDialog("삭제할 번호를 입력해주세요 > "))-1);
		System.out.println(users);
	}

}
