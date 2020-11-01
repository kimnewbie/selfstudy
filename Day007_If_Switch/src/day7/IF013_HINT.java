package day7;

public class IF013_HINT {
	public static void main (String[] args) {
		
		float result = 0.0f;
		char op = ' ';
		//("" + num1 + op + num2 + "=") +  ((op== '/')? result : (int)result))
		// (조건)?	참:거짓;
		// 참 :거짓에 들어가는 자료형은 동일해야 함. (넓은 범위)
		// 담는 그릇이 실수라서 모든 결과가 실수로 나오는 것
		//						실수 : 정수
		result = (op == '/')? 3.14f : 3 ;
		System.out.println( result ); // 3.0 (실수가 출력)
		
		//						문자열 : 문자열
		System.out.println(
				(op == '/')?
	            ("" + 10 + '/' + 3 + "=" + result)
	            :("" + 10 + '/' + 3 + "=" + (int)result));
		//									문자열로 처리되는 과정
		
		//*삼항연산자에서 참:거짓 부분의 자료형이 다르면 큼범위로 바뀜
		// 그래서 형변환 (int) result했는데도 답이 3.0이 나오는 것
		// "" 넣어 문자형으로 만든다.
	}//end main

}//end class
