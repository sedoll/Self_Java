package bank;

import java.util.*;

public class Bank {

	public static void main(String[] args) {
		// 유저 3명 선언
		int acLength = 3;
		Account[] ac = new Account[acLength];
		ac[0] = new Account("홍길동", 123123, 1234);
		ac[1] = new Account("일지매", 456456, 5678);
		ac[2] = new Account("강감찬", 789789, 9012);

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		String cashId;
		String pwd;

		while (run) {
			println("------------------------------------------");
			println("| 1.입금 | 2.출금 | 3.잔액조회 | 4.이체 | 5.종료 |");
			println("------------------------------------------");
			int select = Integer.parseInt(sc.nextLine());
			switch (select) {
			
			case 1:
				println("입금");
				print("계좌 번호를 입력하세요. >");
				cashId = sc.nextLine(); // 계좌번호 입력
					if (intCheck(cashId)) { // 계좌번호가 숫자인지 확인
						for (int i = 0; i < acLength; i++) { // for문으로 만들어진 계좌번호 비교
							if (Integer.parseInt(cashId) == ac[i].getIdCheck()) { //계좌번호가 일치할 경우
								ac[i].nameIdPrint(); // 계좌 번호, 이름 출력
								println("계좌번호가 확인되었습니다.");
								print("입금액을 입력하세요 > ");
								int money = Integer.parseInt(sc.nextLine());
								ac[i].setSumMoney(money);
								println("입금되었습니다. \n남은잔액" + ac[i].getMoney());
							}
						}
					} else {
						println("계좌 번호가 잘 못 되었습니다. \n계좌 번호는 숫자로 이루어져 있습니다.");
					}
				break;
				
			case 2:
				println("출금");
				print("계좌 번호를 입력하세요. >");
				cashId = sc.nextLine(); // 계좌번호 입력
				print("비밀 번호를 입력하세요. >");
				pwd = sc.nextLine(); // 비밀번호 입력
				if (intCheck(cashId)) {
					for (int i = 0; i < acLength; i++) {
						// 계좌번호와 비밀번호가 일치할 경우
						if (Integer.parseInt(cashId) == ac[i].getIdCheck() && Integer.parseInt(pwd) == ac[i].getPwdCheck()) {
							ac[i].nameIdPrint();
							println("계좌번호가 확인되었습니다.");
							while(true) {
								print("출금액을 입력하세요 > ");
								int money = Integer.parseInt(sc.nextLine());
								if(0 > ac[i].getMoney() - money) { //남은 잔액이 출금액 보다 작은 경우
									println("잔액이 부족합니다.");
									println("출금을 취소하시겠습니까? | 1. yes | 2. no |");
									int result = Integer.parseInt(sc.nextLine());
									if(result == 1) { // yes를 선택 할 경우 초기 화면으로 돌아감
										break;
									}
								} else { //남은 잔액이 출금액 보다 큰 경우
									ac[i].setSubMoney(money);
									println("출금되었습니다. \n남은잔액" + ac[i].getMoney());
									break;
								}
							}
						}
					}
				} else {
					println("계좌 번호가 잘 못 되었습니다. \n계좌 번호는 숫자로 이루어져 있습니다.");
				}
				break;
				
			case 3:
				println("잔액조회");
				print("계좌 번호를 입력하세요. >");
				cashId = sc.nextLine(); // 계좌번호 입력
				print("비밀 번호를 입력하세요. >");
				pwd = sc.nextLine(); // 비밀번호 입력
				if (intCheck(cashId)) {
					for (int i = 0; i < acLength; i++) {
						// 계좌번호와 비밀번호가 일치할 경우
						if (Integer.parseInt(cashId) == ac[i].getIdCheck() && Integer.parseInt(pwd) == ac[i].getPwdCheck()) {
							ac[i].nameIdPrint();
							println("계좌번호가 확인되었습니다.");
							println("남은잔액: " + ac[i].getMoney());
						}
					}
				} else {
					println("계좌 번호가 잘 못 되었습니다. \n계좌 번호는 숫자로 이루어져 있습니다.");
				}
				break;
				
			case 4:
				println("이체");
				break;
				
			case 5:
				println("종료");
				run = false;
				break;
				
			default:
				println("잘못 된 선택 입니다.");
				break;
			}
		}

	}

	public static void println(String str) { // \n print 출력
		System.out.println(str);
	}

	public static void print(String str) { // \n 안한 print 출력
		System.out.print(str);
	}

	public static boolean intCheck(String num) { // 입력된 것이 숫자로 이루어 졌는지 판별하는 메소드
		for (int i = 0; i < num.length(); i++) {
			if (!Character.isDigit(num.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
