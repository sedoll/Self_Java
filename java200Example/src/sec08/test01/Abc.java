package sec08.test01;

public class Abc {
	private int a;
	private int b;
	private int c;
	
	Abc(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	int getSum() {
		return a + b + c;
	}
	
	void print() {
		System.out.printf("(%d + %d + %d)\n", a, b, c);
	}
}
