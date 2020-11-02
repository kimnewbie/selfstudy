class ParentClass {

	private int x;
	private int y;
	
	public ParentClass(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}

	public void xyDisplay()
	{
		System.out.println("ParentClass, x = " + x + ", y = " + y);
	}
}

class ChildClass extends ParentClass{
	private int x;
	private int y;

	public ChildClass(int x, int y)
	{
		super(x * 3, y * 2);
		this.x = x;
		this.y = y;
	}

	public void childMethod()
	{
		super.xyDisplay();	//부모 클래스 멤버 변수 접근 : super.멤버변수/ super.멤버메서드(매개변수);/ 생성자호출 super(매개변수);
		xyDisplay();
	}

	public void xyDisplay()
	{
		System.out.println("ChildClass, x = " + x + ", y = " + y);
	}
}
class InheritanceExample {
	public static void main(String[] args)	{
		
		ChildClass child = new ChildClass(44, 7); 
		//ChildClass() 객체를 생성하면서 ChildClass의 생성자를 호출하며 44와 7을 매개변수로 
		child.childMethod();
	}
}