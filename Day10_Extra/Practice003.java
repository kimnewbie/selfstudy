package day10;

public class Practice003 {
	public static void main(String[] args) {
		/*
		while 구문으로
		4 - I can do it.
		3 - I can do it.
		2 - I can do it.
		1 - I can do it.
		0 - I can do it.
		*/
		
		int i=5;
		while(i!=0) { //i는 5로 시작하는데
			i--;	  //i-- 조건식을 만나 4로 시작함 5~1까지 시작함
			System.out.println(i+" - I can do it.");
		}System.out.println();
	}
}
