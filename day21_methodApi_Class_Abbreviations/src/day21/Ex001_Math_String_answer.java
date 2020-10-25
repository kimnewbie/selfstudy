package day21;

import java.util.Arrays;

public class Ex001_Math_String_answer {
	public static void main(String[] args) {
		/*
		1. 문자열 출력 : http://WWW.CodeJohns.co.kr/join/index.html
		2. 글자 수를 리턴 : 42
		3. index의 첫번째 위치의 글자 : t
		4. /가 처음 나타나는 위치 : 5
		5. 두번째 /가 나타나는 위치 : 6
		6. /의 마지막 위치 : 31
		7. 폴더 이름 join의 문자열 추출 : join (※ split를 사용하지 말것)
		8. 마지막 /번째 부터 끝까지 : index.html
		9. 대문자로 변환 : HTTP:WWW.CODEJOHNS.CO.KR/JOIN/INDEX.HTML
		10. 소문자로 변환 : http://www.codejohns.co.kr/join/index.html
		11. 도메인 : www.codejohns.co.kr (※split를 사용하지 말것)
		 */
		String index = "http://WWW.CodeJohns.co.kr/join/index.html";
		System.out.println("1. 문자열 출력 : " + index); 
		System.out.println("2. 글자 수를 리턴 : " + index.length()); //42
		System.out.println("3. index의 첫번째 위치의 글자 (charAt#, substing): " + index.charAt(1)); // t
		System.out.println("3. index의 첫번째 위치의 글자 (charAt#, substing#): " + index.substring(1,2)); // t
		
		System.out.println("4. /가 처음 나타나는 위치 indexOf(찾을 말) : " + index.indexOf("/")); // 5 출력
		
		int position1=index.indexOf("/");
		System.out.println("4-2. /가 처음 나타나는 위치 indexOf(찾을 말) : " +  position1 );		
		
		
		System.out.println("5. 두번째 /가 나타나는 위치 : " + index.indexOf("/",index.indexOf("/")+1)); //(1,2) 2에 다시 한 번 더 써줌
		
		int position2 = index.indexOf("/", position1+1);
		System.out.println("5-2. 두번째 /가 나타나는 위치 : " + position2 );
		
		
		System.out.println("6. /의 마지막 위치 : " + index.lastIndexOf("/")); // 31 출력 ★외우자 lastIndexOf
		//System.out.println("7. 폴더 이름 join의 문자열 추출 : " + index.substring(index.indexOf("j"),index.indexOf("/")));  오류나ㅠㅠ
		
		int position3 = index.lastIndexOf("/");
		System.out.println("6. /의 마지막 위치 : " + position3);
		
		System.out.println("7. 폴더 이름 join의 문자열 추출 : " + index.substring(27,31)); //join
		
		String[] join_arr = index.split("/");
		System.out.println("7-1 split" + join_arr[3]);
		
		//http://WWW.CodeJohns.co.kr/join/index.html
		position1 = index.indexOf("/");					// 	/1개
		position2 = index.indexOf("/", position1+1);	//	//2개
		position3 = index.indexOf("/", position2+1);	//	///3개
		
		int start= position3 + 1;
		int end = index.indexOf("/", start+1);
		
		System.out.println("7-3. 폴더 이름 join의 문자열 추출 : " +index.substring(start,end));
		
		System.out.println("8. 마지막 /번째 부터 끝까지 : " + index.substring(index.lastIndexOf("/")+1)); // index.html
		
		System.out.println("9. 대문자로 변환 : " + index.toUpperCase()); // HTTP://WWW.CODEJOHNS.CO.KR/JOIN/INDEX.HTML
		System.out.println("10. 소문자로 변환 : " + index.toLowerCase()); // http://www.codejohns.co.kr/join/index.html
		
		System.out.println("11. 도메인 : " + index.toLowerCase().substring(0,index.indexOf("/j"))); //일단 소문자로 바꾸고 '/j'전까지 추출
		index = index.toLowerCase();
		int domain_start = index.indexOf("://")+3; // [4]가 출력 ':' 이거 :// 이건 하나밖에 없어서 사용
		int domain_end = index.indexOf("/",domain_start + domain_start); // w가[7]이라
		
		System.out.println("11. 도메인 : " + index.substring(domain_start, domain_end));
		//		http://WWW.CodeJohns.co.kr/join/index.html
		System.out.println("11. split으로");
		System.out.println(Arrays.toString(join_arr)); // [http:, , WWW.CodeJohns.co.kr, join, index.html]
		System.out.println(join_arr[2]);
	}
}
