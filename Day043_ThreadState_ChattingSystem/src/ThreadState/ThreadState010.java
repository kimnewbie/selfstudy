package ThreadState;
class Todo010 extends Thread{
	String todo;
	//
	public Todo010(){}
	public Todo010(String todo){this.todo = todo;}
	//
	@Override
	public void run() {
		synchronized(this){ // synchronized 걸기
			for(int i=0; i<100; i++) {
				System.out.println(todo+" : "+i);
				try { Thread.sleep((long)(Math.random()*3000)); }
				catch (InterruptedException e) { e.printStackTrace(); }
			}
			System.out.println(Thread.currentThread().getName()+"\t작업완료!");
			notify();
		} // 
	}	
}
public class ThreadState010 {
	public static void main(String[] args) {
		System.out.println("==============Main Start!");
		Todo010 todo = new Todo010("Java Study"); 
		todo.setDaemon(true); // 데몬스레드 걸기 --> 메인스레드 종료시 작업이 남았어도 종속스레드도 같이 종료
		todo.start();
		try { Thread.sleep(2000); } // 2초뒤에 메인 닫히기
		catch (InterruptedException e) {  e.printStackTrace(); }
		System.out.println("==============Main End!");
	}
}
/**
	데몬스레드 Deamon Thread
	강제로 자동종료
	예) Garbage Collector, document자동저장
*/