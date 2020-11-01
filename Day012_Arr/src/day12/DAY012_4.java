package day12;

public class DAY012_4 {
	public static void main(String[] args) {
		/*
		이중 for
		101 102 103
		201 202 203
		*/
		
		for(int i=1; i<3; i++) {
			System.out.println();
			for(int j=1; j<4; j++) {
				System.out.print(i*100 + j + "\t");
			}
		}
	}//end main
}//end class
