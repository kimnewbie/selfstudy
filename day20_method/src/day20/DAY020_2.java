package day20;

public class DAY020_2 {
	public static void main(String[] args) {
		/*
		 a	b	c
		 A	B	C
		 */
		char [][] ch = new char [2][3];
		char data = 'a';
		
		for(int i=0; i<ch.length;i++) {
			for(int j=0; j<ch[i].length; j++) {
				ch[i][j] = data;
				data++;
			}
			data = 'A';
		}
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
