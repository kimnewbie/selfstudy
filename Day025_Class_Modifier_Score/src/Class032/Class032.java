package Class032;

public class Class032 {
	public static void main(String[] args) {
		Milk m1 = new Milk();
		System.out.println(m1);
		m1.setMprice(2000);
		System.out.println(m1);
		
	}
}
/*
ㅁ출력된 화면
Milk[mno=0, mname=null, mprice=0]
Milk[mno=0, mname=null, mprice=2000]

ㅁ주어진조건
class Milk{
	private int mno;
	private String mname;
	private int mprice;
}
public class Class032 {
	public static void main(String[] args) {
		Milk m1 = new Milk;
		System.out.println(m1);
		m1.setMprice(2000);
		System.out.println(m1);
*/