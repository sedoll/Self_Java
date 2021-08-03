package chap06.sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) { //메소드가 boolean 타입의 값을 리턴하기에 조건식에 올 수 있음
			System.out.println("gas를 주입할 필요가 없습니다."); //위에다가 하면 if 또는 else 값이 나올 수 있음
		} else {
			System.out.println("gas를 주입하세요."); //밑에 있으므로 모든 실행이 다 끝난후라 여기만 실행
		}
	}

}
