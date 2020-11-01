package day10;

public class Ex002 {
	public static void main(String[] args) {
		/*
		1~20까지의 정수중에서 2또는 3의 배수가아닌 수의 총합을
		for , while , do while문을 이용해서   처리하시오.
	
		1 + 5 + 7  +11  +13  +17  +19 = 73   
		*/
		int sum = 0; boolean first = true;
		for(int i=1; i<21; i++) {
			if(i%2!=0&&i%3!=0) {
				sum += i;
				if(first) { first = false; }
				else {System.out.print("+");}
				System.out.print(i); 
			}
			
		}System.out.println("=" + sum);
		
		sum = 0; int i = 1; first = true;
		while(i<21) {
			if(i%2!=0&&i%3!=0) {
				sum += i;
				if(first) { first = false; }
				else {System.out.print("+");}
				System.out.print(i); 
			} //end if
			i++;
		}//end class
		System.out.println("=" + sum);
		
		
		sum = 0; i = 1; first = true;
		do {
			if(i%2!=0&&i%3!=0) {
				sum += i;
				if(first) { first = false; }
				else {System.out.print("+");}
				System.out.print(i); 
			} //end if
			i++;
		} //end class
		while (i<21);
		System.out.println("=" + sum);
	}//end main
}//end class