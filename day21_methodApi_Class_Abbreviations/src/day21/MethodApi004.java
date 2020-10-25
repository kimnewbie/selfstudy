package day21;

import java.util.Arrays;
import java.util.Scanner;

public class MethodApi004 {
	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("002. String"); //php jsp asp javascript에서도 사용
		// 1. 문자열의 길이 length, 문자열 찾기 indexOf 
		// 2. 문자열 일부분 추출 substring #
		// 3. 문자열 바꾸기 replace
		// 4. 패턴에 맞춰 문자열 자르기 split
		// 5. 대문자 소문자 변화 toUpperCase, toLowerCase
		
		String str = "Apple,Banana,Coconut";
		System.out.println("1. length 문자열길이 : " + str.length());
		//java(리턴값).lang.String.length[메서드명]()[파라미터X]
		System.out.println("2. indexOf('찾고자하는 문자열') - 문자열찾기 : " + str.indexOf("apple"));//0
		System.out.println("2. indexOf('찾고자하는 문자열') - 문자열찾기 : " + str.indexOf("banana"));//6
		System.out.println("2. indexOf('찾고자하는 문자열') - 못찾으면 [-1] 리턴 : " + str.indexOf("melon"));//-1
		System.out.println("2. charAt('찾고자하는 문자번호')" + str.charAt(3)); //l
		//본인입맛에 맞는 메서드 골라서 사용하기 char(리턴값) java.lang.String.charAt(int index)
		System.out.println("3. replace('찾아서, 바꾸기') - " + str.replace("banana","melon"));
		System.out.println("4. substring(시작, ~전까지) - 문자열 일부분 추출 : " + str.substring(0,5)); //apple 추출 ,까지 범위 ,전까지 추출이라
		System.out.println("4. substring(시작, ~전까지) + indexOf() - 문자열 일부분 추출 : " + 
						str.substring(str.indexOf("A"), str.indexOf(",")));
		
		System.out.println("5. split('기준점') 기준점을 기준으로 문자열을 잘라서 배열로 리턴 - ");
		String[] fruits = str.split(",");
		System.out.println(fruits[0] + "\t" +fruits[1] + "\t" +fruits[2]);
		
		System.out.println("6. 대문자 : " + str.toUpperCase());
		System.out.println("6. 소문자 : " + str.toLowerCase());
		
		//////////////////////////////////////////////////////////////////
		///////Q4~Q6
		String files = "Png, Jpg, Gif, Txt";
		//Q4) ,를 기준으로 문자열 분리 후 myfile이라는 배열에 담기 - 다음과 같이 출력
		/*
			#1. Png #
			#2. Jpg #
			#3. Gif #
			#4. Txt #
		*/
		String[] myfile = files.split(",");
		System.out.println("#1. "+myfile[0]+"\t # \n#2."+myfile[1]+"\t # \n#3."+myfile[2]+"\t # \n#4."+myfile[3] + "\t#");
		
		//선생님 꺼! for 구문으로
		//for(int i=0; i<myfile.length; i++){System.out.println("# " + myfile[i] + " #");}
		
		//Q5) toUpperCase를 이용하여 Jpg, Gif를 대문자로 변환후 배열에 담기
		myfile[1]=myfile[1].toUpperCase();
		myfile[2]=myfile[2].toUpperCase();
		System.out.println(Arrays.toString(myfile)); // 결과 : [Png,  JPG,  GIF,  Txt] 잘 들어감
		
		//선생님 답
		//if(myfile[0].equals("Jpg") || myfile[0].equals("Gif")){myfile[1] = myfile[1].toUpperCase();}
		//for(int i=0; i<myfile.length; i++){if(myfile[i].equals("Jpg") || myfile[i].equals("Gif")){myfile[i] = myfile[i].toUpperCase();}}
		
		//Q6) toLowerCase를 이용하여 Png를 소문자로 변환후 배열에 담기
		myfile[0]=myfile[0].toLowerCase();
		System.out.println(Arrays.toString(myfile)); // 결과 : [png,  JPG,  GIF,  Txt] 잘 들어감
		
		//for(int i=0; i<myfile.length; i++){if(myfile[i].equals("Png")){myfile[i] = myfile[i].toLowerCase();}}		
		
		//Q7) indexOf와 substring을 이용하여 colors문자열에서 Green이 들어간 컬러를 찾아 문자열 일부분을 추출하시오.
		String colors = "Red,Green,Blue,Black";
		System.out.println(colors.substring(colors.indexOf("G"),colors.indexOf("n")+1));
		// colors.substring(시작, 어디전까지) 그래서 어디전까지 '+1'을 해줌
		//////////////////////////////////////////////////////////////////
		
		//Q1) length - 아이디를 입력받기/ 아이디의 길이가 10자 미만이라면 무한 반복으로 다시 입력받게 만들기
		Scanner scanner = new Scanner(System.in); // Scanner를 무한루프에 돌려버림 빼자빼자빼자 String이랑
		String id = "";
		for(;;) {			
			System.out.print("아이디 입력(10자 이상) > ");
			id = scanner.next(); // 자체를 ★★String id = scanner.next(); 로 사용할 수 있음★★
				if(id.length()<10) {System.out.println("다시 입력해주세요");}
				else { break; }
		}
		
		//Q2) indexOf - 이메일 입력받기/ @가 없다면 admin@email.com의 형식으로 입력하셔야 합니다. 출력.
		String email = "";
		System.out.print("이메일을 입력해주세요 > ");
		email = scanner.next();		
		if(email.indexOf("@")==-1) {System.out.println("admin@email.com의 형식으로 입력하셔야 합니다.");}
	
		//Q3) http를 찾아서 https로 바꾸기 - String naver = "http://www.naver.com"
		String naver = "http://www.naver.com";
		System.out.println(naver.replace("http","https"));

		
	}//end main
}//end class
