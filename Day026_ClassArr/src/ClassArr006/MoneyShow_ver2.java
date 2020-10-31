package ClassArr006;

public class MoneyShow_ver2 { //2-2 출력하는 기능
	//★★카드 등급값이 null이어서 초기화를 시켰다.
	//카드등급이있는 클래스인 MoneyCard 를 new로 여기서 해주며
	//그리고 밑에 show칸에서 불러 올 땐 "변수(yolo).랭킹을 출력하는 메서드(cardRanking)(users)
	MoneyCard yolo = new MoneyCard();
	
	public void show(Money_ver2 users) {
		greeting();
		yolo.cardRanking(users);
		System.out.println("[USER] "+users.getUser_name()+"고객님의 정보입니다.");
		System.out.println("잔액 : " + users.getUser_won());
		System.out.println("등급 : " + users.getRanking());
		System.out.println();
	}

	public void show(Money_ver2[] users) {
		greeting();
		yolo.cardRanking(users);
		System.out.println("[USER]\tNAME\tBALANCE\tCARD");
		for(int i=0; i<users.length; i++) {
			System.out.println("---------------------------------------");
			System.out.println("[USER] "+users[i].getUser_name()+"\t"+users[i].getUser_won()
								+"\t"+users[i].getRanking());
		}
	}
	public void greeting() {
		System.out.println("====================================");
		System.out.println("::::::::: WELCOME! GREEN BANK");
		System.out.println("====================================");
	}
	//기본생성자
	public MoneyShow_ver2() { super(); }
	
}