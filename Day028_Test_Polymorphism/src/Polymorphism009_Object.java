class ObjectTest{
	public ObjectTest() {}
	
	public void show(String str) {System.out.println(str.toString());}
	public void show(Integer str) {System.out.println(str.toString());}
	public void show(Double str) {System.out.println(str.toString());}
	/////////// 문제 showTotal 메서드 만들기
	//1. 부모클래스(Object)는 자식클래스를 담을 수 있다.
	//2. Object는 어떤 형태의 클래스이든 간에 부모가 된다.
	//3. Object는 모든 클래스를 담을 수 있다.
	public void showTotal(Object str) {System.out.println(str.toString());}
	// Object str = new String("HAPPY") / Object str = new Integer (10) / Object str = new Double (3.14)
	// 				@Override toString				 @Override toString		 		@Override toString
}


public class Polymorphism009_Object {
	public static void main(String[] args) {
		ObjectTest test = new ObjectTest();
		test.show( new String ("HAPPY"));	//HAPPY [void|show|String]
		test.show( new Integer (10)); 		// Integer,parseInt [void|show|Integer]
		test.show( new Double (3.14)); 		// Double.parseDouble [void|show|Double]
		
		System.out.println("\n\nshowTotal이라는 매서드 한개만 만들기");
		test.showTotal( new String ("HAPPY"));	//HAPPY [void|showTotal|String]
		test.showTotal( new Integer (10)); 		// Integer,parseInt [void|showTotal|Integer]
		test.showTotal( new Double (3.14)); 		// Double.parseDouble [void|showTotal|Double]
	}
}