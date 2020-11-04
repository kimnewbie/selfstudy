package Day029_Polymorphism_Abstract;
abstract class Calc0{ //공통변수라서 ㅇㅇ ★설명다시보삼...
	
	//클래스(50%) + 설계(50%) => abstract 클래스 - 테스트용으로 사용 (프로젝트용으로는 ㄴㄴ)
	double num1, num2;
	public abstract double exec(double num1, double num2);
	public abstract double exec();
	public Calc0() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calc0(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
}
///
class Plus0 extends Calc0{

	@Override public double exec(double num1, double num2) { return num1+num2; }
	@Override public double exec() { return num1+num2; }

	public Plus0() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plus0(double num1, double num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}
	
}
///
class Minus0 extends Calc0{

	@Override public double exec(double num1, double num2) {  return num1-num2; }
	@Override public double exec() {  return num1-num2; }

	public Minus0() { super(); }
	public Minus0(double num1, double num2) { super(num1, num2); }
}
///
class Multiply0 extends Calc0{

	@Override public double exec(double num1, double num2) { return num1*num2; }
	@Override public double exec() { return num1*num2; }

	public Multiply0() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Multiply0(double num1, double num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

}
///
class Divide0 extends Calc0{

	@Override public double exec(double num1, double num2) {  return num1/num2; }
	@Override public double exec() {  return num1/num2; }

	public Divide0() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Divide0(double num1, double num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

}
public class Abstract003_theOther {
	public static void main(String[] args) {
		System.out.println("Test001: new 사용못함 - abstract 는 구현부{}가 없기때문에 상속시켜 자손클래스에서 구현해야한다.");
		//Test001
		//Calc mycalc = new Calc(); //error 생각해볼 문제 1) new가 안되는 이유? 추상클래스라서 {}구현부가 없어 new안됨
		//Test002
		
		System.out.println("Test002: 부모는 자식클래스를 담을 수 있다");
		//※ 다형성을 이용하여 다음과 같이 출력하시오.
		//※ mycalc는 Plus, Minus, ... 등을 담을 수 있다
		//※ 부모는 자식을 담을 수 있다.
		/*		  Calc
		 ↑		↑		↑		↑
		 Plus Minus Multiply Divied*/
		int num1 = 10; int num2 = 3;
		Calc0 mycalc = null; //-->다형성 이용하라는 뜻이었음
		mycalc = new Plus0(); System.out.println("더하기 : " + mycalc.exec(num1, num2));
		mycalc = new Minus0(); System.out.println("빼기 : " + mycalc.exec(num1, num2));
		mycalc = new Multiply0(); System.out.println("곱하기 : " + mycalc.exec(num1, num2));
		mycalc = new Divide0(); System.out.println("나누기 : " + String.format("%.2f", mycalc.exec(num1, num2)));
		
		System.out.println("Test003: 부모는 자식클래스를 담을 수 있다");
		//toString사용해
		mycalc = new Plus0(10,3); System.out.println("더하기 : " + mycalc.exec());
		mycalc = new Minus0(10,3); System.out.println("빼기 : " + mycalc.exec());
		mycalc = new Multiply0(10,3); System.out.println("곱하기 : " + mycalc.exec());
		mycalc = new Divide0(10,3); System.out.println("나누기 : " + String.format("%.2f", mycalc.exec()));
	}
}
