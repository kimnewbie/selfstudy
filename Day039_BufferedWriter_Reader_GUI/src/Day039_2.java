import java.util.ArrayList;
import java.util.Iterator;

class KimBab{
	private String type;
	private int num;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public KimBab() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KimBab(String type, int num) {
		super();
		this.type = type;
		this.num = num;
	}
	
}
public class Day039_2 {
	public static void main(String[] args) {
		ArrayList<KimBab> kimbab_list = new ArrayList<>();
		KimBab[] menu = {new KimBab("rice",1),new KimBab("danmugi",1),new KimBab("danmugi",1),new KimBab("kim",1),};
		for(int i=0; i<menu.length; i++) { kimbab_list.add(menu[i]); }
		Iterator<KimBab> iter = kimbab_list.iterator();
		while(iter.hasNext()) {
			KimBab temp = (KimBab)iter.next();
			System.out.println(temp.getType()+"\t"+temp.getNum());
		}
	}
}
