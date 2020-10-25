package day21;
class TV001{
	String channel;
	int volume;
	
	public void show() {
		System.out.println("===== TV\r\nTV채널 : "+ channel + "\rTV볼륨 : " + volume); }
}
public class Class004 {
	public static void main(String[] args) {
		TV001 show = new TV001();
		show.channel = "JTBC";
		show.volume = 5;
		show.show();
		
		/*
		 1. TV001이라는 클래스 작성
		 //1. 멤버변수
		 채널: channel
		 볼륨: volume
		 //2. 멤버함수
		 void show() - 채널과 볼륨 출력
		 
		 ㅁ 출력내용
		 			===== TV
		 			TV채널 : JTBC
		 			TV볼륨 : 5
		 */
	}
}
