
public class For009 {
	public static void main(String[] args) {
		/*
		ABCDE   
		FGHIJ
		KLMNO
		PQRST
		UVWXY
		Z   
		*/
		// A부터 Z까지 출력
		
		for(char alpha='A'; alpha<='Z'; alpha++) { //A~Z ++
			if(alpha%5==0) {System.out.println();} //줄바꿈
			System.out.print( alpha );
			//5개마다 줄바꿈
		}
		
	}//end main
}//end class