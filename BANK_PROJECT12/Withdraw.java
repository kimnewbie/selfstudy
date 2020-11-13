package BANK_PROJECT12;

import java.util.Scanner;

public class Withdraw implements Bank_Controller{

	@Override
	public void exec(Bank_v12 user1) {
		Scanner sc = new Scanner(System.in);
		Menu12 menu = new Menu12();
			double temp_balance;
			if(menu.Check(user1)) {
				System.out.print("출금할 금액 > "); temp_balance = sc.nextInt();
				if(temp_balance<=user1.getBalance()) { // 누적하면 안돼
					user1.setBalance(user1.getBalance()-temp_balance);
				} else {System.out.println("출금할 금액을 확인해주세요");}
			} else {System.out.print("아이디와 비밀번호를 확인해주세요.");}		
		}

}
