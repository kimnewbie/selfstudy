package BANK_PROJECT12;

import java.util.Scanner;

public class Deposit implements Bank_Controller{

	@Override
	public void exec(Bank_v12 user1) {
		Menu12 menu = new Menu12();
		Scanner sc = new Scanner(System.in);
		//입금처리
		if(menu.Check(user1)) {//정보가 맞으면 실행
			System.out.print("입금할 금액 > "); user1.setBalance(user1.getBalance() + sc.nextInt());
			System.out.println("ㅁ 아이디 : " + user1.getId() + "\nㅁ 비밀번호 : " + user1.getPass()
						+ "\nㅁ 잔액 : " + user1.getBalance());
		} else {System.out.println("아이디와 비밀번호를 확인해주세요.");}		
	}

}
