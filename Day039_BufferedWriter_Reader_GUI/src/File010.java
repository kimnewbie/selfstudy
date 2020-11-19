import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class StdInfo{
	private int no; private String name; private int java, jsp, spring, project, sum;
	private double avg;
	static int cnt = 0;
	//
	public StdInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StdInfo(int no, String name, int java, int jsp, int spring, int project, int sum, double avg) {
		super();
		this.no = ++cnt;
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		this.project = project;
		this.sum = sum;
		this.avg = avg;
	}
	public StdInfo(String name, int java, int jsp, int spring, int project) {
		super();
		this.no = ++cnt;
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		this.project = project;
	}

	//
	
	public int getNo() { return no; }  public void setNo(int no) { this.no = no; }
	public String getName() { return name; }  public void setName(String name) { this.name = name; }
	public int getJava() { return java; }  public void setJava(int java) { this.java = java; }
	public int getJsp() { return jsp; }  public void setJsp(int jsp) { this.jsp = jsp; }
	public int getSpring() { return spring; }  public void setSpring(int spring) { this.spring = spring; }
	public int getProject() { return project; }  public void setProject(int project) { this.project = project; }
	public int getSum() { return sum; }  public void setSum(int sum) { this.sum = sum; }
	public double getAvg() { return avg; }  public void setAvg(double avg) { this.avg = avg; }
}
public class File010 {
	public static void main(String[] args) {
		// 경로지정해주기
		String folderPath = "C:\\file";
		String filePath = "\\file010.txt";
		File folder = new File(folderPath);
		File file = new File(folderPath+filePath);
		// 폴더, 파일 만들기
		try {
			if(!folder.exists()) {folder.mkdir();}
			if(!file.exists()) {file.createNewFile();}
		} catch (IOException e) {e.printStackTrace();}
		//
		Path input = Paths.get(folderPath+filePath);
		ArrayList<StdInfo> list = new ArrayList<>();
		StdInfo std = new StdInfo();
		Scanner sc = new Scanner(System.in);
		Iterator<StdInfo> iter = null;
		BufferedWriter writer = null;
		BufferedWriter writer2 = null;
		BufferedReader reader = null;
		//
		String name, answer = "";
		int a,b,c,d = 0;
		while(true) {
			System.out.print("이름을 입력해주세요 > "); name = sc.next();
			System.out.print("JAVA 점수를 입력해주세요 > "); a = sc.nextInt();
			System.out.print("JSP 점수를 입력해주세요 > "); b = sc.nextInt();
			System.out.print("SPRING 점수를 입력해주세요 > "); c = sc.nextInt();
			System.out.print("PROJECT 점수를 입력해주세요 > "); d = sc.nextInt();
			System.out.print("신입사원을 계속 추가하시겠습니까?(y/n) > "); answer = sc.next();
			list.add(new StdInfo(name,a,b,c,d));
			if(answer.trim().toLowerCase().equals("n")) {break;}
		}
		try {
			writer = Files.newBufferedWriter(input, StandardCharsets.UTF_8); // name 애들이 계속 붙어나와서 하나 더 추가함
			writer2 = Files.newBufferedWriter(input, StandardCharsets.UTF_8,StandardOpenOption.APPEND);
			
			iter = list.iterator();
			writer.write("======================================================"+
					"\nNAME\tJAVA\tJSP\tSPRINT\tPROJECT\tTOT\tAVG"+"\n======================================================\n");			
			while(iter.hasNext()) {
				StdInfo temp = iter.next();
				temp.setSum(temp.getJava() + temp.getJsp() + temp.getProject() + temp.getSpring());
				temp.setAvg(temp.getSum()/4.0d);
				writer2.write(temp.getName()+"\t"+temp.getJava()+"\t"+temp.getJsp()+"\t"+temp.getSpring()+"\t"
							+temp.getProject()+"\t"+temp.getSum()+"\t"+String.format("%.2f", temp.getAvg()));
				writer2.newLine();
			}
			writer.close();		
			writer2.close();	
			System.out.println("파일쓰기 완료~");
		} catch (IOException e) {e.printStackTrace();}
		// 파일 읽어오기
		if(folder.exists()&&file.exists()) {	
			try {
				reader = Files.newBufferedReader(input, StandardCharsets.UTF_8);
				while(true) {
					String readLine = reader.readLine();
					if(readLine==null) {break;}
					System.out.println(readLine);
				}
				reader.close();
			} catch(IOException e) {e.printStackTrace();}		
		}
	} 
}
