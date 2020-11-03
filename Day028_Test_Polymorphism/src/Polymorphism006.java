class Mother{
	int ma = 10; int mb = 20;

	public Mother() {super();}
	public Mother(int ma) {this.ma = ma;}
	public Mother(int ma, int mb) { super(); this.ma = ma; this.mb = mb; }
	public void func() {System.out.println("==Mother");}
	
}
///
class Daughter extends Mother{
	
	int mb = 30; int mc = 40;

	public Daughter() { super(); }
	public Daughter(int ma, int mb) { super(ma, mb); }
	public Daughter(int ma, int mb, int mc) {
		super(ma);
		this.mb = mb;
		this.mc = mc;
	}
	@Override public void func() { /*super.func();*/ System.out.println("ㅁㅁDaughter");}
}
public class Polymorphism006 {
	public static void main(String[] args) {
		////////////////////////////////////////////////
		System.out.println(":::::: 1)TEST");
		Mother mo = new Mother();
		System.out.println("mo.ma : " +  mo.ma);
		System.out.println("mo.mb : " +  mo.mb);
		mo.func();
		////////////////////////////////////////////////
		System.out.println(":::::: 2)TEST");
		Daughter da = new Daughter();
		System.out.println("da.ma : " +  da.ma); //10
		System.out.println("da.mb : " +  da.mb); //30
		System.out.println("da.mc : " +  da.mc); //40
		da.func();
		
		//da = (Daughter) mo; 
		System.out.println(da);
		////////////////////////////////////////////////
		System.out.println(":::::: 3)TEST");
		Mother md = new Daughter();
		System.out.println("mf.ma : " +  md.ma);
		System.out.println("md.mb : " +  md.mb);
		//System.out.println("md.mc : " +  md.mc);-->(Daughter)md.mc --> Mother에 mc의 변수가 없어서
		md.func();
		////////////////////////////////////////////////
		
		System.out.println(":::::: 4)TEST");
		System.out.println((float)10);
		//Daughter dm = (Daughter) new Mother();
		
		System.out.println(":::::: 5)TEST");
		Daughter dd = new Daughter();
		Mother md2 = da;
		System.out.println("md2.ma : " +  md2.ma); //10
		System.out.println("md2.mb : " +  md2.mb); //20
		//System.out.println("md2.mc : " +  md2.mc);-->(Daughter)md.mc --> Mother에 mc의 변수가 없어서
		
		//mc를 쓰려면 타입캐스팅 해주어야 가능하드아
		System.out.println("md2.mc : " +  ((Daughter)md2).mc); //40
		md2.func();
	}
}
