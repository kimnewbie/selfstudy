class Grand extends Object{
	public void one() {System.out.println("grand : one");}
	public void two() {System.out.println("grand : two");}
}//end Grand

class Father extends Grand{//1) Grand 상속받기 ### (1)
	public void Three() {System.out.println("father : three");}
}//end Grand

class Uncle extends Grand{//2) t상속받기 ### (2)
	public void four() {System.out.println("uncle : four");}
	@Override //2-2) one 오버라이딩 : uncle : one 출력 ### (3)
	public void one() {super.one(); System.out.println("uncle : one");}
	@Override //2-3) two 오버라이딩 : uncle : two 출력 ### (4)
	public void two() {super.two(); System.out.println("uncle : two");}
}//end Grand

class Aunt extends Object{
	String name = "MiMi";
	@Override
	public String toString() {return name + "옆집이모클래스";}
}
public class Extends004 {
	public static void main(String[] args) {
		Father father = new Father(); father.Three(); father.two(); father.one();
		Uncle uncle = new Uncle();uncle.four(); uncle.two(); uncle.one();
		Aunt aunt = new Aunt();
		System.out.println(aunt.toString()); System.out.println(aunt);
	}
}
/*
father : three
grand : two
grand : one
uncle : four
grand : two
uncle : two
grand : one
uncle : one
MiMi옆집이모클래스
MiMi옆집이모클래스
*/