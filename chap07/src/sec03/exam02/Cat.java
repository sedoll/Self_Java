package sec03.exam02;

public class Cat extends Animal{
	public Cat() {
		kind = "포유류"; // 추상 클래스 필드 사용
	}
	
	@Override // 추상클래스 메서드 재정의
	public void sound() {
		System.out.println("야옹");
	}
}
