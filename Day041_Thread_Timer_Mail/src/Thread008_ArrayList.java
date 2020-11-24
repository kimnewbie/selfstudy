import java.util.ArrayList;

class Todo4 extends Thread{
	String todo;
	int num;
	public Todo4() {}
	public Todo4(String todo, int num) {
		super();
		this.todo = todo;
		this.num = num;
	}
	@Override public void run() {
		System.out.println("\n"+this.num + "-" + this.todo + " -START\n");
		try { Thread.sleep((long)(Math.random()*3000)); } 
		catch (InterruptedException e) { e.printStackTrace(); }
		System.out.println("\n"+this.num + "-" + this.todo + " -END\n");
	}	
}
public class Thread008_ArrayList {
	public static void main(String[] args) {
		System.out.println("===========MAIN-START");
		ArrayList<Todo4> list = new ArrayList<Todo4>();
		for(int i=0; i<30; i++) {
			Todo4 todo = new Todo4("ㅁ TODO"+i, i+1); 
			todo.start();
			list.add(todo);
//			직렬적이어짐.. 노노~
//			try { todo.join(); }
//			catch (InterruptedException e) { e.printStackTrace(); }
		}
		for(int i=0; i<list.size(); i++) {
			try { list.get(i).join(); }
			catch (InterruptedException e) { e.printStackTrace(); }
		}
		System.out.println("===========MAIN-END");
	}
}
