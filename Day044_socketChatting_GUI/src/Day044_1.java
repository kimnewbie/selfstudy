import java.text.SimpleDateFormat;
import java.util.Date;

class Clock extends Thread{
	long milliseconds;
	int hour, minutes, seconds;
	public Clock() {milliseconds=0; this.hour=0; this.minutes=0; this.seconds=0;}
	@Override
	public void run() {
		while(true){
			milliseconds = System.currentTimeMillis();		
			hour = (int)((milliseconds/(1000*60*60))%24)+9;
			minutes = (int)((milliseconds/(1000*60))%60);
			seconds = (int)((milliseconds/(1000))%60);
			System.out.format("%02d:%02d:%02d\n",hour,minutes,seconds);
			
			try { Thread.sleep(1000); }
			catch (InterruptedException e) { e.printStackTrace(); }
		}
//			1초 : 1000
//			1분 : 1000*60
//			1시 : 1000*60*60
//			System.currentTimeMillis(); 는 UTC 1970.1.1 기준 (영국기준)
//			우리나라와 9시간 차이
	}
	
}
public class Day044_1 {
	public static void main(String[] args) {
		new Clock().start();
	}
}
