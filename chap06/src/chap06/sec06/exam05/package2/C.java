package chap06.sec06.exam05.package2;
import chap06.sec06.exam05.package1.A;

public class C {
	//持失切
	public C() {
		A a = new A();
		a.field = 10;
		a.method();
	}
	
	//五社球
	public void method() {
		A a = new A();
		a.field = 10;
		a.method();
	}
}
