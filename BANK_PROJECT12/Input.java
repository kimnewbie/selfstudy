package BANK_PROJECT12;

import java.util.Scanner;

public class Input implements Bank_Controller{

	@Override
	public void exec(Bank_v12 user1) {
		Scanner sc = new Scanner(System.in);
		System.out.print("::추가기능입니다.");
		System.out.print("\rㅁ 아이디설정 : "); user1.setId(sc.next());
		System.out.print("ㅁ 비밀번호설정 : "); user1.setPass(sc.next());
		System.out.print("ㅁ 입금금액 : "); user1.setBalance(sc.nextDouble());
		System.out.println("\n등록되었습니다.");
		System.out.println("등록된 정보 : " + user1.getId() + ", " + user1.getPass() +
								",1 "+ user1.getBalance());		
	}
}
