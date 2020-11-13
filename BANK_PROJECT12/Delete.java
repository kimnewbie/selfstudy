package BANK_PROJECT12;

import java.util.Scanner;

public class Delete implements Bank_Controller{

	@Override
	public void exec(Bank_v12 user1) {
		Scanner sc = new Scanner(System.in);
		Menu12 menu = new Menu12();
		if(menu.Check(user1)) { 
			System.out.println("삭제하시겠습니까? (Y/N)");
			char answer = sc.next().charAt(0);
			if(answer=='y'||answer=='Y') {
				user1.setId(null);
				user1.setPass(null);
				user1.setBalance(0);
			} else {System.out.println("삭제 선택을 취소합니다.");}
		} else {System.out.println("아이디와 비밀번호를 확인해주세요.");}		
	}

}
