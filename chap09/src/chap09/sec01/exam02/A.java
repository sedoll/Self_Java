package chap09.sec01.exam02;

public class A {
	
	// 인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	void method1() { // 인스턴스 메서드
		B var1 = new B();
		C var2 = new C();
	}
	
	// 정적 필드
	// static B field3 = new B(); // 인스턴스 멤버 클래스이기에 정적으로 사용 불가
	static C field4 = new C(); // 정적 멤버 클래스이기에 정적으로 사용가능
	
	static void method2() { // A 객체가 없이도 사용할 수 있는 메서드
		// B var1 = new B(); // A 객체가 있어야 사용할 수있는 객체선언
		C var2 = new C(); // C는 A가 없어도 사용이 가능하기에 가능
	}
	
	class B {} // 인스턴스 멤버 클래스
	static class C {} // 정적 멤버 클래스
	
}
