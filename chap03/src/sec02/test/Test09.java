package sec02.test;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		String stringNumber1 = scanner.nextLine();
		System.out.print("두 번째 수: ");
		String stringNumber2 = scanner.nextLine();
		
		double doubleNumber1 = Double.parseDouble(stringNumber1);
		double doubleNumber2 = Double.parseDouble(stringNumber2);
		
		if(doubleNumber2 == 0.0) { //분모에 해당하는 숫자가 0일때
			System.out.println("무한대 입니다.");
		}
		
		else {
			double result = doubleNumber1 / doubleNumber2; //0이 아닐때는 결과를 출력
			System.out.printf("결과: %.2f", result);
		}

	}

}
