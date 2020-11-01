
public class For008 {
	public static void main(String[] args) {
		/*
		소문자 a~z까지 모음의 개수를 출력하시오.
		a e i o u 5개
		*/
		
		int hap = 0 ;
		
		for(char ch='a'; ch<='z'; ch++) {
			/*if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				hap ++;}			
			*/
			switch (ch) {
			case 'a' : case 'e' : case 'i' : case 'o' : case 'u' : hap ++;
			break;
			}			
		}
		System.out.println("소문자 a~z까지 모음의 개수 : " + hap );
	}//end main
}//end class