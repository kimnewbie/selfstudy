import java.util.Scanner;

public class For013_basic {
		public static void main(String[] args) {
			/*
			 무한반복
			 break vs continue
			 */
			
			//1. 예상되는 결과는? 
			//내답: 5까지 출력 후 멈춤
			//정답: 1 2 3 4 
			// break (아예 빠져나오기)
			for(int i=1; i<11; i++) {
				if(i==5) { break; }
				System.out.print(i + "\t");				
			}
			//2. 예상되는 결과는? 
			//내답: 10까지 출력 후 멈춤
			//정답: 1 2 3 4 6 7 8 9 10
			// continue (skip)
			System.out.println();
			for(int i=1; i<11; i++) {
				if(i==5) { continue; }
				System.out.print(i + "\t");		
			}
			//3. 1을 입력할때까지 무한반복
			System.out.println();
			Scanner scanner = new Scanner(System.in);
			int num =0;
			for(;;) { // 초기값; 조건문; 증감문 - 제약조건이 아무것도 없음.( 무한반복 )
				System.out.print("1을 입력해주세요 > ");
				num = scanner.nextInt();
				//무한반복빠져나오는코드 필요 break;
				if(num ==1) {break;} //2. 빠져나올조건
			}
			System.out.println("입력받을숫자는 " + num + "입니다.");
			
			
		}//end main
	}//end class
