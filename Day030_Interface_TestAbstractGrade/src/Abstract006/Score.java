package Abstract006;

public class Score {
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
	
	public Score() { super(); }
	public Score(String name, int kor, int eng, int math, int total, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
	}
	
}
class ScoreDto extends Score {
	private String jang;
	private String star;
	private String pass;
	
	public String getJang() { return jang; } public void setJang(String jang) { this.jang = jang; }
	public String getStar() { return star; } public void setStar(String star) { this.star = star; }
	public String getPass() { return pass; } public void setPass(String pass) { this.pass = pass; }
	
	public ScoreDto() { super(); }
	public ScoreDto(String jang, String star, String pass) {
		super();
		this.jang = jang;
		this.star = star;
		this.pass = pass;
	}
	public ScoreDto(String name, int kor, int eng, int math) {
		super();
		super.setName(name);
		super.setKor(kor);
		super.setEng(eng);
		super.setMath(math);
		
	}
}
