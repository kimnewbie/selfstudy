package Day038;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File001_Write001 {
	public static void main(String[] args) {
		System.out.println("Path 사용해서 만들기");
		String folderPath = "C:\\file\\file001";
		String filePath = "\\write.txt";
		
		File folder = new File(folderPath);
		if(!folder.exists()) {folder.mkdir(); System.out.println("1. 폴더생성완료!");}
		else {System.out.println("1. 폴더있어요!");}
//		-------------------------------------------
		File file = new File(folderPath + filePath);
		try {
			if (!file.exists()) {file.createNewFile(); System.out.println("2. 파일생성완료!");}
			else {System.out.println("2. 파일있어요!");}
		} catch(Exception e) {e.printStackTrace();}		
		
////		1. folder 만들기	- C:\\file\\file001
//		File folder = new File("C:\\file\\file001");
//		System.out.println("FOLDER EXISTS : " + folder.exists()); // false
//		if(!folder.exists()) {folder.mkdir();}
//		System.out.println("FOLDER EXISTS : " + folder.exists()); // true
//		
//		//		2. 파일만들기		- 위의 폴더에 write1.txt
//		File file = new File("C:\\file\\file001\\write1.txt");
//		System.out.println("FILE EXISIT : " + file.exists());
//		try {
//			if(!file.exists()) { file.createNewFile(); }				
//			} catch (Exception e) { e.printStackTrace(); }
//		System.out.println("creatNewFile을 한 후 : " + file.exists()); // true
		
//		[2] 파일쓰기 (Reader, Writer)
		Path output = Paths.get(folderPath +  filePath);
		try {
			BufferedWriter writer = Files.newBufferedWriter(output, StandardCharsets.UTF_8);
			writer.write("APPLE");		writer.newLine(); // 안해주면 APPLEBANANACOCONUT 이렇게 나옴
			writer.write("BANANA");		writer.newLine(); // 쓸때마다 사용하는 게 단점
			writer.write("COCONUT");	writer.newLine();
			writer.close(); // ★★★펜뚜껑닫기★★★
		} catch (IOException e) { e.printStackTrace(); }
	}
}

