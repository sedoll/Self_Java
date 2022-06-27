package chap09.sec01.exam01;

public class A {
	
	int field4;
	A() { // 생성자
		System.out.println("A 객체가 생성됨");
	}
	
	class B { // 인스턴스 멤버 클래스 / 정적필드, 정적메서드는 사용 불가
		B() {
			System.out.println("B 객체가 생성됨");
		}
		int field1; // 인스턴스 필드
		// static int field2; 정적이라 사용 불가
		void method1() {} // 인스턴스 메서드
		// static void method2() {} 정적이라 사용 불가
	}
	
	static class C { // 정적 멤버 클래스 / 인스턴스, 정적 둘다 사용 가능
		C() {
			System.out.println("C 객체가 생성됨");
		}
		int field1; // 인스턴스 필드
		static int field2; // 정적 필드
		void method1() {} // 인스턴스 메서드
		static void method2() {} // 정적 메서드
	}
	
	void method() { // 메서드 내에 선언된 중첩클래스, 로컬클래스
		class D { // 로컬 클래스 / 인스턴스 필드와 메서드만 선언 가능
			D() { // 생성자
				System.out.println("D 객체가 생성됨");
			}
			int field1; // 인스턴스 필드
			// static int field2; 정적 필드라 사용 불가
			void method1() {} // 인스턴스 메서드
			// static void method2{} 정적 메서드라 사용 불가 
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
