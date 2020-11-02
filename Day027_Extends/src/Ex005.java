import java.util.Arrays;

class SutdaCard extends Object{
	int num;
	boolean isKwang;
	
	public SutdaCard() { this(1,true);}
	public SutdaCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;
	}
	@Override public String toString() {
		return	""+num+(isKwang? "K":"");
	}
}
////////////////////////////////////////////////////
class StudaDeck{
	//멤버변수
	static final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM]; 
	
	//멤버함수
	@Override
	public String toString() {
		return "StudaDeck [CARD_NUM=" + CARD_NUM + ", cards=" + Arrays.toString(cards) + "]";
	}
	
	//생성자
	public StudaDeck() { 
		super(); 
		// 0~9중의 : 1,3,8번 광처리
		// 10~19
		// index 			value	
		// 0 : cards[0]		=1	=>1K	index값이 0일때 0%10+1 =>1
		// 1 : cards[1]		=2			index값이 1일때 1%10+1 =>2
		// 2 : cards[2]		=3	=>3K	index값이 2일때 2%10+1 =>3
		// 3 : cards[3]		=4	3%10+1 			=>4
		// 4 : cards[4]		=5	4%10+1 			=>5
		// 5 : cards[5]		=6	5%10+1			=>6
		// 6 : cards[6]		=7	6%10+1 			=>7
		// 7 : cards[7]		=8	=>8K
		// 8 : cards[8]		=9	8%10+1	8+1 => 9
		// 9 : cards[9]		=10	9%10+1	9+1 => 10
		// 10 : cards[10]	=1	10%10+1	0+1 => 1
		// 11 : cards[11]	=2			1+1 => 2
		/*
		int num = 0%10+1;
		cards[0] = new SutdaCard(0, 0<10 && (0==1||0==3||0==8)? true:false);
		
			num = 1%10+1;
		cards[1] = new SutdaCard(0, 0<10 && (0==1||0==3||0==8)? true:false);
		*/
		cards = new SutdaCard[CARD_NUM];
		for(int i=0; i<cards.length; i++) {
			int num = i%10+1;
			cards[i] = new SutdaCard(num, i<10 &&(num==1||num==3||num==8)? true:false);
		}
	}
	public StudaDeck(SutdaCard[] cards) {
		super();
		this.cards = cards;
	}
	
}
////////////////////////////////////////////////////
public class Ex005 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard();
		System.out.println(card1);					//출력 : 1K
		SutdaCard card2 = new SutdaCard(3, false);
		System.out.println(card2);					//출력: 3
		System.out.println("------------------------------");
		StudaDeck deck = new StudaDeck();
		System.out.println(deck);
	}
}
