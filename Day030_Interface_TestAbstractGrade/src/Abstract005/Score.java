package Abstract005;

public class Score { //---------------MVC(MODEL: DB, VIEW: 화면, CONTROLLER: 해결사)
	
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getKor() { return kor; } public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; } public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; } public void setMath(int math) { this.math = math; }
	public int getTotal() { return total; } public void setTotal(int total) { this.total = total; }
	public double getAvg() { return avg; } public void setAvg(double avg) { this.avg = avg; }
	public Score(String name, int kor, int eng, int math, int total, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
	}
	public Score(String name, int kor, int eng, int math) { //이 부분이 필요함
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Score() { super(); }  
}
class ScoreDto extends Score{
	private String jang;
	private String Star;
	private String pass;
	
	public String getJang() { return jang; } public void setJang(String jang) { this.jang = jang; }
	public String getStar() { return Star; } public void setStar(String star) { Star = star; }
	public String getPass() { return pass; } public void setPass(String pass) { this.pass = pass; }
	public ScoreDto() { super(); }

	public ScoreDto(String name, int kor, int eng, int math, int total, double avg) {
		super(name, kor, eng, math, total, avg);
	}
	public ScoreDto(String name, int kor, int eng, int math, int total, double avg, String jang, String star,
			String pass) {
		super(name, kor, eng, math, total, avg);
		this.jang = jang;
		this.Star = star;
		this.pass = pass;
	}
	public ScoreDto(String jang, String star,String pass) { //나는 생각하지 못했던 부분, 여기 클래스 변수
		super();
		this.setJang(jang);
		this.setStar(star);
		this.setPass(pass);
	}
	public ScoreDto(String name, int kor, int eng,int math) { //point 
		super(); super.setName(name); super.setKor(kor); super.setEng(eng); super.setMath(math);}
	
}

