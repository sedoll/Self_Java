package test04.exam02;

import java.util.*;

public class Test07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int money = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("\n----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			balance = sc.nextInt();
			switch(balance) {
				case 1:
					System.out.print("예금: ");
					money += sc.nextInt();
					break;
					
				case 2:
					System.out.print("출금: ");
					money -= sc.nextInt();
					break;
					
				case 3:
					System.out.println("잔고: " + money);
					break;
					
				case 4:
					run = false;
					break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
