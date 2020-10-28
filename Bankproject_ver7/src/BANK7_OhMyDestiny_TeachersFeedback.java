import java.util.Arrays;
import java.util.Scanner;

public class BANK7_OhMyDestiny_TeachersFeedback {

//	▼ 수정 20201028 이유: static은 클래스라 메모리를 많이 차지하므로 바이	
//	public static Scanner scanner = new Scanner(System.in);
//	public static int num = 0;	
//	public static int find = -1;
//	public static double temp_balance = 0;
//	public static String temp_id="";
//	public static String temp_pass="";
			
	public static void main(String[] args) {

		
		String [][]users = { {"" , "" , ""}, {"" , "" , ""}, {"" , "" , ""} };
		int num = 0; // 밑에 스위치 문을 돌리기 위해서 int num 변수를 만들어줌
		
		do { System.out.println(Arrays.deepToString(users));
			num=menu(); // num을 넣는 이유는 menu에서 숫자를 받은게 위에 0으로 초기화되서 내려오므로 같다고 해준다
			switch(num) {
				case 1:	input(users);		break;
				case 2:	show(users);    	break;
				case 3: deposit(users);    	break;
				case 4: withdraw(users);  	break;
				case 5: delete(users);     	break;
			}
		}while(num!=9);
	}		
	
	public static int menu() {
		Scanner scanner = new Scanner(System.in);
        int num = 0;
		System.out.print("\r\r========BANK=========\r\n"
				+ "1. 추가\r\n"
				+ "2. 조회\r\n"
				+ "3. 입금\r\n"
				+ "4. 출금\r\n"
				+ "5. 삭제\r\n"
				+ "9. 종료\r\n"
				+ "입력>>> " );	
		num = scanner.nextInt();
		return num;
	}
	//////////////////////////////////////////////////////////////////////////////
	//					 수정!!! 계속 사용되는 유저 확인 부분 독립시키기					//
	//////////////////////////////////////////////////////////////////////////////
	
	public static void delete(String[][] users) {
		Scanner scanner = new Scanner(System.in);	
		String temp_id="", temp_pass="";
		int find = -1;
		//입력
		System.out.print("아이디 : "); temp_id = scanner.next();
		System.out.print("비밀번호 : "); temp_pass = scanner.next();
		//처리(1) - 유저확인
		for(int i=0; i<users.length; i++) {
			if(temp_id.equals(users[i][0])&&temp_pass.equals(users[i][1])) 
			{find=i; break;}}
		//처리(2) - 아이디 처리
		if(find!=-1) {
			users[find][0]=""; users[find][1]=""; users[find][2]="";
		} else {System.out.println("아이디와 비밀번호를 확인해주세요.");}		
	}

	public static void withdraw(String[][] users) {
		Scanner scanner = new Scanner(System.in);	
		String temp_id="", temp_pass="";
		int find = -1;
		double temp_balance = 0;
		//입력
		System.out.print("아이디 : "); temp_id = scanner.next();
		System.out.print("비밀번호 : "); temp_pass = scanner.next();
		//처리(1) - 유저확인
		for(int i=0; i<users.length; i++) {
			if(temp_id.equals(users[i][0])&&temp_pass.equals(users[i][1])) {find=i; break;}}
		//처리(2) - 출금처리
		if(find!=-1) {
			System.out.print("출금할 금액 > "); temp_balance = scanner.nextInt();
			if(temp_balance<=Double.parseDouble(users[find][2])) { // 누적하면 안돼
				users[find][2] = "" +(Double.parseDouble(users[find][2]) - temp_balance); //ㅁ 문자열로 인식할 수 있도록 "" + 괄호로 () 묶어줌
				System.out.println("ㅁ 아이디 : " + users[find][0] + "\n비밀번호 : " + users[find][1]
						+ "\n잔액 : " + users[find][2]);
			} else {System.out.println("출금할 금액을 확인해주세요");}
		} else {System.out.print("아이디와 비밀번호를 확인해주세요.");}		
	}
	
	
	public static void deposit(String[][] users) {
		Scanner scanner = new Scanner(System.in);	
		String temp_id="", temp_pass="";
		int find = -1;
		double temp_balance = 0;
		//입력
		System.out.print("아이디 : "); temp_id = scanner.next();
		System.out.print("비밀번호 : "); temp_pass = scanner.next();
		//처리(1) - 유저확인
		for(int i=0; i<users.length; i++) {
			if(temp_id.equals(users[i][0])&&temp_pass.equals(users[i][1])) {find=i; break;}}
		//처리(2) - 입금처리
		if(find!=-1) {
			System.out.print("입금할 금액 > "); 
			temp_balance = scanner.nextDouble();
			if(temp_balance>=0) {
				users[find][2] = 
						"" + (Integer.parseInt(users[find][2]) + temp_balance); // Integer.toString 와 "" 같은 기능
				System.out.println("ㅁ 아이디 : " + users[find][0] + "\n비밀번호 : " + users[find][1]
						+ "\n잔액 : " + users[find][2]);
			} else {System.out.println("입금할 금액을 확인해주세요");}
		} else {System.out.println("아이디와 비밀번호를 확인해주세요.");}		
	}

	public static void show(String[][] users) {
		Scanner scanner = new Scanner(System.in);	
		String temp_id="", temp_pass="";
		int find = -1;
		double temp_balance = 0;
		//입력
		System.out.print("아이디 : "); temp_id = scanner.next();
		System.out.print("비밀번호 : "); temp_pass = scanner.next();		
		//처리(1) - 유저확인
		for(int i=0; i<users.length; i++) {
			if(temp_id.equals(users[i][0])&&temp_pass.equals(users[i][1])) {find=i; break;}}
		//처리(2) - 조회 - 그 번호로 조회
		if(find!=-1) {
			System.out.println("ㅁ 아이디 : " + users[find][0] + "\n비밀번호 : " + users[find][1]
									+ "\n잔액 : " + users[find][2]);
		} else {System.out.println("아이디와 비밀번호를 확인해주세요");}
		
	}

	public static void input(String[][] users) {
		Scanner scanner = new Scanner(System.in);
		int find = -1;
		for(int i=0; i<users.length; i++) {
			if(users[i][0].equals("")) {find=i; break;}}
		
		if(find!=-1) {
			System.out.print("ㅁ 아이디설정 : "); users[find][0] = scanner.next();
			System.out.print("ㅁ 비밀번호설정 : "); users[find][1]= scanner.next();
			System.out.print("ㅁ 입금금액 : "); users[find][2] = scanner.next();
			System.out.println("\n등록되었습니다.");
		} else {System.out.println("더 이상 신규가입이 불가능합니다.");}
	}
}//end class
