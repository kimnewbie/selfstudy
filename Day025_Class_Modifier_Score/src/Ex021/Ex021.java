package Ex021;

public class Ex021 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel()); // CH:10
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume()); //VOL:20
	}
}
/*
Q MyTv2 isPowerOn, channel, volume 클래스의 멤버변수를 클래스
[외부에서 접근할 수 없도록 제어자]를 붙이고 대신 이 멤버변수들의 값을 어디서나
읽고 변경할 수 있도록 getter setter를 추가하시오.

ㅁ 주어진옵션
class MyTv2{
	private boolean isPoweron;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 100;
}
class EX021_getter_setter{
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel()); // CH:10
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume()); //VOL:20
ㅁ 출력된 화면
CH:10
VOL:20
*/
