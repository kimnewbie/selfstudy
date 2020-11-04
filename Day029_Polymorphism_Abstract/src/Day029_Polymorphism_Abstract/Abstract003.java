package Day029_Polymorphism_Abstract;
abstract class Calc{//변수 만들필요가 없어~ 그리고 생성자도 ㄴㄴ
	
	public abstract double exec(double num1, double num2);
	
}
///
class Plus extends Calc{

	@Override public double exec(double num1, double num2) { return num1+num2; }
}
///
class Minus extends Calc{

	@Override public double exec(double num1, double num2) {  return num1-num2; }
}
///
class Multiply extends Calc{

	@Override public double exec(double num1, double num2) { return num1*num2; }

}
///
class Divide extends Calc{

	@Override public double exec(double num1, double num2) {  return num1/num2; }

}
public class Abstract003 {
	public static void main(String[] args) {
		//Test001
		//Calc mycalc = new Calc(); //error 생각해볼 문제 1) new가 안되는 이유? 추상클래스라서 {}구현부가 없어 new안됨
		//Test002
		//※ 다형성을 이용하여 다음과 같이 출력하시오.
		//※ mycalc는 Plus, Minus, ... 등을 담을 수 있다
		//※ 부모는 자식을 담을 수 있다.
		/*		  Calc
		 ↑		↑		↑		↑
		 Plus Minus Multiply Divied*/
		int num1 = 10; int num2 = 3;
		Calc mycalc = null;
		mycalc = new Plus(); System.out.println("더하기 : " + mycalc.exec(num1, num2));
		mycalc = new Minus(); System.out.println("빼기 : " + mycalc.exec(num1, num2));
		mycalc = new Multiply(); System.out.println("곱하기 : " + mycalc.exec(num1, num2));
		mycalc = new Divide(); System.out.println("나누기 : " + String.format("%.2f", mycalc.exec(num1, num2)));
		
		
	}
}
