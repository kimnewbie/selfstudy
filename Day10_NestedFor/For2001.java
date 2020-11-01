package day10;

public class For2001 {
	public static void main(String[] args) {
		/*
		이중 for
		for(초기값 또는 시작값; 조건 또는 종료값; 증가 또는 감소값)
		{
			for(초기값 또는 시작값; 조건 또는 종료값; 증가 또는 감소값)
			{
			}
		}
		
		보이는 그대로 출력하기
		[1층]
		1호실2호실3호실 for문이용해서 출력!
		[2층]
		1호실2호실3호실 for문이용해서 출력!		
		*/
		System.out.print("ver-1");
		System.out.println("\r\n[1층]");
		for(int i=1; i<4; i++) {System.out.print(i +"호실\t");}
		System.out.println("\r\n[2층]");
		for(int i=1; i<4; i++) {System.out.print(i +"호실\t");}
		
		System.out.println();
		
		System.out.print("\r\nver-2");
		for(int i=1; i<3; i++) {
			System.out.println("\n[" + i + "층]");
			for(int j=1; j<=3; j++) {System.out.print(j + "호실\t");}
		} System.out.println();
		
		System.out.println("\r\nwhile");		
		int i=1, j=1;
		while(i<3) {
			System.out.println("[" + i + "층]");
			while(j<=3) {
				System.out.print(j + "호실\t");
				j++;
			}
			System.out.println();
			i++;
			j = 1;
		}//end while 시작 
		
		System.out.println("\r\ndo while");	
		i=1; j=1;
		do{
			System.out.println("[" + i + "층]");
			do{
				System.out.print(j + "호실\t");
				j++;
			}while(j<=3) ;
			System.out.println();
			i++;
			j = 1;
		}while(i<3) ;
	}//end main
}//end class
