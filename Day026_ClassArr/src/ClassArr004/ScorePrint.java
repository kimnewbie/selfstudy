package ClassArr004;

public class ScorePrint {	
	//멤버변수 X
	//멤버함수 
	void show(Score[] std) {
		show();
		for(int i=0; i<std.length; i++) {
			System.out.println(std[i].getName()+"\t"+std[i].getKor()+"\t"+std[i].getEng()+"\t"+std[i].getMath()+"\t"+String.format("%.2f",std[i].getAvg())+"\t"+std[i].getPass());
		}		
	}
	
	void show() {
		System.out.println("================================================================");
		System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부");
		System.out.println("================================================================");
	}
	//생성자
	public ScorePrint() { super(); }
}
