package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
		System.out.println();
		// 부모 타입으로 자동 타입 변환 이후에는 부모 클래스에 선언된 필드 및 메소드만 접근 가능
		// 예외적으로 메소드가 자식 클래스에서 재정의될 경우 자식 클래스의 메소드가 대시 호출
		Parent p = c;
		p.m1(); // 부모클래스 호출
		p.m2(); // 메소드 오버라이딩으로 인한 자식클래스 호출
//		p.m3(); // 부모 클래스에 없는 메소드 이므로 사용 불가
	}

}
