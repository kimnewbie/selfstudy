package Class031;

public class Class031_Rabbit {
	public static void main(String[] args) {
		//1.같은 패키지 안에서의 사용
		//Rabbit[a|b|c|d	/setA|getA]
		Rabbit r1 = new Rabbit();		
		r1.d_public = 1000;//public: 아무데나
		r1.b_protected = 100;//protected: 패키지 + 자식
		r1.c_package=10;//package: 패키지(같은 폴더안에서만)
		//r1.a_private=1;//private: 클래스내에서만(멤버함수가 멤버변수 접근해서 사용)
		//Rabbit 클래스밖이라 r1.a_private=1; 쓰면 오류남
		r1.setA_private(1); //r1.a_private=1;주석처리 후 입력하면 보임
		
		System.out.println(r1);
		//Rabbit [a_private=1, b_protected=100, c_package=10, d_public=1000]
		//2. getter + setter 사용
		System.out.println("public : 아무데서나 - "+ r1.d_public);
		System.out.println("protected : 패키지(폴더)+자식 - "+r1.b_protected);
		System.out.println("package : 패키지(폴더) - "+ r1.c_package);
		System.out.println("private : 클래스내에서만 - "+ r1.getA_private());
		//												가져오는 건 get▲
		
	}
}
