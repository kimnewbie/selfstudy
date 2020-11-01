package day13;

public class DAY013_4 {
	public static void main(String[] args) {
		/*
		for2 이중for구문으로 작업해주세요.
		A
		AB
		ABC
		ABCD
		*/	
		
		for(char i='A'; i<'E'; i++) {
			for(char j='A'; j<=i; j++) {
				System.out.print(j);
			}System.out.println();
		}
		
	}//end main
}//end class
