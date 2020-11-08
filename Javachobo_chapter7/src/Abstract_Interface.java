abstract class Unit2{
	int x; int y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다");}
}

interface Fightable { //인터페이스의 모든 메서드는 public abstract.
	void move(int x, int y); //public abstract 생략
	void attack(Fightable f); //public abstract 생략
}

class Fighter extends Unit2 implements Fightable{
	//오버라이딩 규칙 : 조상(public)보다 접근제어자의 범위가 좁으면 안된다.
	public void move(int x, int y) {
		System.out.println("["+ x + "," + y +"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}	
	//싸울 수 있는 상대를 불러온다.
	Fightable getFightable() {
		Fighter f = new Fighter(); //Fighter를 생성해서 반환
		return f; //(Fightable)f 
	}
}

public class Abstract_Interface {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();
	}
}
