package ThreadState;
import javax.swing.JOptionPane;

class Timer implements Runnable{
	int cnt;
	public Timer() { cnt = 10; }
	
	@Override
	public void run() {
//		for(int i=10; i>0; i--) {
//			System.out.println("Timer : " + i);
		while(cnt!=0) {
			System.out.println("Timer : " + cnt--);
			try { Thread.sleep(1000); }
			catch (InterruptedException e) { break; }
		}
	}	
}
public class Day043_2_timerJOptionPane {
	public static void main(String[] args) {
		Timer timer = new Timer();
		Thread thread = new Thread(timer); thread.start(); 
		
		if(JOptionPane.showInputDialog("Q 빨강의 알파벳은? >>").equalsIgnoreCase("red")) {
			thread.interrupt();
			System.out.println("멈춤!");
		}
	}
}
