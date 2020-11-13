package BANK_PROJECT12;

public class Show implements Bank_Controller{
	@Override
	public void exec(Bank_v12 user1) {	
		Menu12 menu = new Menu12();
		if(menu.Check(user1)) {
			System.out.println("[조회결과]");
			System.out.println("ㅁ 아이디 : " + user1.getId() + "\nㅁ 비밀번호 : " + user1.getPass()
					+ "\nㅁ 잔액 : " + user1.getBalance());
		} else {System.out.println("아이디와 비밀번호를 확인해주세요");}		
	}
}
