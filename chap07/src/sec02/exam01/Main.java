// 클래스 자동타입변환

package sec02.exam01;

public class Main {

	public static void main(String[] args) {
		// 가능
		A a1 = new B();
		System.out.println();
		A a2 = new C();
		System.out.println();
		A a3 = new D();
		System.out.println();
		A a4 = new E();
		System.out.println();
		
		B b1 = new D();
		System.out.println();
		C c1 = new E();
		System.out.println();
		
		// 불가
//		B b2 = new E();
//		C c2 = new D();

	}

}
