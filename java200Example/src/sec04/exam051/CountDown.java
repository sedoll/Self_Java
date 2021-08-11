package sec04.exam051;

import java.util.*;

public class CountDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.: ");
		int x = sc.nextInt();
		
		if(x>0) {
			do {
				System.out.printf("카운트 다운: %d\n", x--);
			} while(x >= 0);
		}
		System.out.printf("프로그램이 종료 되었습니다. 카운트 다운: %d\n", x); 
	}

}
