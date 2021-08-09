package chap06.sec05.Exam01.test01;
//인스턴스 멤버
public class CarExample {

	public static void main(String[] args) {
		Car myCar1 = new Car("람보르기니", 200);
		Car myCar2 = new Car("카마로", 80);
		Car myCar3 = new Car("쏘나타", 30);
		
		myCar1.run();
		System.out.println();
		
		myCar2.run();
		System.out.println();
		
		myCar3.run();
		System.out.println();

	}

}
