package ClassArr001_Basic;

public class A {
		//멤버변수
		private String name;
		private int age;
		
		//생성자
		public A() { super(); }  
		public A(String name,int age) { super(); this.name=name; this.age=age;}  
		//멤버함수
		@Override
		public String toString() { return "ClassArr001 [name=" + name + ", age=" + age + "]"; }
		public String getName() { return name; } 
		public void setName(String name) { this.name = name; }
		public int getAge() { return age; }  public void setAge(int age) { this.age = age; }
}
