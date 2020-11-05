package Abstract005;

public class Abstract005 {
	public static void main(String[] args) {
		int total=0; double avg=0;
		String jang="", pass="", star="";
		// Socre <- ScoreDto
		ScoreDto std = new ScoreDto("헐크", 100, 100, 99);
		
		Process process = null; //설계클래스는 new를 못하니까 구현클래스로 구현구현-		
		//구현클래스
		process = new Total();	std.setTotal((int)process.exec(std.getKor(),std.getEng(),std.getMath()));
		process = new Avg(); std.setAvg(process.exec(std.getTotal()));
		process = new Pass(); std.setPass(process.exec(std.getAvg()));
		process = new Jang(); std.setJang(process.exec(std.getAvg()));
		process = new Star(); std.setStar(process.exec(std.getAvg()));
		//총점, 평균, 장학생(95점이상), 평균점수대 만큼의 별처리,
		//합격여부(60점이상이면 합격, 아니면 불합격)의 처리를 해준다.
		Print print = null;
		print = new StdPrint(); print.show(std);
	}
}
