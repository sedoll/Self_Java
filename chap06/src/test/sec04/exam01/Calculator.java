package test.sec04.exam01;

public class Calculator {
	//필드
	//생성자
	//메소드
	int plus(int x, int  y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int  y) {
		int result = plus(x, y) / 2; //plus() 메소드 호출
		return result; 
	}
	
	void execute() {
		double result = avg(7, 10); //avg() 메소드 호출
		println("출력: "+result); //println() 메소드 호출
	}
	
	void println(String result) {
		System.out.println(result);
	}
}
