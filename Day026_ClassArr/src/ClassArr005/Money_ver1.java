package ClassArr005;

public class Money_ver1 {
	//멤버변수
	static final String BANKNAME = "GREEN BANK";
	static double rate = 0.1;
	private String user_name;
	private long user_won;
	//멤버함수	
	@Override
	public String toString() {
		return "Money_ver1 [user_name=" + user_name + ", user_won=" + user_won + "]";
	}
	public static String getBankname() { return BANKNAME; } // final이라서 get밖에 안되는 것 같다..
	public static double getRate() { return rate; } public static void setRate(double rate) { Money_ver1.rate = rate; }
	public String getUser_name() { return user_name; } public void setUser_name(String user_name) { this.user_name = user_name; }
	public long getUser_won() { return user_won; } public void setUser_won(long user_won) { this.user_won = user_won; }
	//생성자
	public Money_ver1() { super();  } // 기본생성자
	public Money_ver1(String user_name, long user_won) { this.user_name=user_name; this.user_won=user_won; }
	
}//end class
