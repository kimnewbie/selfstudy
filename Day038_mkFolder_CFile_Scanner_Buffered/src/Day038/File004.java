package Day038;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class File004 {
	public static void main(String[] args) {
		String folderPath = "C:\\file\\file001";
		String filePath = "\\write004.txt";
		File folder = new File(folderPath);
		File file = new File(folderPath+filePath);
		
		try {
			if(!folder.exists()) {folder.mkdir();}
			if(!file.exists()) {file.createNewFile();}
		} catch(Exception e) {e.printStackTrace();}
		
		System.out.println("\nfile쓰기");
		Path output = Paths.get(folderPath+filePath);
		Scanner sc = new Scanner(System.in);
		String name ="";
		
		System.out.print("강아지 이름은? > "); name = sc.next();
		System.out.println(name + "이(가) 추가되었습니다.");
		try { // 옵션
			BufferedWriter writer = Files.newBufferedWriter(output,StandardCharsets.UTF_8,StandardOpenOption.APPEND);	
			writer.write(name);
			writer.newLine();
			writer.close(); 
		} catch (IOException e) {e.printStackTrace();}
	}
}
