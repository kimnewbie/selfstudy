package ClassArr003;
public class Apple {
	//멤버변수
	private String name; private int num, price; private String order; 		
	//멤버함수
	@Override
	public String toString() {
		return "Apple [order=" + order + ", name=" + name + ", num=" + num + ", price=" + price + "]";
	}	
	public String getName() { return name; }	
	public void setName(String name) { this.name = name; }	
	public int getNum() { return num; }
	public void setNum(int num) { this.num = num; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	public String getOrder() { return order; }
	public void setOrder(String order) { this.order = order; }
	//생성자
	public Apple() {
		this("APPLE",1,1000,"홍길동");/*생성자에서 생성자 부르기*/}
	public Apple(String name, int num, int price, String order) {
		super();
		this.name = name;		
		this.num = num;
		this.price = price;
		this.order = order;
	}
}//end class
