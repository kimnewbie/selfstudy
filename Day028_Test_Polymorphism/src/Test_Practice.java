class Score{
	//멤버변수
	private int kor, eng, math;
	private String name, pass;
	private double avg;
	
	//멤버함수
	public int getKor() { return kor; } public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; } public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; } public void setMath(int math) { this.math = math; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public String getPass() { return pass; } public void setPass(String pass) { this.pass = pass; }
	public double getAvg() { return avg; } public void setAvg(double avg) { this.avg = avg; }
	@Override
	public String toString() {
		return "Score [kor=" + kor + ", eng=" + eng + ", math=" + math + ", name=" + name + ", pass=" + pass + ", avg="
				+ avg + "]";
	}
	
	//생성자
	public Score() { super(); }
	public Score(int kor, int eng, int math, String name, String pass, double avg) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
		this.pass = pass;
		this.avg = avg;
	}
	public Score(String name, int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
	}
	
}
///
class ScoreProcess{
	void process_avg(Score[] std){
		for(int i=0; i<std.length; i++) {
			std[i].setAvg((std[i].getKor()+std[i].getEng()+std[i].getMath())/3f);
		}
	}
	void process_pass(Score[] std){
		for(int i=0; i<std.length; i++) {
			if(std[i].getAvg()>=60) {std[i].setPass("합격");}
			else {std[i].setPass("불합격");}
		}
	}
	public ScoreProcess() { super(); }
	
}
///
class ScorePrint{

	public ScorePrint() { super(); }
	public void show(Score[] std) {
		System.out.println("=================================================");
		System.out.println("\t국어\t영어\t수학\t평균\t합격여부");
		System.out.println("=================================================");
		for(int i=0; i<std.length; i++) {
			System.out.println(std[i].getName()+"\t"+std[i].getKor()+"\t"+std[i].getEng()
					+"\t"+std[i].getMath()+"\t"+String.format("%.2f",std[i].getAvg())+"\t"+std[i].getPass());
		}
	}
}
///
public class Test_Practice {

	public static void main(String[] args) {
		// 호출방식
		// 멤버변수
		Score[] std = new Score[3];
		std[0] = new Score("아이언맨",100,100,100);
		std[1] = new Score("헐크",90,60,80);
		std[2] = new Score("블랙팬서",20,60,90);
		ScoreProcess process = new ScoreProcess();
		process.process_avg(std);
		process.process_pass(std);
		ScorePrint print = new ScorePrint();
		print.show(std);		
	}
}