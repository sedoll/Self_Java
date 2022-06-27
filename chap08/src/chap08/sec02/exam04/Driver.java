package chap08.sec02.exam04;

public class Driver {
	public void drive(Vehicle v) { // bus or taxi 객체가 들어옴
		if(v instanceof Bus) { // 객체가 버스 인지 택시인제 확인
			Bus bus = (Bus) v;
			bus.checkFare();
		} else {
			Taxi taxi = (Taxi) v;
			taxi.checkFare();
		}
		v.run(); // 대입된 구현 객체의 run 메서드가 실행ㄴ
	} 
}
