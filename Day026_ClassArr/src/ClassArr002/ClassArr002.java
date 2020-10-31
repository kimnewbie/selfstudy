package ClassArr002;

import java.util.Arrays;

public class ClassArr002 {
	public static void main(String[] args) {
		Apple[] a = new Apple[3];
		System.out.println(Arrays.toString(a)); //[null, null, null]
		a[0] = new Apple("RED",2,1000,"iron");
		a[1] = new Apple("GREEN",1,1500,"hulk");
		a[2] = new Apple("GOLD",2,2000,"captain");
		//a[0] = new Apple();	a[0].setName("RED"); a[0].setNum(2); a[0].setPrice(1000); a[0].setOrder("iron");
		//a[1] = new Apple();	a[1].setName("GREEN"); a[1].setNum(1); a[1].setPrice(1500); a[1].setOrder("hulk");
		//a[2] = new Apple();	a[2].setName("GOLD"); a[2].setNum(3); a[2].setPrice(2000); a[2].setOrder("captain");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
}