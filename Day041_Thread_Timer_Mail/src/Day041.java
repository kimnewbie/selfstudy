class Hello extends Thread {
	@Override public void run() { 
		for(int i=0; i<10; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(500);
			} catch (Exception e) {e.printStackTrace();}
		}
	}
}
class Cnt100 extends Thread {
	@Override public void run() { 
		for(int i=1; i<101; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {e.printStackTrace();}
		}
	}
}
public class Day041 {
	public static void main(String[] args) {
		Hello todo1 = new Hello(); todo1.start();
		Cnt100 todo2 = new Cnt100(); todo2.start();
//		new Hello().start();
//		new Cnt100().start();
	}
}
