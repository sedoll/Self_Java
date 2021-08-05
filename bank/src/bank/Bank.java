package bank;

import java.util.*;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.계정생성 | 2.종료");
			System.out.print("선택> ");
			int selct = sc.nextInt();
			
			switch(selct) {
				case 1:
					sc.nextLine();
					System.out.print("아이디를 입력하세요.> ");
					String id = sc.nextLine();
					sc.nextLine();
					System.out.print("비밀번호를 입력하세요.> ");
					String pw = sc.nextLine();
					
					boolean check = acc.account(id, pw); 
					if(check) {
						System.out.println("새로운 계정이 생성되었습니다.");
					} else {
						System.out.println("이미 있는 아이디입니다. 다시 입력해주십시오.");
					}
					break;
				case 2:
					System.out.println("종료합니다.");
					run = false;
					break;
				default:
			}
		}

	}

}
