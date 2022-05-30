package sec02.exam03;

public class Car {
	// 필드
	Tire frontL = new Tire("frontL", 6);
	Tire frontR = new Tire("frontR", 2);
	Tire backL = new Tire("backL", 3);
	Tire backR = new Tire("backR", 4);
	
	// 메소드
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontL.roll()==false) {stop(); return 1; };
		if(frontR.roll()==false) {stop(); return 2; };
		if(backL.roll()==false) {stop(); return 3; };
		if(backR.roll()==false) {stop(); return 4; };
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
