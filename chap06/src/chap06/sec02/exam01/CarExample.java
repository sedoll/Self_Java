package chap06.sec02.exam01;

public class CarExample {

	public static void main(String[] args) { 
		
		Car myCar = new Car(); //Car 클래스를 외부에서 이용하기위해 객체를 생성한다.
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed + "km");
		System.out.println("현재속도: " + myCar.speed + "km");
		
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed + "km");
	}

}
