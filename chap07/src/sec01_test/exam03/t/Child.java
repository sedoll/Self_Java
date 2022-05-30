package sec01_test.exam03.t;

public class Child extends Parents{
	public static final int P = 1; // 일반 비행모드
	public static final int C = 2; // 슈퍼 비행모드
	
	public int mode = C; // 비행모드 저장 변수, 초기값 일반모드
	
	@Override
	public void str() {
		if(mode == C) {
			System.out.println("Child");
		} else {
			super.str();
		}
	}
}
