package Day029_Polymorphism_Abstract;

import java.util.Arrays;

class Robot{}
///
class DanceRobot extends Robot {
	@Override public String toString() { return "DanceRobot"; }
	void dance() {System.out.println("춤을 춥니다");}
}
///
class SingRobot extends Robot {
	void sing() {System.out.println("노래를 합니다");}
	@Override public String toString() { return "SingRobot"; }
}
///
class DrawRobot extends Robot {
	void draw() {System.out.println("그림을 그립니다");}
	@Override public String toString() { return "DrawRobot"; }
}
///
public class Ex003 {
	public static void action(Robot instance) { //static 중요한 아이라서 먼저 부름
			if(instance instanceof DanceRobot) {((DanceRobot)instance).dance();}
			else if(instance instanceof SingRobot) {((SingRobot)instance).sing();}
			else if(instance instanceof DrawRobot) {((DrawRobot)instance).draw();}
		}
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		System.out.println( Arrays.toString(arr)); //[DanceRobot, SingRobot, DrawRobot]
		for(int i=0; i<arr.length; i++) { 
			action(arr[i]);} 	
		
	}
}//end class
