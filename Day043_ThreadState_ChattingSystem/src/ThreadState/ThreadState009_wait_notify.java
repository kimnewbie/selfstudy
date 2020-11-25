package ThreadState;
class Todo009 extends Thread{
	String todo;
	//
	public Todo009(){}
	public Todo009(String todo){this.todo = todo;}
	//
	@Override
	public void run() {
		synchronized(this){ // synchronized 걸기
			for(int i=0; i<5; i++) {
				System.out.println(todo+" : "+i);
				try { Thread.sleep((long)(Math.random()*3000)); }
				catch (InterruptedException e) { e.printStackTrace(); }
			}
			System.out.println(Thread.currentThread().getName()+"\t작업완료!");
			notify();
		} // 
	}	
}
public class ThreadState009_wait_notify {
	public static void main(String[] args) {
		Todo009 todo = new Todo009("화장실사용중!"); todo.start();
		Todo009 todo2 = new Todo009("막내 - 화장실사용중!"); todo2.start();
		
		synchronized(todo) {
			System.out.println("Todo009 완료될때까지 기다립니다.");
			try { todo.wait(); }
			catch (InterruptedException e) { e.printStackTrace(); }
			System.out.println("main done!");
		}
	}
}
/**
	1. wait, notify는 동기화된 블록 안에서 사용 해야 한다. (synschronized)
		wait를 만나면 해당스레드는 객체의 락(lock) 
*/