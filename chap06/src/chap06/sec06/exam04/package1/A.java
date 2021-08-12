package chap06.sec06.exam04.package1;

public class A {
	//필드
	A field = new A();
	
	//생성자
	public A() {} //패키지와 상관없이 호출 가능
	//public이면 B, C 사용가능
	//default이면 B가능 C불가
	//private이면 B, C 둘다 불가능
}
