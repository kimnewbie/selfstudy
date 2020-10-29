package Class034;

public class Score_ver1 {
	//멤버변수
	private String name, p; private String s; 
	private String rank ;
	private int kor, eng, math, total; private double aver;
	
	public void setName(String name) { this.name = name; }
	public void setKor(int kor) { this.kor = kor; }
	public void setEng(int eng) { this.eng = eng; }
	public void setMath(int math) { this.math = math; }

	//멤버함수
	//총점, 평균을 계산해주는 메소드
	public void process(){ this.total = this.kor+this.eng+this.math; this.aver = (this.total)/3.0; }
	//합격을 계산해주는 메소드 - 60점이상이면 합격 아니면 불합격
	public void pass(){ p = (this.aver>60)? "합격":"불합격"; }
	//장학생을 계산해주는 메소드 - 95점이상이면 장학생
	public void schola(){ s = (this.aver>=95)? "장학생":""; }
	//평균정도를 별로 보여주는 메소드 - 평균점수대만큼 별출력
	public void star(){  for(int i=0; i<(int)(this.aver/10); i++) { rank += "*"; } }
	//출력해주는 메소드
	public void show(){
		process();
		pass();
		schola();
		star();
		System.out.println(this.name+"\t"+this.kor+"\t"+this.eng+"\t"+this.math+"\t"+this.total+"\t"+String.format("%.2f", this.aver)+"\t"+this.p+"\t"+this.s+"\t"+this.rank);
	}
	public static void info(){
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+ "이름	국어	영어	수학	총점	평균	합격여부	장학생	랭킹\r"+
				":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
	@Override
	public String toString() {
		return "Score_ver1 [name=" + name + ", p=" + p + ", s=" + s + ", rank=" + rank + ", kor=" + kor + ", eng=" + eng
				+ ", math=" + math + ", total=" + total + ", aver=" + aver + "]";			
	}
	//생성자	
	public Score_ver1() { //null 값이 나와서 초기화 시켜준다.
		name=""; p=""; s=""; rank="";
		kor=eng=math=total=0;
		aver=0;
	}
	
	public Score_ver1(String name, int kor, int eng, int math) { 
		this(); //▲ 위에 생성자를 불렀어야해.왜냐면 초기화해줘야되거든. ▼밑은 필요없어 받아서 사용하기 때문에.....
				//생성자가 일순위 이 this()가 this.math 밑으로 가면 오류가 생김
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;} //###옵션바꾸지마세요
	
	public Score_ver1(String name, String p, String s, String rank, int kor, int eng, int math, int total,
			double aver) {
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
	
}
