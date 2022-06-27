package chap09.sec01.exam01;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B(); // 중첩클래스, 인스턴스 멤버 클래스 객체 생성
		b.field1 = 3;
		b.method1();
		
		// 객체를 생성하여 호출
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		
		// 객체생성 없이 이름으로 바로 호출
		A.C.field2 = 3;
		A.C.method2();
		
		a.method();
	}

}
