package calcul;

public class Cal {
	static private double result;
	
	static void add(double x, double y) {
		result = x + y;
	}
	
	static void sub(double x, double y) {
		result = x - y;
	}
	
	static void mul(double x, double y) {
		result = x * y;
	}
	
	static void div(double x, double y) {
		result = x / y;
	}
	
	static void reset() {
		result = 0;
	}
	
	static void print() {
		System.out.println("°ª " + result);
	}
}
