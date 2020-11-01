package day6;

public class Ex008 {
	public static void main(String[] args) {
		
		char ch = 'z';
		
		System.out.println((('A' <= ch  && ch <='Z') || 
				('a' <= ch  && ch <='z') || ('0' <= ch  && ch <='9')));

		//★이거 다시 해보자★
		
	}//end main

}//end class
/*
영문소문자 , 영문대문자 , 숫자라면 true, 아니라면 false 출력하는 코드를 작성하시오.
public class Ex008 {
	public static void main(String[] args) {		
		// 'A' >= ch  && ch <='Z'
		// 'a' >= ch  && ch <='z'
		// '0' >= ch  && ch <='9'

		char ch = 'z'; 
		System.out.println(    작성할코드부분  );
		
	} // end main
} // end class 
*/
