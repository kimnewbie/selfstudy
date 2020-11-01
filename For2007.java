package day10;

public class For2007 {
	public static void main(String[] args) {
		/*
		1+2+3+4+5+6+7+8+9+10 = 55
		1+2+3+4+5+6+7+8+9+10+11+12+13+14+15+16+17+18+19+20 =210
		...중간생략 
		1+2+3+4+5+6+7+8+9+10+11+12+13+14+15+16+17+18+19 ...중간생략 +100 =
		*/
		//boolean first = true; 이 위치에 쓰면 첫줄 이후에 +1+2.. 로 앞에 +가 붙음
		int box=0; 
		for(int i=10; i<101; i+=10) {
			boolean first = true;
			for(int j=1; j<=i; j++) {
				if(first) {first=false;}
				else {System.out.print("+");}
				System.out.print(j);
				box += j;
			}System.out.println("="+box);
		}
	}//end main
}//end class
