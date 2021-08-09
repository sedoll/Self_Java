package chap06.sec05.Exam03.Test01;

public class Car {
	//인스턴스 멤버, 필드 선언
	int speed;
	
	//인스턴스 멤버, 생성자
	Car(int speed){
		this.speed = speed;
	}
	
	//인스턴스 멤버, 메소드
	void run(){
		System.out.printf("%d의 속도로 달립니다.", speed);
	}

	public static void main(String[] args) { //정적 멤버
		Car myCar = new Car(50); //정적 멤버 내에서는 인스턴스 멤버를 그냥 사용 할 수 없으므로 객체를 생성하고 난 후 사용한다.
		myCar.run();

	}

}
