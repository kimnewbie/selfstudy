
public class Encapsulation {
	// 접근제어자를 private으로 하여
	// 외부에서 직접 접근하지 못하도록 한다.
	// 메서드를 통해 사용 가능하도록
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() { return hour; }
	
	// hour 값은 0~23이니까 조정▼ -- 값을 보호한다
	public void setHour(int hour) {
		if(hour<0||hour>23) return;
		this.hour = hour;
	}
	// Time t = new Time();
	// t.hour = 25; 를 사용 못하므로
	// t.setHour(25); 형식으로 private을 설정해준다.
	
	public int getMinute() { return minute; } public void setMinute(int minute) { this.minute = minute; }
	public int getSecond() { return second; } public void setSecond(int second) { this.second = second; } 
}
