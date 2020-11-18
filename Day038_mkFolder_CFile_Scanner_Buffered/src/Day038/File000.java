package Day038;

import java.io.File;

public class File000 {
	public static void main(String[] args) {
//		1. folder 확인
		System.out.println("====================================");
		File folder = new File("C:\\file");
		System.out.println("FOLDER EXISTS : " + folder.exists()); // false 없어~
		System.out.println("====================================");
//		2. 폴더 만들기 - make
		if(!folder.exists()) {folder.mkdir();}
		System.out.println("002. mkdir 이용해 폴더 만들고 난 후 : " + folder.exists()); // true
		System.out.println("====================================");
//		3. 파일 확인
		File file = new File("C:\\file\\" + "file000.txt");
		System.out.println("003. FILE EXISTS : " + file.exists()); // false
//		4. 파일 만들기 - create ※ create는 오류 발생 가능성 때문에 try-catch를 사용해야해
		try {
			if(!file.exists()) {file.createNewFile();}
		} catch(Exception e) { e.printStackTrace(); }
		System.out.println("004. createNewFile을 한 후 FILE EXISTS : " + file.exists()); // true
	}
}
