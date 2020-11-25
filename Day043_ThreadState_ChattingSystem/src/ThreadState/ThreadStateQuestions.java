package ThreadState;
class Thread3 extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class Thread4 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(i);
			try { Thread.sleep(5*1000); }
			catch (InterruptedException e) { }
		}
	}
}
public class ThreadStateQuestions {
	public static void main(String[] args) throws Exception {
		Thread4 th1 = new Thread4();
		th1.setDaemon(true);
		th1.start();
		try { Thread.sleep(5*1000); }
		catch (InterruptedException e) { }
		throw new Exception("Stop~!!!");
	}
}
/**
	Q3. 스레드를 일시정지(waiting)로 만드는 것
	- suspend(), sleep(), wait(), join() - I/O block
	
	a. suspend() - o
	b. resume() - 정지상태에서 벗어나 실행대기열에 저장
	c. join() - o
	d. sleep() - o
	e. wait() - o
	f. notify() - 정지상태에서 벗어나 실행대기열에 저장
	
	Q4. 다음 중 interrupt()에 의해서 실행대기 상태(Runnable)가 되지 않는 경우는? d
	a. sleep()에 의해서 일시정지 상태인 스레드
	b. join()에 의해서 일시정지 상태인 스레드
	c. wait()에 의해서 일시정지 상태인 스레드
	d. suspend()에 의해서 일시정지 상태인 스레드
	
	-- 스레드가 sleep(), wait(), join()에 의해 waiting 상태일 때 해당 스레드에 대해
		interrupt()를 호출하면, Interrupted Exception이 발생하고 스레드는 '실행대기'
		(runnable)로 바뀐다.
	
	Q5. 출력화면은? --> 오류가 나도 멈추지 않는다.
	
	0
	1
	2
	3
	4
	Exception in thread "main" java.lang.Exception: Stop~!!!
		at ThreadStateQuestions.main(ThreadStateQuestions.java:27)
	5
	6
	7
	8
	9
	
	Q6. 메인이 종료되면 종속스레드도 같이 끝나게 코드를 수정하시오.
		Thread4 th1 = new Thread4();
		th1.setDaemon(true); -----------------> setDaemon(true); 를 붙여준다
		th1.start();
*/