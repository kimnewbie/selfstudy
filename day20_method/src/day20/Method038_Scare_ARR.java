package day20;

public class Method038_Scare_ARR {
	public static void main(String[] args) {
		/*
		 ㅁ출력예시
		 이름	국어	영어	수학	평균	등수	합격여부	장학생	랭킹
		 아이	100	100	100	100	1	합격		장학생	**********
		 헐크	20	50	30	33	5	불합격			***
		 캡틴	90	95	90	91	2	합격				*********
		 토르	70	80	60	70	4	합격				*******
		 호크	35	100	100	78	3	재시험			*******
		 
		 ㅁ주어진옵션
		 public static void main(String[] args) {
		 	String name[] = {"아이언맨","헐크","캡틴","토르","호크아이"};
		 	int size = name.length;
		 	int[] kor = {100,20,90,70,35};
			int[] eng = {100,50,95,80,100};
		 	int[] mat = {100,30,90,60,100};
		 	int avg[] = new int[5];
		 	int rank[] = {1,1,1,1,1};
		 	String pass[]={"","","","",""};
		 	String jang[]={"","","","",""};
		 	String star[]={"","","","",""};
		 	//1)process_aver-평균구하기
		 	for(int i=0; i<name.length; i++){ avg[i]=process_avg(kor[i],eng[i],mat[i]);}
		 	//2)process_rank-등수구하기
		 	process_rank(size, avg, rank);
		 	//3)process_scholar-장학생95점이상
		 	process_scholar(avg,jang);
		 	//4)process_pass-합격60이상이고,각각40이상/불합격/재시험-각각 40미만인게 있으면
		 	process_pass(avg, kor, eng, mat, pass);
		 	//process_star-별
		 	process_star(avg, star);
		 	//process_show-출력
		 	process_show(name, kor, eng, mat, avg, rank, pass, jang, star);
		 */
		String name[] = {"아이언맨","헐크","캡틴","토르","호크아이"};
	 	int size = name.length;
		int[] kor = {100,20,90,70,35};
		int[] eng = {100,50,95,80,100};
		int[] mat = {100,30,90,60,100};
	 	int avg[] = new int[5];
	 	int rank[] = {1,1,1,1,1};
	 	String pass[]={"","","","",""};
	 	String jang[]={"","","","",""};
	 	String star[]={"","","","",""};
	 	//1)process_aver-평균구하기
	 	for(int i=0; i<name.length; i++){ avg[i]=process_avg(kor[i],eng[i],mat[i]);}
	 	//2)process_rank-등수구하기
	 	process_rank(size, avg, rank);
	 	//3)process_scholar-장학생95점이상
	 	process_scholar(avg,jang);
	 	//4)process_pass-합격60이상이고,각각40이상/불합격/재시험-각각 40미만인게 있으면
	 	process_pass(avg, kor, eng, mat, pass);
	 	//process_star-별
	 	process_star(avg, star);
	 	//process_show-출력
	 	process_show(name, kor, eng, mat, avg, rank, pass, jang, star);
	}//end main
	public static int process_avg(int kor, int eng, int mat) {
		return (kor+eng+mat)/3;		
	}//리턴값: int, 메소드명: process_avg, 자료형: int kor, int eng, int mat
	public static void process_rank(int size, int[] avg, int[] rank) {
		for(int i=0; i<=size; i++) {
			for(int j=1+i; j<size; j++) {
				if(avg[i]>avg[j]) { rank[j]++;}
				else if(avg[i]<avg[j]) { rank[i]++;}
			}
		}
	}//리턴값: void, 메소드명: process_rank, 자료형: int size, int[] avg, int[] rank
	public static void process_scholar(int[] avg, String[] jang) {
		for(int i=0; i<avg.length; i++) {
			jang[i] = (avg[i]>=95)? "장학생":"";}
	}//리턴값: void, 메소드명: process_scholar, 자료형: int[] avg, String[] jang 
	public static void process_pass(int[] avg, int[] kor, int[] eng, int[] mat, String[] pass) {
		for(int i=0; i<pass.length; i++) {
		if(avg[i]>=60&&kor[i]>=40&&eng[i]>=40&&mat[i]>=40) { pass[i] = "합격"; }
		else if(avg[i]>=60&&kor[i]<40||eng[i]<40||mat[i]<40) { pass[i] = "재시험"; }
		else { pass[i] = "불합격";}}
	}//리턴값: void, 메소드명: process_pass, 자료형: int[] avg, int[] kor, int[] eng, int[] mat, String[] pass
	public static void process_star(int avg[],String star[]) {
		for(int i=0;i<avg.length;i++) {
			for(int j=0;j<avg[i]/10;j++) {
			star[i] += "*";
			}
		}
	}//리턴값: void, 메소드명: process_star, 자료형: int[] avg, String[] star
	public static void process_show(String[]  name, int[] kor, int[]  eng, int[]  mat, int[]  avg, int[]  rank, String[]  pass, String[]  jang, String[]  star) {
		System.out.println("이름\t국어\t영어\t수학\t평균\t등수\t합격여부\t장학생\t랭킹");
		for(int i=0; i<name.length; i++) {
		System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"
				+avg[i]+"\t"+rank[i]+"\t"+pass[i]+"\t"+jang[i]+"\t"+star[i]);
		}
	}
}//end class
