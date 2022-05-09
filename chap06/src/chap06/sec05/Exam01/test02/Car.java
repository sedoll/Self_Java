package chap06.sec05.Exam01.test02;

public class Car {
	// 인스턴스 필드
	String model;
	int speed;
	
	// 인스턴스 생성자
	Car(String model) {
		this.model = model;
	}
	
	// 인스턴스 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			setSpeed(i);
			System.out.println(this.model + " " + this.speed);
		}
	}
}
