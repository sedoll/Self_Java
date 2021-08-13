package sec07.exam08;

import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int selct;
		
		do {
			int rand = (int) (Math.random()*4+1);
			
			Example.example(rand);
			
			System.out.printf("다시 하겠습니까? 1.예 | 2. 아니오: ");
			selct = sc.nextInt();
			
		} while(selct == 1);
		System.out.println("프로그램을 종료합니다.");

	}

}
