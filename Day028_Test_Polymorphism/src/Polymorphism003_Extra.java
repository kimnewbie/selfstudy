class Mama extends Object{
	

	int money = 10;
	public Mama() { super(); }	
	@Override public String toString() { return "Mama [money=" + money + "]"; }
	
}
///
class Son1 extends Mama{
	int money = 150;
	int car = 2;
	public Son1() { super(); }
	@Override public String toString() { return "Son1 [money=" + money + ", car=" + car + "]"; }
	
}
public class Polymorphism003_Extra {
	public static void main(String[] args) {
		//1. 생성자는 인스턴스변수를 초기화해서 사용가능하게 해준다.
		Mama mom = new Mama();	//Mama[money]
		Son1 son = new Son1();	//Son[money, car] - Mama[money] (Mama를 불러주고 money 초기화)
		
		System.out.println(mom.money); //### 10출력
		//2. 조상은 자식을 담을 수 있다.(업캐스팅 : 부모 <- 자식 )
		Mama mom2 = new Son1();	//mom2[money]
		// Son()[--,--,toString] => Mama[money=10|toString] 
		// Mama 생성자호출 후 Son()의 toString이 오버라이딩 되면서 Mama께 없어짐 => Mama[money=10|-----------] 
		// => Object[멤버변수|멤버함수]
		
		System.out.println(mom2.toString()); //Son1 [money=150, car=2]
		System.out.println(mom2.money); //10

		//3. 
		Son1 son2 = new Son1();
		son2 = (Son1) mom2; //(타입캐스팅 안넣어주면 안됨 그래서 (Son) 넣음) ###가능한코드? 가능
		// Mama mom2 = new Son1() Mama가 Son1을 호출한 적이 있으므로
		// son2도 자료를 다 가지고 있다		
		System.out.println(son2.money + "\t" + son2.car); //### 얼마 출력? son2.money 150, son2.car 2 출력
		//##4. 엄마돈 10원 출력
		System.out.println(((Mama)son2).money);
		
		//4. 
		Son1 son3 = (Son1) new Mama(); //son3[money,car] = > X 셋팅이 안됨 =>Mama()[money=10|---]
		// 컴파일시 타입만 체크하기때문에 에러가 발생하지는 않지만 실행시 에러가 발생한다.
		// Like int a = (int) 1.1; 과 같이 타입은 오류가 나지 않는다.
		
		
	}
}
