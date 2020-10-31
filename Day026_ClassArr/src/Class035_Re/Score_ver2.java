package Class035_Re;

public class Score_ver2 {
	//멤버변수
	private String name, p; private String s; private String rank ;
	private int kor, eng, math, total; private double aver;
	//멤버함수
	@Override
	public String toString() {
		return "Score_ver2 [name=" + name + ", p=" + p + ", s=" + s + ", rank=" + rank + ", kor=" + kor + ", eng=" + eng
				+ ", math=" + math + ", total=" + total + ", aver=" + aver + "]";
	}
	public String getName() { return name; } 
	public void setName(String name) { this.name = name; }
	public String getP() { return p; } public void setP(String p) { this.p = p; }
	public String getS() { return s; } public void setS(String s) { this.s = s; }
	public String getRank() { return rank; } public void setRank(String rank) { this.rank = rank; }
	public int getKor() { return kor; } public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; } public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; } public void setMath(int math) { this.math = math; }
	public int getTotal() { return total; } public void setTotal(int total) { this.total = total; }
	public double getAver() { return aver; } public void setAver(double aver) { this.aver = aver; }
	//생성자
	public Score_ver2() {
		name=""; p=""; s=""; rank="";
		kor=eng=math=total=0;
		aver=0;
	}
	public Score_ver2(String name, String p, String s, String rank, int kor, int eng, int math, int total, double aver) {
		super();
		this.name = name;
		this.p = p;
		this.s = s;
		this.rank = rank;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.aver = aver;
	}
	public Score_ver2(String name, int kor, int eng, int math) {
		this();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}		
}
