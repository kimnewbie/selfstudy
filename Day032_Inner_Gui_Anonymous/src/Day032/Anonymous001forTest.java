package Day032;

interface Fish{	//interface는 이벤트구현이나 테스트때 많이 사용
	public String fishType();
	public void breath();
}

class FlatFish implements Fish{

	@Override public String fishType() { return "광어"; }
	@Override public void breath() {System.out.println(this.fishType()+"는 모래바닥에서 숨을 쉽니다."); }	
}

public class Anonymous001forTest {
	public static void main(String[] args) {
		Fish myfish = new FlatFish(); // Fish는 interface라서 객체생성 new 못해주므로 구현된 클래스로 생성 고고
		myfish.breath(); //광어출력
		
		Fish myfish2 = new Fish() {
			@Override public String fishType() { return "붕어"; }
			@Override public void breath() { System.out.println(this.fishType()+" Good!"); }			
		};
		myfish2.breath();
		
		Fish myfish3 = new FlatFish() { // 광어 이벤트성 클래스로 만들어 보기
			@Override public String fishType() { return super.fishType(); }
			@Override public void breath() { super.breath(); }			
		}; 
		myfish3.fishType();
		myfish3.breath();
		
		
	}
}
