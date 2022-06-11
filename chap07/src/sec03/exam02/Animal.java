package sec03.exam02;

public abstract class Animal { // 추상클래스
	// 필드
	public String kind; // 동물의 정보
	
	// 메서드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메서드
	// Animal 클래스를 상속하는 모든 자식 클래스들은 무조건 이 메서드를 재정의 해서 사용해야 한다.
	public abstract void sound();
}
