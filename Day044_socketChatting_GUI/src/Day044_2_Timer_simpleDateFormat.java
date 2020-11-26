import java.text.SimpleDateFormat;

class Clock2 implements Runnable{
	long milliseconds;
	SimpleDateFormat sdf;
	public Clock2() {milliseconds=0; sdf = new SimpleDateFormat("HH:mm:ss");}
	@Override
	public void run() {
		while(true){
			milliseconds = System.currentTimeMillis();		
			System.out.println(sdf.format(milliseconds));			
			try { Thread.sleep(1000); }
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}	
}
public class Day044_2_Timer_simpleDateFormat {
	public static void main(String[] args) {
		new Thread(new Clock2()).start();
	}
}
