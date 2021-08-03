package chap06.sec04.exam03;

public class TestCar {
	//필드 선언
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas <= 0) {
			System.out.println("기름이 없습니다.");
			return false;
		}
		System.out.println("기름이 있습니다.");
		return true;
	}
	
	void run() {
		if(gas > 0) {
			System.out.printf("차가 달립니다. 기름잔량 %d(L)\n\n", gas);
			gas--;
		} else {
			System.out.printf("차가 멈춥니다. 기름잔량 %d(L)\n\n", gas);
			return;
		}
	}
	
}
