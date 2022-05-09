package chap06.sec05.Exam04.test02;

public class Singleton {
	private static Singleton sgt = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() { // 여기서 Singleton 는 리턴 타입이다.
		return sgt; // 객체의 번지 리턴
	}
}
