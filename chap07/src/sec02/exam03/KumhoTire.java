package sec02.exam03;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		if(++accumulatedRotation<maxRotation) {
			System.out.println(location + " 금호Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " 금호Tire 펑크 ***");
			return false;
		}
	}
}
