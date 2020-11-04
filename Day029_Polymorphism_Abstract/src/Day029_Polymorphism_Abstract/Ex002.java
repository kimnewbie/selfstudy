package Day029_Polymorphism_Abstract;

import java.util.Arrays;

class Fruit{  @Override public String toString() { return "Fruit"; }  }
class Apple extends Fruit{
	public void ap() {System.out.println("사과는 빨갛다");}
	@Override public String toString() { return "Apple"; } 
}
class Banana extends Fruit{
	public void bana() {System.out.println("바나나는 노랗다");}
	@Override public String toString() { return "Banana"; }
}
class Coconut extends Fruit{
	public void coco() {System.out.println("코코넛은 코코하다");}
	@Override public String toString() { return "Coconut"; }
}
public class Ex002 {
	public static void main(String[] args) {
		System.out.println("ver-1");
		Fruit[] fruit = {new Apple(), new Banana(), new Coconut()};
		System.out.println( Arrays.toString(fruit));
		
		System.out.println("ver-2");
		Fruit[] fruit2 = new Fruit[3];
		fruit2[0] = new Apple();
		fruit2[1] = new Banana();
		fruit2[2] = new Coconut();
		System.out.println(Arrays.toString(fruit2));
		
		System.out.println("ver-3");
		//(변수 instanceof 클래스명) {((클래스명)변수).클래스메서드();}
		for(int i=0; i<fruit.length; i++) {
		if(fruit[i] instanceof Apple) {((Apple)fruit2[i]).ap();}
		else if(fruit[i] instanceof Banana) {((Banana)fruit2[i]).bana();}
		else if(fruit[i] instanceof Coconut) {((Coconut)fruit2[i]).coco();}
		}
	}	
}