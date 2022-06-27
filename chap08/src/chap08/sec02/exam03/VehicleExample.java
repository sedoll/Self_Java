package chap08.sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle v = new Bus();
		v.run();
		
		Bus bus = (Bus) v; // 강제 타입 변환, Bus에 있는 것들을 모두 사용 가능
		bus.checkFare();
		

	}

}
