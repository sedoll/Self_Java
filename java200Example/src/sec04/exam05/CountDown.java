package sec04.exam05;

import java.util.*;

public class CountDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		do {
			System.out.printf("카운트다운: %d", x);
		} while(x >= 0);
		
		System.out.printf("카운트 다운이 종료되었습니다. 카운트다운: %d", x);

	}

}
