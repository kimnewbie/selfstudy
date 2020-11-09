package Day032;
class Outer001{
	class Inner{
		int iv = 100;
	}
}
public class Class002_Inner {
	public static void main(String[] args) {
		System.out.println("[ver-1]");
		Outer001.Inner ii = new Outer001().new Inner();
		System.out.println(ii.iv);
		
		System.out.println("\n[ver-2]");
		Outer001 i1 = new Outer001();
		Outer001.Inner i2 = i1.new Inner();
		System.out.println(i2.iv);
	}
}
