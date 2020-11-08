class Time{
	private int hour;	//0~23
	private int minute;	//0~59
	private int second;	//0~59
	
	public void setHour(int hour) {
		if(isNotValidHour(hour)) return;
		//if(hour<0||hour>23) return;
		this.hour = hour;
	}
	
	// 매개변수로 넘겨진 hour가 유효한지를 알려주는 메서드
	private boolean isNotValidHour(int hour) { //public으로 할 필요없음. 여기서만 사용해서
		return hour<0||hour>23;
	}
	
	public int getHour() { return hour; }	
	
}

public class Encapsulation_Time {
	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = -100; 
		t.setHour(21);
		System.out.println(t.getHour()); //(t.hour) = -100 출력
		t.setHour(100);
		System.out.println(t.getHour()); //21출력한번더 왜냐면 기준에 안맞아서 위에꺼 출력

	}
}	