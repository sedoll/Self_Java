package chap06.sec05.Exam02.Test02;

public class CalculatorExample {

	public static void main(String[] args) {
		
		double result1 = 10 * 10 * Calculator.PI;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.printf("%.2f\n", result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
