package chap06.sec05.Exam03.test02;

public class Car {
	int speed;
	
	void run() { // 동적 메소드, 인스턴스 멤버 메소드
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void run(int i) { // 정적 메소드, 정적 멤버 메소드
		Car myCar = new Car();
		myCar.speed = i;
		System.out.println(myCar.speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		// 인스턴스 멤버 사용
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
		// 정적 멤버 사용
		run(50);

	}

}
