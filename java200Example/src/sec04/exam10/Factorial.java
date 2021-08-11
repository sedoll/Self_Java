package sec04.exam10;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		long result = 1;
		for(int i=1; i<=x; i++) {
			result *= i;
		}
		System.out.printf("%d!의 값은 %d 입니다.\n", x, result);
		
	}

}
