package chap06.sec04.exam05;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.keyTurnOn();
		myCar.run();
		int result = myCar.getSpeed();
		System.out.printf("현재 속도 %d km/h\n", result);
	}

}
