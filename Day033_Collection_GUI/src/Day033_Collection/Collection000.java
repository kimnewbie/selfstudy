package Day033_Collection;

import java.util.Arrays;

public class Collection000 {
	public static void main(String[] args) {
		// 1.문자열 배열 3개
		System.out.println("\n[ver-1] 배열");
		String[] arr = new String[] {"RED","GREEN","BLUE"};
		
		// 2.문자열 늘리기 : 3개 -> 5개로 --- 불편해		
		System.out.println("\n[ver-2] System.arraycopy 배열을 5개로 늘리기");
		String[] temp = new String[5];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
		
		// 3.매번할 때마다 배열의 개수를 고려해야함.
		System.out.println("\n[ver-3] Collection 프레임워크");
		System.out.println("-배열은 매번 배열의 사이즈를 고려해야함");
		System.out.println("-사이즈를 고려안해도 되는 것이 콜렉션 프레임워크");
		System.out.println(Arrays.deepToString(arr)); //[RED, GREEN, BLUE, null, null]
	}
}
