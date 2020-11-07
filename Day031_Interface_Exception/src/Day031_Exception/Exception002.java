package Day031_Exception;

import javax.swing.JOptionPane;

public class Exception002 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0); // ArithmeticException
			int[] a = {10,20,30};
			for(int i=0; i<=3; i++) {System.out.println(a[i]);} //ArrayIndexOutOfBoundsException
			
			Integer b=null;
			System.out.println(b/10); //-->변수타면 알 수 없음 //NullPointerException
		}catch(ArithmeticException e) { //e.printStackTrace();
			System.out.println("error1: ArithmeticException");
			JOptionPane.showMessageDialog(null, "error1: ArithmeticException"); //--> 알림창/경고창 등
		}catch(ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "error2: ArrayIndexOutOfBoundsException");
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "error3: NullPointerException");
		}finally {
			JOptionPane.showMessageDialog(null, "무조건 처리");
		}
		
		System.out.println("\n\n[ver-2]"); // Exception은 저 위 에러들을 다 포함하는 조상클래스여서 한방에 해결 가능
		try {
			System.out.println(10/0); // ArithmeticException
			int[] a = {10,20,30};
			for(int i=0; i<=3; i++) {System.out.println(a[i]);} //ArrayIndexOutOfBoundsException
			
			Integer b=null;
			System.out.println(b/10); //-->변수타면 알 수 없음 //NullPointerException
		}catch(Exception e) { //e.printStackTrace();
			JOptionPane.showMessageDialog(null, "exception!!!"); //--> 알림창/경고창 등
		}
	}
}
