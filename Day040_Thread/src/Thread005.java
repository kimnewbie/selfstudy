import javax.swing.*;

class Answer extends Thread{
	
	@Override
	public void run() {
		String answer = JOptionPane.showInputDialog("사과의 스펠링을 소문자로 > ");
		while(true) {
			if (answer.equals("apple")) {
				System.out.println("정답입니다.");
				System.exit(0);
			} else {System.out.println("틀렸습니다."); }
		}		
	}	
}
class Time extends Thread{

	@Override
	public void run() {
		
		System.out.println("#apple#");
		for(int i=10; i>0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch(Exception e) {e.printStackTrace();}
		}
		System.exit(0);
	}
}
public class Thread005 {
	public static void main(String[] args) {
		Answer cnt = new Answer(); cnt.start();
		Time time = new Time(); time.start();
	}
}
