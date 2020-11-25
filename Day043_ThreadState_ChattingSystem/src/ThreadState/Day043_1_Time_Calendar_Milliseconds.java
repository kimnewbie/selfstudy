package ThreadState;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Clock implements Runnable{

	@Override
	public void run() {
		while(true) {
			Calendar today = Calendar.getInstance(); // 객체를 계속 생성해야함 -- 과부화★
			System.out.println(today.get(Calendar.HOUR_OF_DAY)+":"
					+today.get(Calendar.MINUTE)+":"+today.get(Calendar.SECOND));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}
class Clock2 extends Thread{
	int hour, minutes, seconds;
	public Clock2() {this.hour=0; this.minutes=0; this.seconds=0;}
	@Override
	public void run() {
		while(true){
			long milliseconds = System.currentTimeMillis();		
//			System.out.println(milliseconds); // 시간을 1000으로 표현
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
public class Day043_1_Time_Calendar_Milliseconds {
	public static void main(String[] args) {
//		new Thread( new Clock() ).start(); --> 100점
		new Clock2().start();
	}
}
