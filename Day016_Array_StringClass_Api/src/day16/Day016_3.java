package day16;

public class Day016_3 {
	public static void main(String[] args) {
		/*
		Day016_3
		이중 for
		1000 2000 3000
		4000 5000 6000
		*/
		int num = 0;
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
					num +=1000;
					System.out.print(num+"\t");
			}System.out.println();
		}
	}//end main
}//end class
