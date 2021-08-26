package sec01.exam06;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	//stop은 final이 붙어 있으므로 상속 불가
}
