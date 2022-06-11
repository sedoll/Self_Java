package chap08.sec01.exam04;

public interface RemoteControl { // 인터페이스
	//상수
	/*public static final 인터페이스에서는 이걸 안작성 해줘도 됨 */
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	/*public abstract 가 생략 되있음*/
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
