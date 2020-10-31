package day10;
class Practice007_While {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;

		while(true) { //if(;true;)와 다르게 while에선 true 생략 불가
			if(sum > 100)
				break;
			++i;
			sum += i;
			System.out.println("i ="+i+", sum = "+sum);
		} // end of while

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}   
}