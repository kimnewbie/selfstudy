package Day032;
class Outer003{
	static class Inner{
		int iv = 200; // static 클래스의 지역변수
	}
}
public class Class003_Inner {
	public static void main(String[] args) {
		System.out.println("[ver-1]");
		/**
		Outer003.Inner oo = new Outer003.new Inner(); // 인스턴스 변수였을 경우에
		System.out.println(oo.iv);
		 */
//							new [외부클래스명].[내부클래스] - 멤버변수처럼 사용가능해, 메모리상에 먼저올라갔으니까 이런 형식
		Outer003.Inner oo = new Outer003.Inner(); // new가 한번만 필요해~ static이라, 인스턴스면 new 두번했어야함
		System.out.println(oo.iv);
	}
}
