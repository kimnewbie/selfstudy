package Day025_Class_Modifier_Origin;

class SutdaCard014{
	final int NUM;  //private  붙임
	final boolean IS_KWANG; 	//private 붙임
	
	SutdaCard014(){this(1,true);}
	SutdaCard014(int num, boolean isKwang){ this.NUM=num; this.IS_KWANG=isKwang; }
	
	public String toString(){ return NUM + (IS_KWANG ? "K":"");}
}

public class Ex020_FinalVer {
	public static void main(String[] args) {
		SutdaCard014 stu = new SutdaCard014(1,true); // SutdaCard014 stu = new SutdaCard014(); 도 가능
	        System.out.println(stu);
		/*
		Q 섯다카드의 숫자와 종류는 한번 값이 지정되면 (isKwang) 변경되어서는 안 되는 값이다.
		카드의 숫자가 한번 잘못 바뀌면 똑같은 카드가 두 장이 될 수도 있기 때문이다.
		이러한 문제점이 발생하지 않도록 아래를 수정하시오.
		class SutdaCard14{
			int NUM;
			boolean IS_KWANG;
			
			SutdaCard14(){ this(1,true); }
			SutdaCard14(int num, boolean isKwang){ this.NUM=num; this.IS_KWANG=isKwang; }
			
			public String toString(){
				return NUM + (IS_KWANG ? "K":"");}
			}
		*/
	}
}
