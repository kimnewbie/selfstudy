class Tv{
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class DVD{
	boolean power;
	
	void power() {power = !power;}
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
}
class TvDVD extends Tv{ //비중이 높은 클래스 하나만 상속관계
	DVD dvd = new DVD(); //나머지는 포함관계
	
	//포함관계인 DVD 메서드 호출
	void play() { 
		dvd.play();
	}
	void stop() {
		dvd.stop();
	}
	void rew() {
		dvd.rew();
	}
	void ff() {
		dvd.ff();
	}
}
public class Single_inheritance {
	public static void main(String[] args) {
		
	}
}
