package test2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 2.출금 3.잔액조회 4.종료");
			System.out.println("--------------------------");
			String select = sc.nextLine();
			
			if(select.equals("1")) {
				System.out.print("예금할 금액을 입력하세요. \n금액: ");
				String str = sc.nextLine();
				int money = Integer.parseInt(str);
				balance += money;
			} else if (select.equals("2")) {
				System.out.print("출금할 금액을 입력하세요. \n금액: ");
				String str = sc.nextLine();
				int money = Integer.parseInt(str);
				if(balance < money) {
					System.out.println("현재 남아 있는 금액보다 초과 되므로 \n출금을 할 수 없습니다.");
				} else {
					balance -= money;
				}
			} else if (select.equals("3")) {
				System.out.printf("남은 잔액: %d", balance);
			} else if (select.equals("4")) {
				System.out.println("시스템을 종료합니다.");
				run = false;
			} else {
				System.out.println("잘못 된 접근입니다.");
			}
			System.out.println();
		}

	}

}
