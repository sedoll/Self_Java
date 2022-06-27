package chap08.sec02.exam05;

public class Example {

	public static void main(String[] args) {
		ImplementationC imp = new ImplementationC();
		
		InterfaceA ia = imp; // A만 가능
		ia.methodA();
		
		InterfaceB ib = imp; // B만 가능
		ib.methodB();
		
		InterfaceC ic = imp; // ABC 다 가능, 인터페이스 두 개를 상속하기 때문에
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
