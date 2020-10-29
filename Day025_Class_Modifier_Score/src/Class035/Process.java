package Class035;

public class Process {

	public Process() { super(); }
	//기능1) 총점/평균 구하기
	//리턴값 : String or double[]#
	//메서드명 : exec(국어,영어,수학점수);
	//파라미터 : 국어점수, 영어점수, 수학점수
	public double[] exec(int kor, int eng, int math) {
		double[] result = new double[2]; // 0-총점, 1-평균
		result[0] = kor+eng+math; //총점
		result[1] = result[0]/3.0f; //평균
		return result;
	}
	//기능2) 합격을 계산해주는 메서드 - 60점이상이면 합격 아니면 불합격
	//리턴값 : String
	//메서드명 : exec
	//파라미터 : double aver
	public String exec(double aver) { return (aver>=60)? "합격":"불합격"; }
	
	//기능3) 장학생을 계산해주는 메서드 - 95점이상이면 장학생
	//리턴값 : String
	//메서드명 : exec_jang
	//파라미터 : double aver
	public String exec_jang(double aver) { return (aver>=95)? "장학생":""; }
	
	//기능4) 평균정도를 별로 보여주는 메서드 - 평균점수대만큼 별출력
	//리턴값 : String
	//메서드명 : exec_star
	//파라미터 : double aver
	public String exec_star(double aver) { 
		String result ="";
		double avg =aver;
		for (int i=0; i<(int)avg/10; i++) {
			result += "*";
		}
		return result;
	}	
	//기능5) 출력해주는 메소드
	//리턴값 : void
	//메서드명 : show
	//파라미터 : Score_ver2 iron
	public void show(Score_ver2 iron) {
		double[] result = exec(iron.getKor(), iron.getEng(), iron.getMath());
		iron.setTotal((int)result[0]);
		iron.setAver(result[1]);
		iron.setS(exec_jang(result[1]));
		iron.setP(exec(result[1]));
		iron.setRank(exec_star(result[1]));
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+ "이름	국어	영어	수학	총점	평균	합격여부	장학생	랭킹\r"+
				":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(iron.getName()+"\t"+iron.getKor()+"\t"+iron.getEng()+"\t"+iron.getMath()+"\t"+iron.getTotal()
							+"\t"+String.format("%.2f",iron.getAver())+"\t"+iron.getP()+"\t"+iron.getS()+"\t"+iron.getRank());
		}
	}