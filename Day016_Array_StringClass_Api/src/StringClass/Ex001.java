package StringClass;

public class Ex001 {
	public static void main(String[] args) {
		//			  01234
		String str = "ABCDE";
		char ch = str.charAt(2);
		System.out.println(ch);//C
		
		String str2 = str.substring(1,4);
		System.out.println(str2);//BCD
		
		String str3 = str.substring(1,str.length());
		//String str3 = str.substring(1);
		System.out.println(str3);//BCDE
		//to를 생략해서 1~끝까지 출력된 것
		
	}
}
