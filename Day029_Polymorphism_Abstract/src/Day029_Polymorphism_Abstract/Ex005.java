package Day029_Polymorphism_Abstract;

abstract class Shape_ex{ abstract double calcArea(); }
///
class Circle_ex extends Shape_ex{
	
	double r;

	public Circle_ex() { super(); }
	public Circle_ex(double r) { 
		super();
		//Point c = new Point(d,d); --> super안에 넣어랏	
		this.r = r;
	}
	@Override double calcArea() {return this.r*this.r*Math.PI;}
	@Override public String toString() { return super.toString() + "Circle_ex [r=" + r + "]"; }
}
///
class Rectangle_ex extends Shape_ex{
	
	double width, height;

	public Rectangle_ex() { }

	public Rectangle_ex(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override double calcArea() {return this.width*this.height;}
	public boolean isSquare() {return width==height && width*height>0;}
	
}
public class Ex005 {
	public static double sumArea(Shape_ex[] arr) {//배열에 담긴 도형들의 넓이 모두 더하ㅏ여 반환
		double box=0;
		for(int i=0; i<arr.length; i++) {box+=arr[i].calcArea();}
		return box;
	}
	public static void main(String[] args) {
		Shape_ex[] arr = {new Circle_ex(5.0), new Rectangle_ex(3,4), new Circle_ex(1)};
		System.out.println("면적의 합 : " + sumArea(arr));
	}
}
