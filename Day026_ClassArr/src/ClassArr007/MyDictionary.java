package ClassArr007;

public class MyDictionary {

	//멤버변수
	static int dno_count = 0; //해당번호를 자동으로 카운트하는 STATIC 변수
	static int trueAnswer = 0; //맞춘 답변개수 카운트하는 STATIC 변수
	private int dno; //각 해당번호
	private String word; //단어
	private char userAnswer; //사용자 맞춘 O X 둘 중 하나 저장

	//멤버함수
	@Override
	public String toString() {
		return "MyDictionary [dno=" + dno + ", word=" + word + ", userAnswer=" + userAnswer + "]";
	}
	public static int getDno_count() { return dno_count; }  public static void setDno_count(int dno_count) { MyDictionary.dno_count = dno_count; }
	public static int getTrueAnswer() { return trueAnswer; }  public static void setTrueAnswer(int trueAnswer) { MyDictionary.trueAnswer = trueAnswer; }
	public int getDno() { return dno; }  public void setDno(int dno) { this.dno = dno; }
	public String getWord() { return word; }  public void setWord(String word) { this.word = word; }
	public char getUserAnswer() { return userAnswer; }  public void setUserAnswer(char userAnswer) { this.userAnswer = userAnswer; }

	//생성자		
	public MyDictionary() { super(); } // 기본생성자
	public MyDictionary(String word) { this.word=word; }
	

}
