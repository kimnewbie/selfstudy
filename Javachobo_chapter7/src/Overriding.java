class Point1{
	int x; int y; //2차원 좌표

	String getLocation() { return "Point1 [x=" + x + ", y=" + y + "]"; }
	@Override public String toString() { return "Point1 [x=" + x + ", y=" + y + "]"; }  
}
class MyPoint3D extends Point1{
	int z;
	
	String getLocation() { //선언부 변경불가, 내용만 변경가능 구현부{}
		return "MyPoint3D [x=" + x + ", y=" + y + ", z=" + z + "]"; }

	public MyPoint3D(int x, int y) {
		//MyPoint3D p = new MyPoint3D(3,5); 형식으로 사용
		this.x = x; 
		this.y = y;
		
		//나는 x에 3, y에 5대입했는데
		//그냥 x,y로 써줄것
	}
	
	
}
public class Overriding {
	public static void main(String[] args) {
		MyPoint3D p = new MyPoint3D(3,5);
//		MyPoint3D p = new MyPoint3D();
//		p.x = 3;
//		p.y = 5;
		
		p.z = 7;
		System.out.println(p.getLocation()); //MyPoint3D에 getLocation()오버라이딩 안하면 x,y값만 출력
		System.out.println(p); //Point1의 toString호출! Point1 [x=3, y=5]
	}
}
