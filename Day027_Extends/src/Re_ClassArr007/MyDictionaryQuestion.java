package Re_ClassArr007;

import java.util.Arrays;
import java.util.Scanner;

public class MyDictionaryQuestion {
	public void dicQuestion(MyDictionary[] words) {
		System.out.println(":::: " + Arrays.toString(words)); //내가 뭘 받는지 꼭 체크하는 습관 들이렴
		Scanner sc = new Scanner(System.in);
		String answer = "";
		char[] question = words[0].getWord().toCharArray();
		for(int cnt=0; cnt<words.length; cnt++) {
			for(int a=0; a<question.length; a++) {
				int index = (int)(Math.random()*question.length);
				char temp = question[a];
				question[a] = question[index];
				question[index] = temp;
			}
			//문제주고
			System.out.print("Q"+(cnt+1)+". "+new String(question)+"의 정답을 입력하세요.> "); answer = sc.next();
			//처리
			if(words[0].getWord().equals(answer)) {
				System.out.println("맞았습니다!"); words[0].setUserAnswer('O');
				MyDictionary.trueAnswer++;
			}else {
				System.out.println("틀렸습니다.");
			}
		}
		
	}	
	//생성자
	MyDictionaryQuestion(){super();}
	
}
