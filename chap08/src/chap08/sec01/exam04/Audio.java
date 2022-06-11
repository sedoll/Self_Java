package chap08.sec01.exam04;

public class Audio implements RemoteControl{ // 인터페이스를 사용하는 구현 클래스
	private int volume; // 필드
	
	@Override // 추상 메서드 재정의
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override // 추상 메서드 재정의
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
	}

	@Override // 추상 메서드 재정의
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨: " + this.volume);
	}
	
}
