package ThreadState;
import java.text.SimpleDateFormat;
import java.util.Date;


class Clock0 implements Runnable{
	
	@Override
	public void run() {
		while(true) {
			Date date = new Date();
			SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
			String text = f.format(date);
			String str = f.format(date);
			
			System.out.println("현재시간 : " + str);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Day043_1_Time_SimpleDataFormat {
	public static void main(String[] args) {
		new Thread( new Clock0() ).start();
	}
}
