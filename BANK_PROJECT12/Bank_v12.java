package BANK_PROJECT12;

public class Bank_v12 {
	//멤버변수
	private String id;
	private String pass;
	private double balance;
	static String Company="(주)유진은행";
	//
	public String getId() { return id; } public void setId(String id) { this.id = id; }
	public String getPass() { return pass; } public void setPass(String pass) { this.pass = pass; }
	public double getBalance() { return balance; } public void setBalance(double balance) { this.balance = balance; }
	public static String getCompany() { return Company; } public static void setCompany(String company) { Company = company; }
	//
	public Bank_v12() { super(); }
	public Bank_v12(String id, String pass, double balance) {
		super();
		this.id = id;
		this.pass = pass;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Bank_v12 [id=" + id + ", pass=" + pass + ", balance=" + balance + "]";
	}
}
