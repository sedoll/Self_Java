package chap08.sec01.exam06;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("1)--------------------------");
		
		// 처음에는 TV 구현 클래스로 초기화 되있기에 TV 구현 클래스의 재정의된 메서드 사용
		MyClass mc1 = new MyClass();
		mc1.rc.turnOn();
		mc1.rc.setVolume(5);
		
		System.out.println("2)--------------------------");
		
		// 오디오 구현 클래스로 초기화
		MyClass mc2 = new MyClass(new Audio());
		
		System.out.println("3)--------------------------");
		
		// TV 구현 클래스로 초기화
		MyClass mc3 = new MyClass();
		// 오디오 구현 클래스의 재정의 된 메서드 사용
		mc3.methodA();
		
		System.out.println("4)--------------------------");
		
		// TV 구현 클래스로 초기화
		MyClass mc4 = new MyClass();
		// TV 구현 클래스의 재정의 된 메서드 사용
		mc4.methodB(new Television());
	}

}
