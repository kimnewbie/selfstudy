package Day032;

interface Animal{
	public void eat();
	public void sleep();
	public void poo();	
}
class Monkey implements Animal{
	@Override public void eat() { System.out.println("바나나 냠냠!"); }
	@Override public void sleep() { System.out.println("HOUSE에서 자요"); }
	@Override public void poo() { System.out.println("시원해요"); }	
}
public class Anonymous002 {
	public static void main(String[] args) {
		Animal ani = new Monkey();
		ani.eat(); // 바나나 냠냠!
		ani.sleep();
		ani.poo();
		
		Animal ani2 = new Animal() { // (1) 오버라이딩해주고 | new Animal이 안되는데 {} 구현부 작성해주면 가능!!
			@Override public void eat() { System.out.println("바나나 냠냠!"); }
			@Override public void sleep() { System.out.println("HOUSE에서 자요"); }
			@Override public void poo() { System.out.println("시원해요");  }			
		}; // (2) 밑에 출력해주면 이벤트 클래스 버전 완성
		ani2.eat();
		ani2.sleep();
		ani2.poo();
	}
}
