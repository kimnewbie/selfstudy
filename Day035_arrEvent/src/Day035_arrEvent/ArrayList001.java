package Day035_arrEvent;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayList001 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		String num = JOptionPane.showInputDialog("1,2,3 중에 입력해주세요.");
		if(num.equals("1")) {JOptionPane.showMessageDialog(null, "ONE");}
		else if(num.equals("2")) {JOptionPane.showMessageDialog(null, "TWO");}
		else if(num.equals("3")) {JOptionPane.showMessageDialog(null, "THREE");}
		else {JOptionPane.showMessageDialog(null, "다시 입력해주세요.");}
		
		System.out.println("[풀이]");
		ArrayList numbers = new ArrayList();
		String[] nums = new String[] {"ONE","TWO","THREE"};
		for(int i=0; i<nums.length; i++) {numbers.add(nums[i]);}
		System.out.println("inputDialog 이용해서 1,2,3 중에 입력해주세요");
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("1,2,3 중에 입력해주세요."));
		JOptionPane.showMessageDialog(null, numbers.get(num2-1));
		
	}
}
