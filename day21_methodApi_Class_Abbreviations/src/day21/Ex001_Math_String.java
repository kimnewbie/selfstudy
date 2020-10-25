package day21;

public class Ex001_Math_String {
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
		System.out.println("4. /가 처음 나타나는 위치 : " + index.indexOf("/")); // 5 출력
		System.out.println("5. 두번째 /가 나타나는 위치 : " + index.indexOf("/",index.indexOf("/")+1)); //(1,2) 2에 다시 한 번 더 써줌
		System.out.println("6. /의 마지막 위치 : " + index.lastIndexOf("/")); // 31 출력 ★외우자 lastIndexOf
		//System.out.println("7. 폴더 이름 join의 문자열 추출 : " + index.substring(index.indexOf("j"),index.indexOf("/")));  오류나ㅠㅠ
		
		System.out.println("7. 폴더 이름 join의 문자열 추출 : " + index.substring(27,31)); //join
		System.out.print("7. split 사용 : ");
		String[] domain = index.split("/");
		System.out.println(domain[3]);
		
		System.out.println("8. 마지막 /번째 부터 끝까지 : " + index.substring(index.lastIndexOf("/"),42)); // 위에 문자열이 총 42번이라고!
		System.out.println("9. 대문자로 변환 : " + index.toUpperCase()); // HTTP://WWW.CODEJOHNS.CO.KR/JOIN/INDEX.HTML
		System.out.println("10. 소문자로 변환 : " + index.toLowerCase()); // http://www.codejohns.co.kr/join/index.html
		
		System.out.println("11. 도메인 : " + index.toLowerCase().substring(0,index.indexOf("/j"))); //일단 소문자로 바꾸고 '/j'전까지 추출
		
	}
}
