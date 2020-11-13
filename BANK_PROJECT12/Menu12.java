package BANK_PROJECT12;

import java.util.Scanner;

public class Menu12 implements Bank_Controller{
	Input input = new Input();
	Show show = new Show();
	Deposit deposit = new Deposit();
	Withdraw withdraw = new Withdraw();
	Delete delete = new Delete();
	
	@Override
	public void exec(Bank_v12 user1) {	
		int num;	
		Scanner sc = new Scanner(System.in);
		while(true) {	
			try {
				System.out.print("\r\r========BANK=========\r\n"
						+ "1. 추가\r\n"
						+ "2. 조회\r\n"
						+ "3. 입금\r\n"
						+ "4. 출금\r\n"
						+ "5. 삭제\r\n"
						+ "9. 종료\r\n"
						+ "입력>>> " );	
				num = sc.nextInt();			
				switch(num) {
					case 1: input.exec(user1); break; //(user1) 부분에 (Bank_v12[] user1) 넣어줌
					case 2: show.exec(user1); break;
					case 3: deposit.exec(user1); break;
					case 4: withdraw.exec(user1); break;
					case 5: delete.exec(user1); break;
					case 9: return; // do while(num==9) break; 문을 try-catch 때문에 while 구문으로 바꾸고 case 9에 return 붙임
				}
			} catch(Exception e) {				
				System.out.println("숫자만 입력 가능합니다.");
				continue;
//				sc.next(); // enter 지우기 day031_Exception003 참고 - continue를 밑에쓰면 키를 눌러야함				
			}
		} // end while
	}
	//본인확인은 뱅크11번 참조 배열
	boolean Check (Bank_v12 user1) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID 입력 : "); String idc = sc.next();
		System.out.print("PASS 입력 : "); String pac = sc.next();
		if(idc.equals(user1.getId()) && pac.equals(user1.getPass())){return true;}
		return false;
	}
}