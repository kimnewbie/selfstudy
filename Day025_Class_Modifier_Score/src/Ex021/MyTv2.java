package Ex021;

public class MyTv2 {
	private boolean isPoweron;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 100;
	public boolean isPoweron() {
		return isPoweron;
	}
	public void setPoweron(boolean isPoweron) {
		this.isPoweron = isPoweron;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getMAX_VOLUME() {
		return MAX_VOLUME;
	}
	public int getMIN_VOLUME() {
		return MIN_VOLUME;
	}
	public int getMAX_CHANNEL() {
		return MAX_CHANNEL;
	}
	public int getMIN_CHANNEL() {
		return MIN_CHANNEL;
	}
}
