package day9;
public class Repeat002 {
	public static void main(String[] args) {
		/*
		1. for, while, do while문을 이용해서 다음과 같이 출력하시오 : 1 2 3 4 5 		
		2. for, while, do while문을 이용해서 다음과 같이 출력하시오 : 5 4 3 2 1 
		3. for, while, do while문을 이용해서 다음과 같이 출력하시오 : JAVA1 JAVA2 JAVA3 
		*/
		System.out.println("\r\nQ1 1 2 3 4 5");
		System.out.println("\r\n1-1 :  for");
		for(int g=1; g<6; g++) {System.out.print(g);}
		
		System.out.println("\r\n1-2 :  while");		
		int i = 1;
		while (i<6) {System.out.print(i); i++;}
		
		System.out.println("\r\n1-3 :  do while");;		
		int j = 1;
		do {System.out.print(j); j++;}while(j<6);
		
		
		System.out.println("\r\nQ2 5 4 3 2 1");
		System.out.println("\r\n2-1 :  for");		
		for(int f=5; f>0; f--) {System.out.print(f);}
		
		System.out.println("\r\n2-2 :  while");				
		int a = 5;
		while (a>0) {System.out.print(a); a--;}
		
		System.out.println("\r\n2-3 :  do while");		
		int b = 5;
		do {System.out.print(b); b--;}while(b>0);

		System.out.println("\r\nQ3 JAVA1 JAVA2 JAVA3");
		System.out.println("\r\n3-1 :  for");		
		for(int c=1; c<4; c++) {System.out.print("JAVA" + c);}
		
		System.out.println("\r\n3-2 :  while");				
		int d = 1;
		while (d<4) {System.out.print("JAVA" + d); d++;}
		
		System.out.println("\r\n3-3 :  do while");		
		int e = 1;
		do {System.out.print("JAVA" + e); e++;}while(e<4);
		
	}//end main
}//end class
