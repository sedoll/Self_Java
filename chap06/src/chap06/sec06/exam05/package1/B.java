package chap06.sec06.exam05.package1;

public class B {
	//持失切
	public B() {
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
