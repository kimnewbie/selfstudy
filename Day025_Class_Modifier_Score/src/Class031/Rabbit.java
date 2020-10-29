package Class031;

public class Rabbit {
	//멤버변수
	private int a_private; //은닉된 멤버변수/필드 접근 제한자 -----> 현재 블록안에서만 접근 가능
	protected int b_protected;
			int c_package; //생략하면 default=package
	public int d_public;
	
	//멤버함수	
	@Override
	public String toString() {
		return "Rabbit [a_private=" + a_private + ", b_protected=" + b_protected + ", c_package=" + c_package
				+ ", d_public=" + d_public + "]";
	}
	//a_private 사용할 수 있도록 ▼ getters setters 사용
	//setter - (set함수)은닉된 멤버 변수에 값을 넣음
	public void setA_private(int a_private) {
		this.a_private = a_private;
	}
	//getter - (get함수)은닉된 멤버변수의 값을 읽는 방법
	public int getA_private() {
		return a_private;
	}
	
	
	
	public int getB_protected() {
		return b_protected;
	}
	public void setB_protected(int b_protected) {
		this.b_protected = b_protected;
	}
	public int getC_package() {
		return c_package;
	}
	public void setC_package(int c_package) {
		this.c_package = c_package;
	}
	public int getD_public() {
		return d_public;
	}
	public void setD_public(int d_public) {
		this.d_public = d_public;
	}
	//생성자
	public Rabbit() {super();}	
	public Rabbit(int a_private, int b_protected, int c_package, int d_public) {
		super();
		this.a_private = a_private;
		this.b_protected = b_protected;
		this.c_package = c_package;
		this.d_public = d_public;
	}
}
