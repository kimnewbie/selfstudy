package day22;

public class Test_2020_10_26 {
	public static void main(String[] args) {
		//주어진 조건
		String name[] = {"아이언맨", "헐크", "캡틴", "토르", "호크아이"};
		int size = name.length;
		int[] kor={100,20,90,70,35};
		int[] eng={100,50,95,80,100};
		int[] mat={100,30,90,60,100};
		float avg[] = new float[5];
		int rank[] = {1, 1, 1, 1, 1};
		String pass[] = new String[5];
		String jang[] = {"", "", "", "", ""};
		String star[] = {"", "", "", "", ""};
		// 1) process_aver - 구하기
		for(int i=0; i<name.length; i++) { avg[i] = process_avg(kor[i],eng[i],mat[i]); }
		// 2) process_rank - 등수구하기
		process_rank(size, avg , rank);
		// 3) process_scholar - 장학생 95점이상
		process_scholar( avg , jang );
		// 4) process_pass
		process_pass(avg , kor, eng, mat, pass);
		// process_star - 별
		process_star(avg , star);
		// process_show - 출력
		process_show(name, kor, eng, mat, avg, rank,pass, jang, star);		
	}
	public static float process_avg(int kor, int eng, int mat) { return (kor+eng+mat)/3f; }
	public static void process_rank(int size, float[] avg , int[] rank) {
		int result = 0;
		for(int i=0; i<size; i++) {
			for(int j=1+i; j<size; j++) {
				result = (avg[i]>avg[j])? rank[j]++ : rank[i]++; } } }
	public static void process_scholar(float[] avg , String[] jang) { for(int i=0; i<jang.length; i++) { jang[i] = (avg[i]>=95)? "장학생":""; } }
	public static void process_pass(float[] avg, int[] kor, int[] eng, int[] mat, String[] pass) {
		for(int i=0; i<pass.length; i++) {
			pass[i] = (avg[i]>=60&&kor[i]>=40&&eng[i]>=40&&mat[i]>=40)? "합격" :
				(avg[i]>=60&&(kor[i]<40||eng[i]<40||mat[i]<40))? "재시험" : "불합격"; } }
	public static void process_star(float[] avg , String[] star) {
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<(int)avg[i]/10; j++) {
				star[i] +="*"; } } }
	
	public static void process_show(String[] name, int[] kor, int[] eng, int[] mat, float[] avg ,int[] rank,String[] pass,String[] jang,String[] star) {
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+ "	국어	영어	수학	평균	등수	합격여부	장학생	랭킹\r\n"
				+ ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for(int i=0; i<name.length; i++) {
		System.out.println(name[i] + "\t"+ kor[i]+"\t"+ eng[i]+"\t"+ mat[i]+"\t"+ String.format("%.2f", avg[i])+"\t"+ rank[i]+"\t"+ pass[i]+"\t"+ jang[i]+"\t"+ star[i]);
		
		}System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n");
	}
	
}//end class
/*
1. 평균을 구하시오 [10점]
2. 합격여부를 구하시오 [20점]
조건1. 60점 이상이면 합격 , 아니면 불합격
조건2. 합격에서도 국어, 영어, 수학 각각의 점수가 40점 미만이라면 재시험
3. 장학생여부를 구하시오 [10점]
조건1. 평균이 95점이상이라면 장학생
4. 랭킹을 구하시오. [20점]
평균점수대별로 *을 출력하시오. ( 평균이100점이라면 별10개, 30점대라면 3개,,,,,,)
5. 등수를 구하시오. [20점]
6. 다음과 같이 출력하시오. [20점]
*/