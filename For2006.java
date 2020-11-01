package day10;

public class For2006 {
	public static void main(String[] args) {
		/*
		@###         @(1,1)#(1,2)#(1,3)#(1,4)   
		#@##         #(2,1)@(2,2)#(2,3)#(2,4)     
		##@#         #(3,1)#(3,2)@(3,3)#(3,4)  
		###@         #(4,1)#(4,2)#(4,3)@(4,4)  
		*/
		System.out.println("\n\n[ver-1]");
		System.out.print("@");System.out.print("#");System.out.print("#");System.out.print("#");
		System.out.print("#");System.out.print("@");System.out.print("#");System.out.print("#");
		
		System.out.println("\n\n[ver-2]");
		for(int a=1; a<5; a++) {
			if(a==1) {System.out.print("@");} 
			else{System.out.print("#");}
		}System.out.println();		
		for(int a=1; a<5; a++) {
			if(a==2) {System.out.print("@");} 
			else{System.out.print("#");}
		}System.out.println();
		
		System.out.println("\n\n1-1 for구문");	
		for(int i=4; i>0; i--) {
			for(int j=4; j>0; j--) {
				if(i-j==0){System.out.print("@");}
				else {System.out.print("#");}				
			}System.out.println();
		}
		System.out.println("\n\n1-2 for구문");		
		for(int i=1; i<5; i++) {
			for(int j=1; j<5; j++) {
				if(i-j==0) {System.out.print("@");}
				else {System.out.print("#");}
			}System.out.println();
		}
		
		System.out.println("\n\nwhile구문");
		int i=1; int j=1;
		while(i<5) {
			while(j<5) {
				if(i-j==0) {System.out.print("@");}
				else {System.out.print("#");}
				j++;
			}System.out.println();
			i++;
			j=1;
		}
		
		System.out.println("\n\ndo while구문");
		i=1; j=1;
		while(i<5) {
			while(j<5) {
				if(i-j==0) {System.out.print("@");}
				else {System.out.print("#");}
				j++;
			}System.out.println();
			i++;
			j=1;
		}
		
		
	}//end main
}//end class
