package Day029_Polymorphism_Abstract;
abstract class shape{
	//오버로딩
	public abstract void showArea(int width, int height);
	public abstract void showArea(int radius);
//	public abstract void width();
//	public abstract void height();
//	public abstract void radius();
	
}
///
class Rectangle extends shape{ //Override 두개 다 써줘야 내가 안써도

	@Override
	public void showArea(int width, int height) {
		System.out.println("사각형의 넓이 : " +(width*height));
		
	}

	@Override
	public void showArea(int radius) {
		// TODO Auto-generated method stub
		
	}
}
///
class Triangle extends shape{

	@Override
	public void showArea(int width, int height) {
		System.out.println("삼각형의 넓이 : " +(width*height)/2);
		
	}

	@Override
	public void showArea(int radius) {
		// TODO Auto-generated method stub
		
	}
}
///
class Circle extends shape{

	@Override
	public void showArea(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showArea(int radius) {
		System.out.println("원의 넓이 : " +(radius*radius)*Math.PI);
		
	}
}
///
public class Abstract002 {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.showArea(10,10);
		
		Triangle tri = new Triangle();
		tri.showArea(10,10);
		
		Circle cir = new Circle();
		cir.showArea(10);
	}
}
