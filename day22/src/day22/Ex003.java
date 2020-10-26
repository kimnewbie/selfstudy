package day22;
class Student001{
	//멤버변수
	String name; int ban; int	no; int	kor; int	eng; int	math;	
	//멤버함수
	@Override
	public String toString() {
		return "Student001 [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]"; }
	//생성자
	Student001(){}
}
public class Ex003 {	
	public static void main(String[] args) {
		Student001 s1 = new Student001(); System.out.println(s1);
		/*
		ㅁ 다음과 같은 멤버변수를 갖는 클래스를 정의하시오
		[Student001]
		타입		변수명	설명
		String	name	학생이름
		int		ban		반
		int		no		번호
		int		kor		국어점수
		int		eng		영어점수
		int		math	수학점수
		
		※힌트
		필요없는 구성은 생략이 가능하다.
		class Student001{
			//멤버변수
			//멤버함수
			//생성자
		}
		
		ㅁ 출력된 화면
		[name=null, ban=0, no=0, kor=0, eng=0, math=0]
		
		ㅁ 주어진 옵션
		public static void main(String[] args) {
			Student001 s1 = new Student001(); System.out.println(s1);
		 */		 
	}
}
