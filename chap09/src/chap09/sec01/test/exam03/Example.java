package chap09.sec01.test.exam03;

public class Example {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire(); // 인스턴스
		Car.Engine engine = new Car.Engine(); // 정적

	}

}
