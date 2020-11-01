package day16;

public class EX006 {
	public static void main(String[] args) {
		/*
		EX006
		다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다
		변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하시오
		단 가능한 적은 수의 동전으로 거슬러 주어야 한다 에 알맞은 코드를 넣어서 완성하시오
		
		ㅁ 출력된 결과
		money = 2680
		500 : 5 개
		100 : 1 개
		50 : 1 개
		10 : 3 개
		
		// 큰 금액의 동전을 우선적으로 거슬러 줘야 한다
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
			System.out.println("money=" + money);
			for(int i=0; i<coinUnit.length; i++) {	
		
			(1)알맞은 코드를 넣어 완성하시오		
		}
		*/
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;	
		System.out.println("money=" + money);
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원 : " + money / coinUnit[i] + "\t");
			money = money%coinUnit[i];
		}System.out.println();
				/*
				1. 2680/500 = 5
				money = 2680%500 = 180
				2. 180/100 = 1
				money = 180%100 = 80
				3. 80/50 = 1
				money = 80%50 = 30
				4. 30/10 = 3
				money= 30%10 = 0
				*/
		
	}//end main
}//end class
