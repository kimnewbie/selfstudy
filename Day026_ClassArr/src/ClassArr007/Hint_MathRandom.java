package ClassArr007;

import java.util.Arrays;

public class Hint_MathRandom {
	public static void main(String[] args) {	
		//문자
		System.out.println("\n[ver-1] 문자열을 문자배열로 바꾸기");
		char temp = ' ';
		String question = "abc";
		char[] ver = "abc".toCharArray();
		System.out.println(Arrays.toString(ver)); // [a,b,c]
		
		System.out.println("\n[ver-2] 섞기");
		temp = ver[0];
		ver[0] = ver[2];
		ver[2] = temp;
		System.out.println(Arrays.toString(ver));
		
		System.out.println("\n[ver-3] 랜덤섞기");
		String question3 = "apple";
		char[] words = question3.toCharArray();
		
		for(int i=0; i<words.length; i++) {
			int j = (int)(Math.random()*question3.length());
			char temp2 = words[i];
			words[i] = words[j];
			words[j] = temp2;}
		System.out.println(Arrays.toString(words));
	}
}
