class JoinA extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("A");
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class JoinB extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("                 B");
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class Thread007 {
	static long start = 0;
	static long end = 0;

	public static void main(String[] args) {
		System.out.println("=================MAIN-START!");
		start = System.currentTimeMillis();
		JoinA todo = new JoinA();
		todo.start();
		JoinB todo2 = new JoinB();
		todo2.start();
//		(1) 대략 시간 잡기 - 불안정함
//		try {Thread.sleep(1000);}catch(Exception e) {}
//		(2) join 작업이 끝날때까지 기다리기
		try {
			todo.join();
			todo2.join();
		} catch (Exception e) {
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start));
		System.out.println("=============MAIN-END");
	}
}
