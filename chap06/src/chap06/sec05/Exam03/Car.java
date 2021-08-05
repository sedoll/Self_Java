package chap06.sec05.Exam03;
//정적 메소드 사용 주의
public class Car {
	//첫 번째 방법
	static int speed;
	
	static void run() {
		System.out.println(speed + " 으로 달립니다.");
	}
	
	
	//static이 붙어있으므로 main 메소드도 정적 메소드 이다.
	public static void main(String[] args) {
		speed = 60;
		run();
	}
	
	/*
	 * //두 번째 방법
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	
	//static이 붙어있으므로 main 메소드도 정적 메소드 이다.
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.speed = 60;
		myCar.run();
	}
	*/
}
