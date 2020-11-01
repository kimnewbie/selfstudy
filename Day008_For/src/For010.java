
public class For010 {
	public static void main(String[] args) {
		/*
		1~30중에서 3의 배수이면서 2의 배수인 숫자와 갯수를 구하시오.
		1. 3의 배수이면서 2의 배수인 숫자 : 6
		2. 3의 배수이면서 2의 배수인 숫자 : 12
		3. 3의 배수이면서 2의 배수인 숫자 : 18
		4. 3의 배수이면서 2의 배수인 숫자 : 24
		5. 3의 배수이면서 2의 배수인 숫자 : 30
		개수 : 5개
		*/
		
		int hap = 0;
		
		for(int i=1; i<=30; i++) {
			if( i%3==0 && i%2==0) {
				hap++;
				System.out.println("3의 배수이면서 2의 배수인 숫자 : " + i);
			}
		}
		System.out.println("개수 : " + hap + "개");
		
	}//end main
}//end class
