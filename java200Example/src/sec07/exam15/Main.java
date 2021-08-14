package sec07.exam15;

import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		SumOf sum = new SumOf();
		Main in = new Main();
		int x;
		int y;
	
		do {
		System.out.print("몇개의 배열을 만들겠습니까?: ");
		x = in.sc.nextInt();
		sum.sumOf(x);
		
		System.out.printf("종료하겠습니까? 1.예 | 2. 아니오");
		y = in.sc.nextInt();
		
		} while(y != 1);
		System.out.println("프로그램이 종료되었습니다.");
	}

}