package day10;
class Practice009_NamedForEnd
{
	public static void main(String[] args) {
	      // for문에 Loop1이라는 이름을 붙였다.
			Loop1 : for(int i=2;i <=9;i++) {	
						for(int j=1;j <=9;j++) {
							if(j==5)
								break Loop1; //2*1=2 2*2=4 2*3=6 2*4=8
//								break; //2*1=2 2*2=4 2*3=6 2*4=8  3*1=3 3*2=6 3*3=9 3*4=12  4*1=4 4*2=8 4*3=12 4*4=16  5*1=5 5*2=10 5*3=15 5*4=20  6*1=6 6*2=12 6*3=18 6*4=24  7*1=7 7*2=14 7*3=21 7*4=28  8*1=8 8*2=16 8*3=24 8*4=32  9*1=9 9*2=18 9*3=27 9*4=36
//								continue Loop1;//--> 잘 사용하지 않지만 위와 같은 것이 출력됨
//								continue;//i*5일때만 빼고 9*9까지 출력
							System.out.println(i+"*"+ j +"="+ i*j);
						} // end of for i
						System.out.println();
			} // end of Loop1

	}
}