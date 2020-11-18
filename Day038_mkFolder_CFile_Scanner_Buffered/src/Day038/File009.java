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

public class File009 {
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
				while(true) {
					String readLine = reader.readLine();
					if(readLine==null) {break;}
					System.out.println(readLine);					
				}
				reader.close();
			}catch(IOException e) {e.printStackTrace();}
		}		
	}
}
