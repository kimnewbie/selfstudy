package Day031_Exception;

public class Exception001 {
	public static void main(String[] args) {
		System.out.println("Q1. 오류찾기 - by zero");
		
		try {
			System.out.println(10/0);
			//q1)어떤 오류가 발생할까요? java.lang.ArithmeticException
			//q2)처리방법은? try vs throws
		}catch(ArithmeticException e) { 
			System.out.println("Error1: by zero");	
			e.printStackTrace(); //오류 보여줌 W_W
		}finally {
			System.out.println("예외가 발생하지 않든 무조건 수행하는 부분");
		}

		int[] a = {10,20,30};
		try { 
			System.out.println("\n\nQ2. 오류찾기 ");
			for(int i=0; i<=3; i++) {System.out.println(a[i]);}
			//q1)어떤 오류가 발생할까요? java.lang.ArrayIndexOutOfBoundsException
			//q2)처리방법은? try vs throws	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error2: index의 범위 확인해주세요");
			e.printStackTrace();
		}
		
		try { 
			System.out.println("\n\nQ3. 오류찾기 ");
			Integer test2 = null;
			System.out.println(10/test2);
			//q1)어떤 오류가 발생할까요? java.lang.NullPointerException
			//q2)처리방법은? try vs throws	
		}catch(NullPointerException e) {
			System.out.println("Error3. null로 나눌 수 없어요");
			e.printStackTrace();
		}
	}
}
