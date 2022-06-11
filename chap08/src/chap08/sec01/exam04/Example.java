package chap08.sec01.exam04;

public class Example { // 실행 클래스

	public static void main(String[] args) {
		// 다형성을 통해 구현 클래스의 메서드 호출
		
		RemoteControl rc = new Television(); // 다형성
		// Television 클래스에서 재정의한 메서드 사용
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println();
		
		RemoteControl rc2 = new Audio(); // 다형성
		// Audio 클래스에서 재정의한 메서드 사용
		rc2.turnOn();
		rc2.setVolume(6);
		rc2.turnOff();

	}

}
