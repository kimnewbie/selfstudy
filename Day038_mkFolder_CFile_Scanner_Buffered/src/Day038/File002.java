package Day038;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class File002 {
	public static void main(String[] args) {
		String folderPath = "C:\\file";
		String filePath = "\\file002.txt";
		
		File folder = new File(folderPath);
		if(!folder.exists()) {folder.mkdir(); System.out.println("1. 폴더생성완료!");}
		else {System.out.println("1. 폴더 있어요!");}
		
		File file = new File(filePath);
		try {
		if(!file.exists()) {file.createNewFile(); System.out.println("2. 파일생성완료!");}
		else {System.out.println("2. 파일 있어요!");}
		} catch(Exception e) {e.printStackTrace();}
		
		//
		Path output = Paths.get(folderPath+filePath);
		Scanner sc = new Scanner(System.in);
		String name = ""; int price = 0;
		
		System.out.print("ㅁ 우유 이름 입력 > "); name = sc.next(); 
		System.out.print("ㅁ 우유 가격 입력 > "); price = sc.nextInt();
		
		try { 
			BufferedWriter writer = Files.newBufferedWriter(output, StandardCharsets.UTF_8);
			writer.write(""+name +"\t"+price); // 큰따옴표를 붙여야 price에 오류가 안생겨 int로 했을 때
			writer.newLine();
			writer.close(); // 파일작성 닫기(해야 저장완료)
			System.out.println("파일쓰기 성공!");
		} catch (IOException e) {e.printStackTrace();}
	}
}
/**
BufferedReader / BufferedWriter는 
문자 입력 스트림으로부터 문자를 읽어 들이거나 문자 출력 스트림으로 문자를 
내보낼 때 버퍼링을 함으로써 
문자, 문자 배열, 문자열 라인 등을 보다 효율적으로 처리할 수 있도록 해준다
*/