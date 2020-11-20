import javax.swing.*;
class Time10 extends Thread{

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
public class Thread005_answer {
	public static void main(String[] args) {
		Time10 time = new Time10(); time.start();
		String answer = JOptionPane.showInputDialog("사과의 스펠링을 소문자로 > ");
		if(answer.equalsIgnoreCase("apple")) {
//			trim() 공백없애기
			time.stop();
			System.out.println("정답입니다.");
		} else {System.out.println("정답이 아닙니다.");}
	}
}
