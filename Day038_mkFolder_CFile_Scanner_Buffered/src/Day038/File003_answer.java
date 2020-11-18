package Day038;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

class MilkDtoF2{
	public static int cnt = 0;
	private int mno;
	private String mname;
	private int mprice;
	public int getMno() { return mno; } public void setMno(int mno) { this.mno = mno; }
	public String getMname() { return mname; } public void setMname(String mname) { this.mname = mname; }
	public int getMprice() { return mprice; } public void setMprice(int mprice) { this.mprice = mprice; }
	public MilkDtoF2() { super(); }
	public MilkDtoF2(int mno, String mname, int mprice) {
		super();
		this.mno = ++cnt;
		this.mname = mname;
		this.mprice = mprice;
	}
	public MilkDtoF2(String mname, int mprice) {
		super();
		this.mno = ++cnt;		
		this.mname = mname;
		this.mprice = mprice;
	}
	@Override public String toString() { return "MilkDtoF2 [mno=" + mno + ", mname=" + mname + ", mprice=" + mprice + "]"; } 
}
public class File003_answer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<MilkDtoF2> list = new ArrayList<>();
		MilkDtoF2 milk = new MilkDtoF2();
		String answer = "", mname = ""; int mprice = 0;
		
		while(true) {
			System.out.print("ㅁ 우유 이름 입력 > "); mname = sc.next();
			System.out.print("ㅁ 우유 가격 입력 > "); mprice = sc.nextInt();
			list.add(new MilkDtoF2(mname,mprice));							
			System.out.print("입력이 다 끝났습니까? y/n > "); answer = sc.next();
			if(answer.trim().toLowerCase().equals("y")) {break;}
//			공백빼고 소문자로 변경해서 - n문자열이라면
		}
		String folderPath = "C:\\file";
		String filePath = "\\write003_answer.txt";
		File folder = new File(folderPath);
		File file = new File(folderPath+filePath);
		Path output = Paths.get(folderPath+filePath); // 폴더+파일 = 주소 URI
		Iterator<MilkDtoF2> iter = null;
		try {
			if(!folder.exists()) {folder.mkdir();}
			if(!file.exists()) {file.createNewFile();}
		} catch(Exception e) {e.printStackTrace();}
		
		try {				
			BufferedWriter writer = Files.newBufferedWriter(output,StandardCharsets.UTF_8);
			iter = list.iterator();			
			writer.write("======================\nNO\tNAME\tPRICE\n======================\n");
			while(iter.hasNext()) {
				MilkDtoF2 temp = iter.next();
				writer.write(temp.getMno()+"\t"+temp.getMname()+"\t"+temp.getMprice());	
				writer.newLine();			
			}
			writer.close();
			JOptionPane.showMessageDialog(null, "파일쓰기 성공!");
		} catch (IOException e) {e.printStackTrace(); }
	}
}
