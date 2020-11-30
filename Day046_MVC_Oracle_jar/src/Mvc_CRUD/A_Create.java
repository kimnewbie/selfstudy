package Mvc_CRUD;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class A_Create implements A_inter {

	@Override public void exec(ArrayList<YJ_Dto> users) {  
//		1. logic
		users.add(new YJ_Dto(JOptionPane.showInputDialog("이메일을 입력해주세요 >")));
		System.out.println("Create : "+users);
	}
}
