package ThreadState;
class MyCatDay{
	public synchronized void eat() {
		for(int i=0; i<10; i++) {
			System.out.println("★1. 고양이 식사중...");
			try { Thread.sleep((long)(Math.random()*1000)); }
			catch (InterruptedException e) { e.printStackTrace(); }
		}
		System.out.println("★1. 고양이 식사 완료!");
	}

	public /* synchronized */ void sleep() {
		for(int i=0; i<10; i++) {
			synchronized(this) { // 메서드 앞에 붙여서 사용할 때 메서드가 너무 길다면 일부부만 적용 가능
//									직렬로 바뀌니까 꼭 필요한 경우에만 사용하기
				 System.out.println("\t★★2. 고양이 수면중...");
			}
			try { Thread.sleep((long)(Math.random()*1000)); }
			catch (InterruptedException e) { e.printStackTrace(); }
		}
		System.out.println("\t★★2. 고양이 수면 완료!");
	}
	public synchronized void poo() {
		for(int i=0; i<10; i++) {
			System.out.println("\t\t★★★3. 고양이 배변활동중...");
			try { Thread.sleep((long)(Math.random()*1000)); }
			catch (InterruptedException e) { e.printStackTrace(); }
		}
		System.out.println("\t\t★★★3. 고양이 배변활동 완료!");
	}
}
class Todo8 extends Thread{
	MyCatDay cat; // 클래스를 변수로~
	int type;
	
	Todo8(){}
	Todo8(int type, MyCatDay cat){this.type=type; this.cat = cat;}
	
	@Override public void run() {
		switch(type) {
			case 1: cat.eat(); break;
			case 2: cat.sleep(); break;
			case 3: cat.poo(); break;
		}
	}	
}
public class ThreadState008_wait_notify {
	public static void main(String[] args) {
		MyCatDay cat = new MyCatDay();
		
		Todo8 cat1 = new Todo8(1, cat);
		Todo8 cat2 = new Todo8(2, cat);
		Todo8 cat3 = new Todo8(3, cat);
		
		cat1.start();
		cat2.start();
		cat3.start();
	}
}
/**
	synchronized를 붙여서 실행하면 메서드하나가 모두 실행된 후에 다음 메서드가 실행됨
	
*/