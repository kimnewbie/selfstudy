package Abstract006;

public class ScoreUsing {
	//멤버변수
	ScoreDto user = new ScoreDto();
	Process process;
	Print print;
	
	//멤버함수
	void exec1() { //Process 실행해주는 함수
		process = new Total();	user.setTotal((int)process.exec(user.getKor(),user.getEng(),user.getMath())); //5번과 다르게 std가 아니라 user를 사용
		process = new Avg(); user.setAvg(process.exec(user.getTotal()));
		process = new Pass(); user.setPass(process.exec(user.getAvg()));
		process = new Jang(); user.setJang(process.exec(user.getAvg()));
		process = new Star(); user.setStar(process.exec(user.getAvg()));
	}
	void exec2() { //ShowPrint 실행해주는 함수
		print = new StdPrint(); // print가 추상매서드라 자손클래스인 StdPrint()는 일반 클래스라 인스턴스 생성 new로..
		print.show(user);
	}
	//생성자
	public ScoreUsing() { super(); }
	
	public ScoreUsing(ScoreDto user, Process process, Print print) {
		super();
		this.user = user;
		this.process = process;
		this.print = print;
	}
	public ScoreUsing(String name, int kor, int eng, int math) {
		user.setName(name);
		user.setKor(kor);
		user.setEng(eng);
		user.setMath(math);
	}
}
