package Day038;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class File008 {
	public static void main(String[] args) {
		/**
		System.out.println("\n[힌트]");
		String fruits = "apple,banana,coconut";
		String[] arr = fruits.split(",");
		System.out.println(Arrays.toString(arr));
		*/
		
		String folderPath = "C:\\file\\file001";
		String filePath = "\\write3.txt";
		Path input = Paths.get(folderPath+filePath);
		BufferedReader reader = null;
		File folder = new File(folderPath);
		File file = new File(folderPath+filePath);
		ArrayList<String[]> list = new ArrayList<>();
		Iterator<String[]> iter = null;
		
		if(!folder.exists()||!file.exists()) {
			JOptionPane.showMessageDialog(null, "파일을 찾을 수 없습니다.");
		} else {
			try {
				reader = Files.newBufferedReader(input, StandardCharsets.UTF_8);
//				while((readLine = reader.readLine())!=null){ 
				while(true) {
					String readLine = reader.readLine();
					if(readLine==null) {break;}
//					1) 3번째 줄 다음부터 읽어들이기가 필요
//					2) \t를 기준으로 문자열을 분리 		1	white	1000
//						length;indexOf, substring, replace, split ("기준점") ....
					String[] arr = readLine.split("\t");
					list.add(arr); 
				}
				reader.close();
			}catch(IOException e) {e.printStackTrace();}
		}
		iter = list.iterator();
		while(iter.hasNext()) {
			String[] temp = iter.next();
			System.out.println(temp[0]+"\t"+temp[1]+"\t"+temp[2]);
		}
	}
}
