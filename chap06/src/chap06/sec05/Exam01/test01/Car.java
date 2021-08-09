package chap06.sec05.Exam01.test01;
//인스턴스 멤버
public class Car {
	//필드
	String model;
	int speed;
	int startSpeed;
	
	//생성자
	Car(String model, int startSpeed) {
		this.model = model;
		this.startSpeed = startSpeed;
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int j=startSpeed; j<=startSpeed+50; j+=10) {
			this.setSpeed(j);
			System.out.printf("%s가 달립니다. 시속: %d km/h\n", model, speed);
		}
	}
}
