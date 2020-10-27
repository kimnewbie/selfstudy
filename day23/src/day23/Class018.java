package day23;
class MyMath3{
	int add(int a, int b) {return a+b;}
	long add(long a, int b) {return a+b;} //long이 int보다 크니까 리턴값을 long으로
	long add(int a, long b) {return a+b;}
	long add(long a, long b) {return a+b;} // 이거 하나만 있어도 위에 3개 커버 가능
	int add(int[] a) {
		int result =0;
		for(int i=0; i<a.length; i++) {
			result +=a[i];
		}return result;
	}
	//public String add(long l, long j) {return ""+(l+j);}
	//생성자
	MyMath3(){super();} // alt+shift+s
}
public class Class018 {
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3,3) 결과:" + mm.add(3,3));
		System.out.println("mm.add(3L,3) 결과:" + mm.add(3L,3));
		System.out.println("mm.add(3,3L) 결과:" + mm.add(3,3L));
		System.out.println("mm.add(3L,3L) 결과:" + mm.add(3L,3L));
	
		int[] a = {100,200,300};
		System.out.println("mm.add(a) 결과:" + mm.add(a));
		/*
		ㅁ 출력내용 : 
			int add(int a, int b) - mm.add(3,3) 결과:6
			long add(long a, int b) - mm.add(3L,3) 결과:6
			long add(int a, long b) - mm.add(3,3L) 결과:6
			long add(long a, long b) - mm.add(3L,3L) 결과:6
			int add(int[] a) - mm.add(3,3) 결과:600
			
		ㅁ 주어진옵션
			MyMath3 mm = new MyMath3();
			System.out.println("mm.add(3,3) 결과:" + mm.add(3,3));
			System.out.println("mm.add(3L,3) 결과:" + mm.add(3L,3));
			System.out.println("mm.add(3,3L) 결과:" + mm.add(3,3L));
			System.out.println("mm.add(3L,3L) 결과:" + mm.add(3L,3L));
		
			int[] a = {100,200,300};
			System.out.println("mm.add(a) 결과:" + mm.add(a));
		 */
	}
}
