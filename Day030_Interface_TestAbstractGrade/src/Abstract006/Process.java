package Abstract006;
public abstract class Process {
	abstract double exec(int kor, int eng, int math);
	abstract double exec(int total);
	abstract String exec(double avg);
}

class Avg extends Process {
	 @Override double exec(int kor, int eng, int math) { return 0; }
	 @Override double exec(int total) { return total/3d; }
	 @Override String exec(double avg) { return null; }
	 
}

class Jang extends Process {
	 @Override double exec(int kor, int eng, int math) { return 0; }
	 @Override double exec(int total) { return 0; }
	 @Override String exec(double avg) { return (avg>=95)? "장학생":""; }
}

class Pass extends Process {
	@Override double exec(int kor, int eng, int math) { return 0; }
	@Override double exec(int total) { return 0; }
	@Override String exec(double avg) { return (avg>=60)? "합격":"불합격"; }
}

class Star extends Process {
	 @Override double exec(int kor, int eng, int math) { return 0; }
	 @Override double exec(int total) { return 0; }
	 @Override String exec(double avg) { 
		 String result ="";
		 for(int i=0; i<(int)avg/10; i++) {
			 result += "★";
		 } return result; }
}
class Total extends Process {
	@Override double exec(int kor, int eng, int math) { return kor+eng+math; }
	@Override double exec(int total) { return 0; }
	@Override String exec(double avg) { return null; }
}


