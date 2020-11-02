import java.util.Scanner;

class User extends Object{	
	//멤버변수
	private String name;
	private String id;
	//멤버함수
	void show() { //이름과 아이디 출력기능
		
		System.out.print(""+this.name +"\t"+ this.id+"\t");
	}
	@Override public String toString() { return "User [name=" + name + ", id=" + id + "]";}
	
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public String getId() { return id; } public void setId(String id) { this.id = id; }

	//생성자
	public User() { super(); }
	public User(String name, String id) { super(); this.name = name; this.id = id; }
		
}
///////////////////////////////////////////////////////////////////////////

class Score_v1 extends User{	
	//멤버변수
	private int java, jsp, mysql;
	
	//멤버함수 : void input() - id, name, java, jsp, mysql 점수 입력기능
	@Override public String toString() { return "Score_v1 [java=" + java + ", jsp=" + jsp + ", mysql=" + mysql + "]"; }
	
	public int getJava() { return java; }  public void setJava(int java) { this.java = java; }
	public int getJsp() { return jsp; }  public void setJsp(int jsp) { this.jsp = jsp; }
	public int getMysql() { return mysql; }  public void setMysql(int mysql) { this.mysql = mysql; }
	
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("::::SCORE INPUT");
		System.out.print("= NAME 입력 : "); super.setName(scanner.next());
		System.out.print("= ID 입력 : "); super.setId(scanner.next());
		System.out.print("= JAVA 입력 : "); this.java=scanner.nextInt();
		System.out.print("= JSP 입력 : "); this.jsp=scanner.nextInt();
		System.out.print("= MYSQL 입력 : "); this.mysql=scanner.nextInt();
		
	}

	//오버라이딩 : void show() - id, name, java, jsp, mysql 점수 출력 기능
	void show() {
		super.show();
		System.out.print(""+this.java+"\t"+this.jsp+"\t"+this.mysql+"\t");
	}
	//생성자
	public Score_v1() { super(); }
	public Score_v1(String name, String id) { super(name, id); }
	public Score_v1(int java, int jsp, int mysql) { super(); this.java = java; this.jsp = jsp; this.mysql = mysql; }
	//this(java, jsp, mysql); super()/this() 생성자는 1개만 사용가능
	
	
}//end Score_v1 
///////////////////////////////////////////////////////////////////////////////

class Score_v2  extends Score_v1{
	
	private int spring, project, total;
	private double avg;
	//멤버함수 : void input() - id, name, java, jsp, mysql, spring, project 입력기능
	void input() {
		Scanner scanner = new Scanner(System.in);
		super.input();
		System.out.print("= SPRING 입력 : "); this.spring=scanner.nextInt();
		System.out.print("= PROJECT 입력 : "); this.project=scanner.nextInt();
		scanner.close();
	}
	//void process_total() - 총점을 구해주는 함수
	void process_total() {
		this.setTotal(super.getJava()+super.getJsp()+super.getMysql()+
				this.getSpring()+this.getProject());
		//this.total = super.getJava()+super.getJsp()+super.getMysql()+
		//				this.getSpring()+this.getProject();
	}
	//void process_avg() - 평균을 구해주는 함수
	void process_avg() {
		process_total();//★불러준다
		this.setAvg(this.total/5f);
	}
	//오버라이딩 : void show() - id, name, java, jsp, mysql, spring, project, total, avg 점수 출력 기능
	void show() {
		System.out.println("==================================================================================");
		System.out.println("이름	아이디	JAVA	JSP	MYSQL	SPRING	PROJECT	TOTAL	AVG");
		System.out.println("==================================================================================");
		super.show();
		System.out.println(""+this.spring+"\t"+this.project+"\t"+this.total+"\t"+String.format("%.1f", this.avg));
	}
	
	
	public int getSpring() { return spring; } public void setSpring(int spring) { this.spring = spring; }
	public int getProject() { return project; } public void setProject(int project) { this.project = project; }
	public int getTotal() { return total; } public void setTotal(int total) { this.total = total; }
	public double getAvg() { return avg; } public void setAvg(double avg) { this.avg = avg; }
	
	//생성자
	public Score_v2() { super(); }
	public Score_v2(int java, int jsp, int mysql) { super(java, jsp, mysql); }
	public Score_v2(String name, String id) { super(name, id); }
	public Score_v2(int spring, int project, int total, double avg) {
		super();
		this.spring = spring;
		this.project = project;
		this.total = total;
		this.avg = avg;
	}
	
}//end Score_v2
public class Extends008 {
	public static void main(String[] args) {
		Score_v2 iron = new Score_v2();
		iron.input();
		iron.process_total();
		iron.process_avg();
		iron.show();
	}
}
