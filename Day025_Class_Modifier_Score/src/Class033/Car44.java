package Class033;

public class Car44{
	//멤버변수
	private String color; //색상
	private String gearType; //변속기 종류 - auto, manual
	private int door; //문의 개수
	@Override
	public String toString() { return "Car4 [color=" + color + ", gearType=" + gearType + ", door=" + door + "]"; }
	
	public String getColor() { return color; }

	public void setColor(String color) { this.color = color; }

	public String getGearType() { return gearType; }

	public void setGearType(String gearType) { this.gearType = gearType; }

	public int getDoor() { return door; }

	public void setDoor(int door) { this.door = door; }

	Car44(){}

	public Car44(String color, String gearType, int door) {
		this.color = color; this.gearType=gearType; this.door=door;
	
	}
}