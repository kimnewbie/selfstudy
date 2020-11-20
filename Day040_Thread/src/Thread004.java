class GuguDan extends Thread{

	@Override
	public void run() {
		for(int i=2; i<10; i++) {			
				try{
					Thread.sleep((long)(Math.random()*1000));
				} catch (Exception e) {e.printStackTrace();}
				for(int j=1; j<10; j++) { 
					System.out.print(i+"*"+j+"="+(i*j)+"\t"); 
			}System.out.println();
		}
	}
}
class Sum100 extends Thread{
	
	@Override
	public void run() {
		int sum=0;
		for(int i=1; i<101; i++) {
			try {
				Thread.sleep((long)(Math.random()*1000));
			} catch (Exception e) {e.printStackTrace();}
			sum += i;
			System.out.println(sum);
		}
	}
	
}
public class Thread004 {
	public static void main(String[] args) {
		GuguDan todo1 = new GuguDan(); todo1.start();
		Sum100 todo2 = new Sum100(); todo2.start();
	}
}
