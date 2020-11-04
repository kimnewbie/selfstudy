package Day029_Polymorphism_Abstract;
abstract class Unit{
	int x,y;
	abstract void move(int x, int y);
	abstract void stop();//현재위치에 정리
}
///
class Marine extends Unit{
	int x,y;
	void move(int x, int y) {}
	void stop() {}//현재위치에 정리
	void stimPack() {} //스팀팩을 사용한다
}
///
class Tank extends Unit{
	int x,y;
	void move(int x, int y) {}
	void stop() {}//현재위치에 정리
	void changeMode() {} //공격모드를 변환한다
}
///
class Dropship extends Unit{
	int x,y;
	void move(int x, int y) {}
	void stop() {}//현재위치에 정리
	void load() {}//선택된 대상을 태운다
	void unload() {}//선택된 대상을 내린다.
}
///
public class Ex004 {
	public static void main(String[] args) {
		
	}
}
