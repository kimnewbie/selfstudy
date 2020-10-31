package ClassArr004;

public class Score {
	//멤버변수
	private String name; private int kor, eng, math;
	private double avg; private String pass;
	
	//멤버함수
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + ", pass="
				+ pass + "]";
	}
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getKor() { return kor; } public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; } public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; } public void setMath(int math) { this.math = math; }
	public double getAvg() { return avg; } public void setAvg(double avg) { this.avg = avg;
	}
	public String getPass() { return pass; } public void setPass(String pass) { this.pass = pass; }

	//생성자
	public Score() { super(); } //기본
	public Score(String name, int kor, int eng, int math, double avg, String pass) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
		this.pass = pass;
	}
	public Score(String name, int kor, int eng, int math) {
		this();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;		
	}		
}
