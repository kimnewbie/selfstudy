package Day029_Polymorphism_Abstract;

import java.util.Arrays;

class Animal1{ String name; public String toString() {return "Animal1";} }
class Dog1 extends Animal1 { void bark() {System.out.println("멍멍!");} public String toString() {return "Dog1";} }
class Cat1 extends Animal1 { void meow() {System.out.println("야옹!");} public String toString() {return "Cat1";} }
class Pig1 extends Animal1 { void oink() {System.out.println("꿀꿀!");} public String toString() {return "Pig1";} }
public class Ex001 {
	public static void main(String[] args) {
		System.out.println("ver-1");
		Animal1[] myani = {new Animal1(), new Dog1(), new Cat1(), new Pig1()}; //[Dog1, Cat1, Pig1]
		System.out.println( Arrays.toString(myani));
		
		System.out.println("ver-2");
		Animal1[] myani2 = new Animal1[4];
		myani2[0] = new Animal1();
		myani2[1] = new Dog1();
		myani2[2] = new Cat1();
		myani2[3] = new Pig1();
		System.out.println( Arrays.toString(myani2)); //[Animal1, Dog1, Cat1, Pig1]
		
		System.out.println("ver-3");
		//어디서 파생되었는지 확인 - [확인 할 붕어빵 instance 붕어빵들]
		for(int i=0; i<myani2.length; i++) {
			if(myani2[i] instanceof Dog1) {((Dog1)myani2[i]).bark();}
			else if(myani2[i] instanceof Cat1) {((Cat1)myani2[i]).meow();}
			else if(myani2[i] instanceof Pig1) {((Pig1)myani2[i]).oink();}
		}
	}
}
