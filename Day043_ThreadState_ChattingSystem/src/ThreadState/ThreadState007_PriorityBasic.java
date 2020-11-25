package ThreadState;
class Todo007 extends Thread{
	String todo;
	//
	public Todo007(){}
	public Todo007(String todo){this.todo = todo;}
	//
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(todo+" : "+i);
			try {
				Thread.sleep((long)(Math.random()*3000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}
public class ThreadState007_PriorityBasic {
	public static void main(String[] args) {
		Todo007 todo1 = new Todo007("\t01");
		Todo007 todo2 = new Todo007("\t\t02");
		Todo007 todo3 = new Todo007("\t\t\t03");
//		start() 걸기전에 우선순위 걸기
		todo1.setPriority(Thread.MAX_PRIORITY); // 10
		todo2.setPriority(Thread.MIN_PRIORITY); // 1
		todo3.setPriority(5); // 5
		System.out.println("Priority of Todo1"+todo1.getPriority());
		System.out.println("Priority of Todo2"+todo2.getPriority());
		System.out.println("Priority of Todo3"+todo3.getPriority());
		todo1.start(); todo2.start(); todo3.start(); 
	}
}
/**
	1. 두개 이상의 Thread를 가동시키면 둘 다 공평하게 실행되게끔 스케줄링이 됨
	2. 만약 특정객체가 먼저 일이 끝나도록 요구된다면 스레드의 우선순위를 설정
	=> 반드시 먼저 끝난다라는 보장이 없음
	
	setPriority(정수값)
*/
