package Day033_Collection;
 
import java.util.Vector;

public class Collection002 {
	public static void main(String[] args) { // 배열을 보완하고자 만들어진 Vector!!  ( ͝° ͜ʖ͡°) 
		System.out.println("\nCOLOR");
		Vector vec = new Vector();
		vec.add("RED");	vec.add("GREEN");	vec.add("BLUE");	vec.add("BLACK");
		System.out.println(vec); // [RED, GREEN, BLUE, BLACK]
		for(int i=0; i<vec.size(); i++) {
			System.out.println(vec.get(i));
		}
		System.out.println("\nMILK");
		Vector milk = new Vector();
		milk.add("white");	milk.add("choco");	milk.add("banana");
		System.out.println(milk); // [white, choco, banana]
		System.out.println(milk.size());
		for(int i=0; i<milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		System.out.println("\nFRUIT");
		Vector fruit = new Vector();
		fruit.add("apple");	fruit.add("banana"); fruit.add("coconut"); fruit.add("banana");
		System.out.println(fruit); // [apple, banana, coconut]
		for(int i=0; i<fruit.size(); i++) {
			System.out.println(fruit.get(i));
		}
		fruit.remove("banana"); // 중복될 경우 앞에꺼 먼저 삭제됨
		System.out.println(fruit); // [apple, coconut, banana]
		
	}
}
