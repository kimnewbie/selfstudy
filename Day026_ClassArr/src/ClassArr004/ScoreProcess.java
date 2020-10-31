package ClassArr004;

public class ScoreProcess {
	public void process_avg(Score[] std) { //평균을 구해주는 기능
		for(int i=0;i<std.length;i++) {
		std[i].setAvg((std[i].getKor()+std[i].getEng()+std[i].getMath())/3.0);
		}
	}
	public void process_pass(Score[] std) { //합격여부를 구해주는 기능
		for(int i=0;i<std.length;i++) {
			std[i].setPass((std[i].getAvg()>=60)? "합격":"불합격");
			if(std[i].getAvg()>=60&&(std[i].getKor()<40||std[i].getEng()<40||std[i].getMath()<40)) { std[i].setPass("과락"); }

		}
	}
}
