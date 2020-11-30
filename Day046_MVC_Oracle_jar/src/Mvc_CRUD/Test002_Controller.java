package Mvc_CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class Test002_Controller {
	public static void main(String[] args) {
//		model
		ArrayList<YJ_Dto> users = new ArrayList<YJ_Dto>();
		System.out.println("3. controller - arrayList : " + users);
//		controller
		A_inter controller = null;
		A_inter[] crud = {new A_Create(), new A_Read(), new A_Update(), new A_Delete()};
		int menu = -1;
		
		Scanner sc = new Scanner(System.in);
		
		while(menu != 9) {
			System.out.print("\n\n::::\n1. 이메일등록\n2. 이메일등록확인 \n3.이메일수정 \n4.이메일 삭제 \n9.프로그램 종료\n메뉴선택");
			menu = sc.nextInt();
			switch(menu) {
			case 1: controller = crud[0]; controller.exec(users);break;
			case 2: controller = crud[1]; controller.exec(users);break;
			case 3: controller = crud[2]; controller.exec(users);break;
			case 4: controller = crud[3]; controller.exec(users);break;
			case 9: System.out.println("프로그램을 종료합니다.");break;
			}
		}
		
		
//		1-3. crud
//		c 기능 : 사용자에게 이메일입력받아서 리스트에 등록
//		return : void
//		parameter : ArrayList<YJ_Dto> users | Input으로 해결 => String email(input)

//		r 기능 : 전체 사용자 출력
//		return : - 화면이 바뀐다.
//		parameter : ArrayList<YJ_Dto> users 
	
//		u 기능 : 사용자에게 번호 입력받아서 번호가 있다면 입력받은 이메일 업데이트
//		return : -
//		parameter : ArrayList<YJ_Dto> users  / 번호 입력받아서,이메일 입력받기 (inputdialog)
		
//		d 기능 : 사용자에게 번호받아서 삭제하기
//		return : -
//		parameter : ArrayList<YJ_Dto> users  / 번호 입력받아서
	}
}
