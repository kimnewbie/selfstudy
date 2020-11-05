package Abstract005;

abstract class Process{ //CONTROLLER 설계도
	abstract double exec(int kor, int eng, int math);
	abstract double exec(int total);
	abstract String exec(double avg);
	public Process() { super(); } 
}
class Total extends Process{ //구현클래스
	@Override double exec(int kor, int eng, int math) { return kor+eng+math; }
	@Override double exec(int total) { return 0; }
	@Override String exec(double avg) { return null; }
	public Total() { super(); } 
}
class Avg extends Process{ //구현클래스
	@Override double exec(int kor, int eng, int math) { return 0; }
	@Override double exec(int total) { return total/3d; }
	@Override String exec(double avg) { return null; }
	public Avg() { super(); } 
}
class Jang extends Process{ //구현클래스
	@Override double exec(int kor, int eng, int math) { return 0; }
	@Override double exec(int total) { return 0; }
	@Override String exec(double avg) { return (avg>=95)? "장학생":"---"; }
	public Jang() { super(); } 
}
class Star extends Process{ //구현클래스
	@Override double exec(int kor, int eng, int math) { return 0; }
	@Override double exec(int total) { return 0; }
	@Override String exec(double avg) { 
		String result = "";
		for(int i=0; i<(int)avg/10; i++) {
			result += "*";
		}return result;
	}
	public Star() { super(); } 
}
class Pass extends Process{ //구현클래스
	@Override double exec(int kor, int eng, int math) { return 0; }
	@Override double exec(int total) { return 0; }
	@Override String exec(double avg) { return (avg>=60)? "합격":"불합격"; }
	public Pass() { super(); } 
}