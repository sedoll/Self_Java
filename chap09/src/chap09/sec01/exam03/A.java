package chap09.sec01.exam03;

public class A {
	// 인스턴스 멤버
	int field1;
	void method1() {}
	
	// 정적 멤버
	static int field2;
	static void method2() {}
	
	class B { // 인스턴스, 정적 멤버 다 사용 가능
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C { // 정적 멤버만 사용 가능
		void method() {
			// 인스턴스 멤버를 사용하려면 이렇게 사용해야 됨
//			A a = new A();
//			a.field1 = 20;
//			a.method1();
			
			//인스턴스 멤버
//			field1 = 20;
//			method1();
			
			// 정적 멤버
			field2 = 20;
			method2();
		}
	}
}
