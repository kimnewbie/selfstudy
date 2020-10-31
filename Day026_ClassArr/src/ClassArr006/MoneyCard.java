package ClassArr006;

public class MoneyCard { //2-3 금액별 카드발급 기능
	public void cardRanking(Money_ver2 users) {
		if(users.getUser_won()>=25000) { users.setRanking("gold"); }
		else if(users.getUser_won()>=15000) { users.setRanking("silver"); }
		else{users.setRanking("green");}
	}
	public void cardRanking(Money_ver2[] users) {
		for(int i=0; i<users.length; i++) {
			if(users[i].getUser_won()>=25000) { users[i].setRanking("gold"); }
			else if(users[i].getUser_won()>=15000) { users[i].setRanking("silver"); }
			else{users[i].setRanking("green");}
		}
	}
	public MoneyCard() { super(); }	
	// 고객님 금액이 25000원이면 gold
	// 고객님 금액이 15000원이면 silver
	// 고객님 금액이 기본이면 green
}
