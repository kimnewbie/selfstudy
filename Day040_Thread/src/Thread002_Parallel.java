/**
start() ---> JVM ---> Thread manager ---> 스케줄러등록 ---> run() 실행
ㅁ개발자													ㅁ실행되야하는 내용
*/
class Todo2 extends Thread{ // extends Thread 실행클래스로 변함 ---> Thread manager
	int todonum;	// 작업번호
	String todo;	// 작업내용
//	int todotime;	// 작업시간 (INT 21억까지 처리 가능)
	long todotime;
	
	//
	public Todo2() { super(); }
	public Todo2(String todo, int todonum) {
		super();
		this.todonum = todonum;
		this.todo = todo;
	}
	//
//	public void start() { this.run();} ## Todo1들을 Todo2로 바꾸고 얘는 잠가줘
	//
	public void run() { // 작업내용+걸리는시간을 랜덤하게 표현 : 처리경로
		System.out.println("\n" + this.todonum +"-"+this.todo + "START\n");
		try {
			todotime = (long)(Math.random()*3000);
			Thread.sleep(todotime); // Thread(실행).sleep (시간만큼 재우기)			
		} catch(Exception e) {}
		System.out.println("\n" + this.todonum +"-"+this.todo + "END\n");
	}
}
public class Thread002_Parallel {
	public static void main(String[] args) { // 직렬적으로 1끝나야 2시작, 그리고 3
		Todo2 todo1 = new Todo2("\t자바복습",1);			todo1.start(); // ###001
		Todo2 todo2 = new Todo2("\t\t포트폴리오",2);		todo2.start();
		Todo2 todo3 = new Todo2("\t\t\tGAME",3);		todo3.start();
	}
}
/**
1. 프로세스 : 프로그램을 실행
	직렬적 (위->아래, 왼쪽->오른쪽)
	[하나의 루틴프로그램] 처리경로를 가지고 있음. 1번이 끝나야지만 2번처리
*/