class Todo3 extends Thread{
	String todo; int num;
	
	public Todo3(){super();}
	public Todo3(String todo, int num) {
		super(); this.todo = todo; this.num = num;
	}
	@Override
	public void run() {
		System.out.println("\n"+this.num+" - "+this.todo+" Start\n");
		try { Thread.sleep((long)(Math.random()*3000));}
		catch(InterruptedException e) {e.printStackTrace();}
		System.out.println("\n"+this.num+" - "+this.todo+" End\n");
	}	
}
public class Thread006_Question {
	public static void main(String[] args) {
		System.out.println("=================MAIN-START!");
		for(int i=0; i<30; i++) {
			Todo3 todo = new Todo3("ㅁ Todo"+i, i+1);
			todo.start();			
		}try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("=============MAIN-END");
	}
}
/**
문제점은?
- 각각의 스레드가 다 처리되기도 전에 MAIN-END 끝나버린다.
해결방안
- Thread.sleep(10000);  이 불안정함
*/