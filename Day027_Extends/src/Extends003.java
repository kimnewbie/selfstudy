class MobileNote7 extends Object { //부모클래스 extends Object
	//멤버변수
	private String iris; //홍채색상
	
	//멤버함수
	public String getIris() { return iris; } public void setIris(String iris) { this.iris = iris; }	
	@Override public String toString() { return "MobileNote7 [iris=" + iris + "]"; }
	
	public void newShow() {
		System.out.println(":::: NOTE7새로운기능(Overriding)");
		System.out.println("= iris 홍채인식기능!");
		System.out.println("= myiris : "+this.iris);
	}
	//생성자
	public MobileNote7() { super(); }
	public MobileNote7(String iris) { super(); this.iris = iris; }

	

}
class MobileNote8 extends MobileNote7{ // ##1. 상속받고
	//멤버변수
	private String face;	
	
	//멤버함수
	
	public void newShow() { 			// ##2. 부모메서드와 같은 게 있다면 -> @Override (source에서 override 사용할 수 있음) : 상속, 부모메서드와 같다면
		super.newShow(); //##3. 부모 메서드 호출
		System.out.println(":::: NOTE8새로운기능(Overriding)"); //##4. 새로운 부분만 추가 수정
		System.out.println("= face 안면인식기능!");
		System.out.println("= face : "+ this.face);
	}

	@Override public String toString() { return "MobileNote8 [face=" + face + "]"; }
	public String getFace() { return face; }   public void setFace(String face) { this.face = face; }
	
	//생성자
	public MobileNote8() { super(); }
	public MobileNote8(String face) { super(); this.face = face; }
	public MobileNote8(String iris, String face) {super(iris); this.face = face;}
	
}
class MobileNote9 extends MobileNote8{
	//멤버변수
	private int battery;
	
	//멤버함수
	public int getBattery() { return battery; } public void setBattery(int battery) { this.battery = battery; }
	public void newShow() {
		super.newShow();
		System.out.println(":::: NOTE9새로운기능(Overriding)");
		System.out.println("= battery 하루종일 사용가능!");
		System.out.println("= battery : "+ this.battery);
	}
	
	//생성자
	public MobileNote9() { super(); this.battery =24; } // 여기에 this.batter=24;를 입력해준다
	public MobileNote9(String iris, String face) { super(iris, face); }
	public MobileNote9(String face) { super(face); }	
	public MobileNote9(int battery) { super(); this.battery = battery; }
}

public class Extends003 {
	public static void main(String[] args) {
		MobileNote9 my9 = new MobileNote9();
		my9.setIris("brown");
		my9.setFace("Pretty");
		my9.newShow();
	}
}
