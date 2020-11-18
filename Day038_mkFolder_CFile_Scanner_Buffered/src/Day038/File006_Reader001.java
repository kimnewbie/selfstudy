package Day038;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class File006_Reader001 {
	public static void main(String[] args) {
		String folderPath	=	"C:\\file\\file001";
		String filePath		=	"\\write.txt";
		Path input = Paths.get(folderPath+filePath);
		BufferedReader reader = null;
		File folder = new File(folderPath);
		File file = new File(folderPath+filePath);
		
		if(!folder.exists() ||  !file.exists()) { // 폴더가 없거나, 파일이 없는 경우
			JOptionPane.showMessageDialog(null, "파일을 찾을 수 없습니다. :(");
		} else {
			try {
				reader = Files.newBufferedReader(input, StandardCharsets.UTF_8);
				while(true) {
					String readLine = reader.readLine();
					if(readLine ==  null) {break;}
					System.out.println(readLine);
				}				
			}catch(IOException e) {e.printStackTrace();}
		}		
	}
}
