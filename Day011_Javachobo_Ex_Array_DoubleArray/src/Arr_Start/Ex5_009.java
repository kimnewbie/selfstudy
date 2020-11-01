package Arr_Start;
class Ex5_009 {
	public static void main(String[] args) {

		 int[][] score = {//	kor	 eng  math
							  { 100, 100, 100}
							, { 20, 20, 20}
							, { 30, 30, 30}
							, { 40, 40, 40}
							, { 50, 50, 50}
						};
		// 과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal = 0;

	    System.out.println("번호  국어  영어  수학  총점  평균 ");
	    System.out.println("=============================");

		for(int i=0;i < score.length;i++) {
			int  sum = 0;      // 개인별 총점
			float avg = 0.0f;  // 개인별 평균

			korTotal  += score[i][0]; //0열이 kor점수
			engTotal  += score[i][1]; //1열이 eng점수
			mathTotal += score[i][2]; //2열이 math점수
			System.out.printf("%3d", i+1);
												  //score[5][3]
												  //score.length=5
			for(int j=0;j < score[i].length;j++) {//score[i].length=3
				sum += score[i][j]; 
				System.out.printf("%5d", score[i][j]); //번호 1~5까지
			}

			avg = sum/(float)score[i].length;  // 평균계산
			System.out.printf("%5d %5.1f%n", sum, avg);
		}

		System.out.println("=============================");
    	System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, mathTotal);
	}
}