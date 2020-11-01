package Arr_Start;
class Ex5_008_DoubleArray {
	public static void main(String[] args) {
		int[][] score = { //2차원 배열의 생성과 초기화를 동시에 함
							  { 100, 100, 100 }
							, { 20, 20, 20 }
							, { 30, 30, 30 }
							, { 40, 40, 40 }
						}; 
		int sum = 0;

		for (int i = 0; i < score.length; i++) { //score.length=4
			for (int j = 0; j < score[i].length; j++) { //score[i].length=3
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

				sum += score[i][j];
			}
		}

		System.out.println("sum=" + sum);
	}
}