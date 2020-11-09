package Day032;
class Kimbob{
	String name; int price;
	class DanMuGi{
		public void show() {
			System.out.println("*단무지추가");
		}		
	}
	class Rice{
		public void show() {
			System.out.println("*밥추가");
		}		
	}
	class Kim{
		public void show() {
			System.out.println("*김추가");
		}		
	}
	public void order() {
		Kim		k1 = new Kim();		k1.show();
		Rice	r1 = new Rice();	r1.show();
		DanMuGi d1 = new DanMuGi();	d1.show();
	}
}
public class Class001_Inner {
	public static void main(String[] args) {
		System.out.println("[ver-1]");
		Kimbob.Kim kim = new Kimbob().new Kim();
		kim.show();
		Kimbob.Rice bob = new Kimbob().new Rice();
		bob.show();
		Kimbob.DanMuGi dan = new Kimbob().new DanMuGi();
		dan.show();
		dan.show();
		
		System.out.println("\n[ver-2]");
		Kimbob order = new Kimbob();
		order.order();
		Kimbob.DanMuGi dan2 = new Kimbob().new DanMuGi();
		dan2.show();
	}
}
