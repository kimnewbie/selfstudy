package ThreadState;
class StateTest extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println("★");
//			if(Thread.interrupted()) {System.out.println(">>>> run중에 방해받았어!"); break;}
			if(isInterrupted()) {System.out.println(">>>> run중에 방해받았어!"); break;}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadState001 {
	public static void main(String[] args) {
		StateTest test = new StateTest(); test.start();
		try { Thread.sleep(1000); }
		catch (InterruptedException e) { e.printStackTrace(); }
		System.out.println(">>>> 방해중 1");
		test.interrupt();
		System.out.println("main에서 방해했니?"+test.isInterrupted());
		System.out.println(">>>> 방해중 3");
	}
}
/**
>>>> 방해중 1
★
>>>> run중에 방해받았어!
main에서 방해했니?false
>>>> 방해중 3

*/