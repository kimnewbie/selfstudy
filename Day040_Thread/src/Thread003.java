class Hello extends Thread{

	@Override public void run() { 
		for(int i=1; i<11; i++) {
			try {
				Thread.sleep((long)(Math.random()*3000));
			} catch (Exception e) {e.printStackTrace();}
			System.out.print("hello" + "\t");
		}System.out.println();
	}	
}
class Cnt10 extends Thread{
	
	@Override public void run() { 
		for(int i=1; i<11; i++) {
			try {
				Thread.sleep((long)(Math.random()*3000));
			} catch (Exception e) {e.printStackTrace();}
			System.out.print(i + "\t");
		}System.out.println();
	}
	
}
public class Thread003 {
	public static void main(String[] args) {
		Hello todo1 = new Hello(); todo1.start();
		Cnt10 todo2 = new Cnt10(); todo2.start();
	}
}
