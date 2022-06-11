package chap08.sec01.exam05;

public class Example {

	public static void main(String[] args) {
		SmartTv tv = new SmartTv();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		Searchable sa = tv;
		sa.search("³×ÀÌ¹ö");

	}

}
