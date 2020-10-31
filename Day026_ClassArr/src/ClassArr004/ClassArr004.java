package ClassArr004;

public class ClassArr004 {
	public static void main(String[] args) {
		//메서드 호출 방식
		Score[] std = new Score[3];
		std[0] = new Score("아이언맨",100,100,100);
		std[1] = new Score("헐크",90,60,80);
		std[2] = new Score("블랙팬서",20,60,90);
		
		ScoreProcess process = new ScoreProcess();
		process.process_avg(std); //리턴값 double,메서드명 process_avg, 파라미터 Score[] std
		process.process_pass(std);//리턴값 String,메서드명 process_pass, 파라미터 Score[] std
		
		ScorePrint print = new ScorePrint();
		print.show(std);//리턴값 void,메서드명 show, 파라미터 Score[]
	}
}
