package sec02.exam04;

public class Driver {
	// 매개변수의 다형성
	// Vehicle 뿐만 아니라 Vehicle의 모든 자식 클래스가 올 수 있음
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
