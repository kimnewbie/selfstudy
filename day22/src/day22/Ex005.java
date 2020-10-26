package day22;
class Student003{
		//멤버변수
		String name; int ban; int	no; int	kor; int	eng; int	math;
		//멤버함수
		//생성자
		Student003(){}
		Student003(String name, int ban, int no, int kor, int eng, int math){
			this.name = name; this.ban = ban; this.no = no; this.kor = kor;
			this.eng = eng; this.math = math; //source 함수로 가능함
		}
		public int getTotal() {
			return this.kor+this.eng+this.math;
		}
		public float getAverage() {
			return (Math.round(this.getTotal()*10/3f)/10f);
		}
		 
		public String info() {
			return this.name + "," + this.ban + "," +  this.no + "," +  this.kor + "," +  this.eng + "," +  this.math
					+ "," +   this.getTotal() + "," +   this.getAverage();
		}
}
public class Ex005 {
	public static void main(String[] args) {
		Student003 s3 = new Student003("홍길동", 1,1,100,60,76);
		System.out.println(s3.info()); // 홍길동,1,100,60,76,236,78.7
		/*
		 Q5. 다음과 같은 결과를 얻도록 구현하시오.
		 [Student003]
		 getTotal()
		 getAverage()
		 
		 타입	변수명	설명
		 String	name	학생이름
		 int	ban		반
		 int	no		번호
		 int	kor		국어점수
		 int	eng		영어점수
		 int	math	수학점수
		 
		 :::: 주어진옵션
		 public class Ex005 {
		 	public static void main(String[] args) {
				Student003 s3 = new Student003("홍길동", 1,1,100,60,76);
				System.out.println(s3.info()); // 홍길동,1,100,60,76,236,78.7
			}//end main
		}end class
		
		:::: 실행결과
		홍길동,1,1,100,60,76,236,78.7
		 */
	}
}
