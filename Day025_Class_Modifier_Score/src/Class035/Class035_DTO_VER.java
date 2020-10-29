package Class035;
public class Class035_DTO_VER {
	public static void main(String[] args) {
		//저장할 공간
		Score_ver2 iron = new Score_ver2("아이언맨",100,100,99);
		Process process1 = new Process();
		process1.show(iron);
//		double[] result1 = Process.exec(iron.getKor(), iron.getEng(), iron.getMath());
//		iron.setTotal((int)result1[0]);
//		iron.setAver(result1[1]);
//		System.out.println(iron);			
	}
}
/*
수업자료에서 문제 확인할 것
*/