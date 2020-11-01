
public class For001 {
	public static void main(String[] args) {
		// 1 2 3 출력
		System.out.println("VER-1");
		System.out.print(1); // 시작
		System.out.print(2); // 1개씩 증가
		System.out.print(3); // 종료
		
		
		System.out.println();
		System.out.println("1. 반복구문을 찾아서 {}		: { System.out.print(3); }");
		System.out.println("2. 바뀌는 부분을 찾아서 변경 : { System.out.print(변수); }");
		System.out.println("3. 패턴 찾기 	: for(시작; 종료; 변화)\n for(초기문; 조건문; 증감문)");
		
		for(int i=1; i<4; i++)
		{ System.out.print(i); } // 바뀌는 부분에 변수 넣기 1~3까지 반복
		System.out.println();
		
		for(int i=1; i<11; i++)
		{ System.out.print(i); }  // 1~10까지 반복
		System.out.println();
		
		for(int i=3; i<9; i++)
		{ System.out.print(i); } // 3~8까지 반복
		
		
		
		
	}//end main
}//end class
