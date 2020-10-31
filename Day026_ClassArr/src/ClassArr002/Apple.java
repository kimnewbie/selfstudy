package ClassArr002;

public class Apple {
	//멤버변수
	private String name; private int num, price; private String order; 
	//멤버함수
	//생성자@Override
	public String toString() {
		return "Apple [name=" + name + ", num=" + num + ", price=" + price + ", order=" + order + "]";
	}	
	public String getName() { return name; }	
	public void setName(String name) { this.name = name; }	
	public int getNum() { return num; }
	public void setNum(int num) { this.num = num; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	public Apple() { super(); }
	public String getOrder() { return order; }
	public void setOrder(String order) { this.order = order; }
	
	public Apple(String name, int num, int price, String order) {
		super(); this.name = name; this.num = num; this.price = price; this.order = order; }
}//end class
