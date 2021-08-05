package chap06.sec05.Exam01;

public class Car {
	//필드
	String model; //인스턴스 필드
	int speed;
	
	//생성자
	Car(String model) {
		this.model = model;
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i); //여기서 this는 써도 되고 안써도 됨
			System.out.println(this.model + "가 달립니다. (시속: " + this.speed + "km/h)");
			//여기에서는 this를 붙혀도 안 붙혀도 됨, 같은 이름의 매개변수가 없기 때문에
		}
	}
}
