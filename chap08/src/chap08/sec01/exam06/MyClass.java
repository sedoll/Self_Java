package chap08.sec01.exam06;

public class MyClass {
	//필드
	RemoteControl rc = new Television(); // 기본값을 TV 구현클래스로 초기화
	
	//생성자
	MyClass() {
		
	}
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메서드
	void methodA() { // 오디오 구현 클래스 사용
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
