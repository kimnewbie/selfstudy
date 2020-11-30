package Mvc_CRUD;

import java.util.ArrayList;
import java.util.Iterator;

public class A_Read implements A_inter {

	@Override public void exec(ArrayList<YJ_Dto> users) { 
		System.out.println("Read : ");
		Iterator<YJ_Dto> iter = users.iterator();
		while(iter.hasNext()) { System.out.println(iter.next()); }
	}

}
