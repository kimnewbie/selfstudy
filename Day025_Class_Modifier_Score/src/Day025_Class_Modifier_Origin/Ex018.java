package Day025_Class_Modifier_Origin;

public class Ex018 {
	public static void main(String[] args) {
		
	}
}
/*
Q 클래스의 멤버변수를 클래스[외부에서 접근할 수 없도록 제어자]를 붙이고
	대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter/setter를 사용한다
	a. 접근제어자 사용범위를 넓은 것에서 좁은 것 순으로 적으시오.
	public> protected> package> private
	
	b. 접근제어자의 사용범위를 적으시오
				클래스내부	동일패키지	하위클래스	그외
	public			O		O		O	O
	protected		O		O		O	X
	package			O		O		X	X
	private			O		X		X	X
*/