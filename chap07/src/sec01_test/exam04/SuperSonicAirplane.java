package sec01_test.exam04;

public class SuperSonicAirplane extends AirPlane{
	public static final int NORMAL = 1; // 일반 비행모드
	public static final int SUPERSONIC = 2; // 슈퍼 비행모드
	
	public int flyMode = NORMAL; // 비행모드 저장 변수, 초기값 일반모드
	
	// ctrl + space 하고 고르고 엔터 누르면 오버라이딩이 자동으로 생성
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly(); // 부모에 있는 fly 메소드 호출
		}
	}
	
}
