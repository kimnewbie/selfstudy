package Day031_Interface;
class Unit{
	int x; int y;
	int power;
}
interface Moveable{void move(int x, int y);} //좌표움직임
interface Attackable{void attack (Unit c);}
interface Fightable extends Moveable, Attackable{
	 @Override default void attack(Unit c) {  }
	 @Override default void move(int x, int y) {  } 
}
class Fighter{
	
}
class Fighter2 extends Fighter implements Fightable{
	@Override public void move(int x, int y) { 
		Fightable.super.move(x, y); } 
}
public class Interface005 {
	public static void main(String[] args) {
		Fighter2 myc = new Fighter2();		
		//myc이 Fightable사용했는지 검사하기
		if(myc instanceof Fightable) {System.out.println("상속");} //확인용도로출력함
	}
}
