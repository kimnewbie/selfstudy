package ThreadState;
class StateTest003 implements Runnable{
	private String todo;
	Thread thread;
	volatile boolean suspend; // 일시정지상태니 아니니?
	volatile boolean stop;
//	volatile 를 붙여주면 boolean 작동이 더 잘되나봐~
	
	StateTest003(){  }
	StateTest003(String todo){ this.todo = todo; thread = new Thread(this);}
//															this = StateTest003
	
	@Override
	public void run() {
		while(!stop) { // stop의 값이 false인 동안 반복한다.
			if(!suspend) { // suspend의 값이 false일 때만 작업을 수행한다. / true면 잠시멈춤
				System.out.println(Thread.currentThread().getName()+"\t"+this.todo);
				try { Thread.sleep(1000); }
				catch (InterruptedException e) { System.out.println("InterruptedException 발생"); }
			} else { // [suspend] - 일시정지
				thread.yield(); // 남는 시간을 다른 스레드에게 양보해서 효율적이게 됨
			}
		}
	} // end run()
	
//	메소드로 만들면 밑에 밑줄이 없어짐
	public void start() {thread.start();}
	
	public void suspend() {
		suspend = true;  thread.interrupt(); 
		System.out.println(thread.getName()+"suspend()에 의해 프로그램을 일시정지합니다.");}
	
	public void resume() {		
		suspend = false; 
		System.out.println(thread.getName()+"resume()에 의해 프로그램을 다시시작합니다.");}
	
	public void stop() {
		stop = true; thread.interrupt(); 
		System.out.println(thread.getName()+"stop()에 의해 프로그램 종료합니다.");}
	
}
public class ThreadState003 {
	public static void main(String[] args) {
		StateTest003 todo1 = new StateTest003("1.청소"); todo1.start();
		StateTest003 todo2 = new StateTest003("\t2.빨래"); todo2.start();
		StateTest003 todo3 = new StateTest003("\t\t3.산책"); todo3.start();
		
		try {
//			1. 3초동안 쉬기
			Thread.sleep(3000);
//			2. 빨래 일시정지, 청소 일시정지
			todo1.suspend();	// deprecated [일시정지]
			todo2.suspend();	// deprecated [일시정지]
//			3. 청소(todo1) 다시 동작
			Thread.sleep(3000);
			todo3.stop();		// [강제종료]
			todo1.resume();		// [다시시작]
			todo2.resume();		// [다시시작]			
//			4. todo1, todo2, todo3 강제종료
			todo1.stop();		// [강제종료]
			todo2.stop();		// [강제종료]
		} 
		catch (InterruptedException e) {  e.printStackTrace(); }
	}
}
/**
	1. stop(), suspend(), resume() 스레드를 교착상태로 만들기 쉽기 때문에 deprecated 됨
	2. 교착상태 : 두 개 이상의 작업이 서로 상대방의 작업이 끝나기 만을 기다리고 있기 때문에
				결과적으로 아무것도 완료되지 못하는 상태
	3.	stop()		:	영구정지
		suspend()	:	일시정지
		resume()	:	다시재생
		
	===============================
	
	ㅁ 상태를 표시해주는 콘텐츠를 만들어서 처리하려고 함
	상태
	1. NEW		: 스레드가 생성되고 아직 start()가 호출되지 않은 상태
	2. RUNNABLE	: 실행, 실행대기
	3. yield	: 양보 - 다시 실행대기가 되고 다음 스레드가 실행상태가 된다.
	4. WAITING, BLOCKED : sleep, join, suspend, wait - 일시정지 상태
	5. 정지상태벗어나기 : interrupt, resume, notify, time-out
	6. TERMINATED : 스레드 종료
		
	===============================
*/