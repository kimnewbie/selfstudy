package ClassArr006;

public class Money_ver2 {//DTO역할
	
	//멤버변수
	static final String BANKNAME = "GREEN BANK";
	static double rate = 0.1;
	private String user_name;
	private long user_won;
	private String ranking; //green, silver, gold
	
	//멤버함수	
	@Override
	public String toString() {
		return "Money_ver2 [user_name=" + user_name + ", user_won=" + user_won + ", ranking=" + ranking + "]";
	}
	public static double getRate() { return rate; } public static void setRate(double rate) { Money_ver2.rate = rate; }
	public String getUser_name() { return user_name; } public void setUser_name(String user_name) { this.user_name = user_name; }
	public long getUser_won() { return user_won; } public void setUser_won(long user_won) { this.user_won = user_won; }
	public String getRanking() { return ranking; } public void setRanking(String ranking) { this.ranking = ranking; }
	public static String getBankname() { return BANKNAME; }
	
	//생성자
	Money_ver2(){super();} //기본생성자
	public Money_ver2(String user_name, long user_won, String ranking) {
		super();
		this.user_name = user_name;
		this.user_won = user_won;
		this.ranking = ranking;
	}
	public Money_ver2(String user_name, long user_won) {
		this();
		this.user_name = user_name;
		this.user_won = user_won;
	}
}
