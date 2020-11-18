package Day038;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class MilkDtoF1{
	public static int cnt = 0;
	private int mno;
	private String mname;
	private int mprice;
	public int getMno() { return mno; } public void setMno(int mno) { this.mno = mno; }
	public String getMname() { return mname; } public void setMname(String mname) { this.mname = mname; }
	public int getMprice() { return mprice; } public void setMprice(int mprice) { this.mprice = mprice; }
	public MilkDtoF1() { super(); }
	public MilkDtoF1(int mno, String mname, int mprice) {
		super();
		this.mno = ++cnt;
		this.mname = mname;
		this.mprice = mprice;
	}
	public MilkDtoF1(String mname, int mprice) {
		super();
		this.mno = ++cnt;		
		this.mname = mname;
		this.mprice = mprice;
	}
	@Override
	public String toString() {
		return "MilkDtoF1 [mno=" + mno + ", mname=" + mname + ", mprice=" + mprice + "]";
	}	
	
}
public class File003 {
	public static void main(String[] args) {
		String folderPath = "C:\\file";
		String filePath = "\\write003.txt";
		Path output = Paths.get(folderPath+filePath); // 폴더+파일 = 주소 URI
		Scanner sc = new Scanner(System.in);
		ArrayList<MilkDtoF1> list = new ArrayList<>();
		MilkDtoF1 milk = new MilkDtoF1();
		String answer = "";
		
		while(true) { // 선생님은 while구문 2개 사용해서 나눠주심
			try {
				System.out.print("ㅁ 우유 이름 입력 > ");
				String a = sc.next();/* milk.setMname(sc.next()); writer.write(milk.getMname()); writer.newLine(); */
				System.out.print("ㅁ 우유 가격 입력 > ");
				int b = sc.nextInt(); /* milk.setMprice(sc.nextInt()); writer.write(milk.getMprice()); writer.newLine(); */
				list.add(new MilkDtoF1(a,b));							
				System.out.print("입력이 다 끝났습니까? y/n > "); answer = sc.next();

				BufferedWriter writer = Files.newBufferedWriter(output,StandardCharsets.UTF_8);
				if(answer.equals("Y")||answer.equals("y")) {
					Iterator<MilkDtoF1> iter = list.iterator();
					while(iter.hasNext()) {
						MilkDtoF1 temp = (MilkDtoF1) iter.next();
						writer.write(temp.getMno()+"\t"+temp.getMname()+"\t"+temp.getMprice());	writer.newLine();			
					}
					writer.close(); System.out.println("파일쓰기 성공!"); break;}

				System.out.println(list); // list에 들어갔는지 실시간 확인
				
//				System.out.print("입력이 다 끝났습니까? y/n > "); answer = sc.next();
//				if(answer.trim().toLowerCase().equals("y")){break;}
			} catch (IOException e) {e.printStackTrace(); }
		}
	}
}
