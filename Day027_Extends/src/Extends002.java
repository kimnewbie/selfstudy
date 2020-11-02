class Color {
	private String name;

	public String getName() { return name; }  
	public void setName(String name) { this.name = name; }
	@Override public String toString() { return "Color [name=" + name + "]"; }
	public Color() { super(); }
	public Color(String name) { super(); this.name = name; }
	
 }
class Green extends Color{
	private int num;
	
	public int getNum() { return num; }  public void setNum(int num) { this.num = num; }

	public void show() {
		System.out.println("::::: GREEN");
		System.out.println("= NAME : " + super.getName());
		System.out.println("= NUM : " + this.num);
	}
	
	public Green(){super();} //##
	public Green(int num) { super(); this.num = num; } //## ---> 이렇게 두개만 해도되지만, 다양성을 위해 밑에 생성자도 생성
	public Green(String name) {super(name);}
	public Green(String name, int num) { super(name); this.num = num; }
	

	@Override public String toString() { return "Green [num=" + num + "]"; }	
}
public class Extends002 {
	public static void main(String[] args) {
		Green mygreen = new Green();
		mygreen.setName("LIGHT_GREEN"); //my.name="LIGHT_GREEN"은 private때문에 오류 getter/setter 이용
		mygreen.setNum(5);
		mygreen.show();
	}
}
