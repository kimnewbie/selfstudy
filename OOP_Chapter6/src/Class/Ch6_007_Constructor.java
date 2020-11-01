package Class;
class Data_1 {
	int value;
}

class Data_2 {
	int value;
	

	Data_2(int x) {   //  매개변수가 있는 생성자
		value = x;
	}
	Data_2(){} // 밑에 에러나서 만들어줌
}

class Ch6_007_Constructor {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // ---> compile error발생
		//Data_2(){} 기본 생성자를 추가해야함
	}
}