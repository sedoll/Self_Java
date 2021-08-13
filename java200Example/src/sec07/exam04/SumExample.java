package sec07.exam04;

import java.util.Scanner;

public class SumExample {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 몇까지 더할까요?: ");
		int x = sc.nextInt();
		
		long result = Sum.sum(x);
		System.out.printf("모든 수의 합: %d", result);

	}

}
