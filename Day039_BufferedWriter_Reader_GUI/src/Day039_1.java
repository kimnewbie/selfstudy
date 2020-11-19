import java.util.ArrayList;
import java.util.Iterator;

class Apple_coll{
	private String type;
	private int price;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Apple_coll() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apple_coll(String type, int price) {
		super();
		this.type = type;
		this.price = price;
	}
	
}
public class Day039_1 {
	public static void main(String[] args) {
		ArrayList<Apple_coll> list = new ArrayList<>();
		Apple_coll[] app = {new Apple_coll("red",1000),new Apple_coll("green",1200),
				new Apple_coll("red",1000),new Apple_coll("red",1000),};
		for(int i=0; i<app.length; i++) { list.add(app[i]); }
		
		Iterator<Apple_coll> iter = list.iterator();
		while(iter.hasNext()) {
			Apple_coll temp = (Apple_coll)iter.next();
			System.out.println(temp.getType()+"\t"+temp.getPrice());
		}
	}
}
