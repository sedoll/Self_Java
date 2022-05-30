package banking2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BankApp {
	private static Account[] accountArray = new Account[100]; // 100개의 사용자 생성을 위한 배열크기 서언
	private static Scanner sc = new Scanner(System.in); // 입력
	private static final String PREFIX = "111-"; // 은행계좌 앞자리
	private static int seq = 0;// 계좌번호 자동발번
	private static boolean isCreated = false;// 계좌등록여부

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.잔액조회|4.예금|5.출금|6.송금|7.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			int selectNo = sc.nextInt();
			switch (selectNo) {
			case 1: createAccount(); break;
			case 2: accountList(); break;
			case 3: balance(); break;
			case 4: deposit(); break;
			case 5: withdraw(); break;
			case 6: trans(); break;
			case 7: run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 출금
	private static void withdraw() {
		if (!isRegistered()) {
			System.out.println("먼저 계좌등록을 하세요");
			return;// 메소드 실행 종료.
		}
		// 계좌번호 출력
		accountList();
		// 출금(잔액<출금액)
		Account account;
		while (true) {
			System.out.println("출금할 계좌번호 입력>");
			String ano = sc.next();// 출금 계좌번호 입력
			System.out.println("비밀번호 입력>");
			int pw = sc.nextInt();
			account = findAccount(ano);// 입력받은 정보로 계좌조회
			if (account.getPw() == pw) // 비밀번호가 일치하는지 확인
				break;// 반복문 빠져나가기
			else
				System.out.println("계좌번호 또는 비밀번호가 일치하지 않습니다.");
		}
		// 출금처리
		System.out.print("출금할 금액을 입력하세요>");
		int amount = sc.nextInt();
		int result;
		try {
			result = account.withdraw(amount);// 잔액 >출금액보다 큰 경우
			System.out.println("출금액:" + result);
			System.out.println(account.getOwner() + " 님의 업무가 처리되었습니다. \n이용해 주셔서 감사합니다.");
		} catch (Exception e) {// 잔액 <출금액보다 작은경우
			System.out.println(e.getMessage());
		}
	}

	// 예금
	private static void deposit() {
		if (!isRegistered()) {// if(!isCreated)
			System.out.println("먼저 계좌등록을 하세요");
			return;// return;-더이상 진행을 하지 않고 메소드 호출한곳으로 되돌아감.
		}
		System.out.println("입금할 계좌번호를 선택하세요>");
		Account account;
		while (true) {
			String ano = sc.next();// 계좌번호 입력
			account = findAccount(ano);// 입력된 값으로 계좌배열에서 해당하는 계좌정보를 찾아서 리턴받음
			if (account == null)// 해당하는 계좌가 없으면
				System.out.println("계좌번호를 확인하세요>");
			else
				break; // 계속 입력받다가 계좌번호가 맞아서 계좌정보를 얻어오면
		}
		System.out.print("입금할 금액을 입력하세요>");
		int amount = sc.nextInt();
		account.deposit(amount);// 입금 처리
		System.out.println("예금 성공");
		System.out.println(account.getOwner() + " 님의 업무가 처리되었습니다. \n이용해 주셔서 감사합니다.");
	}
	
	// 계좌목록
	private static void accountList() {
		if (!isRegistered()) {// if(!isCreated)
			System.out.println("먼저 계좌등록을 하세요");
			return;// return;-더이상 진행을 하지 않고 메소드 호출한곳으로 되돌아감.
		}
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) { // 계좌번호, 이름
				System.out.println(accountArray[i].getAno() + " " + accountArray[i].getOwner());
			}
		}
	}
	
	// 잔액조회
	private static void balance() {
		Account account;
		while (true) {
			System.out.println("잔액조회할 계좌번호 입력>");
			String ano = sc.next();// 계좌번호 입력
			System.out.println("비밀번호 입력>");
			int pw = sc.nextInt();
			account = findAccount(ano);// 입력받은 정보로 계좌조회
			if (account.getPw() == pw) // 비밀번호가 일치하는지 확인
				break;// 반복문 빠져나가기
			else
				System.out.println("계좌번호 또는 비밀번호가 일치하지 않습니다.");
		}
		System.out.println(account.getOwner() + " 님의 잔액: " + account.getBalance() + " 원");
		System.out.println(account.getOwner() + " 님의 업무가 처리되었습니다. \n이용해 주셔서 감사합니다.");
	}

	// 송금
	private static void trans() {
		if (!isRegistered()) {// if(!isCreated)
			System.out.println("먼저 계좌등록을 하세요");
			return;// return;-더이상 진행을 하지 않고 메소드 호출한곳으로 되돌아감.
		}
		// 입금
		Account account1; // 사용할 계좌
		Account account2; // 송금 보낼 계좌
		while (true) {
			System.out.println("사용할 계좌번호를 입력하세요>");
			String ano = sc.next();// 계좌번호 입력
			System.out.println("비밀번호를 입력하세요>");
			int pw = sc.nextInt();// 비밀번호 입력
			account1 = findAccount(ano);// 입력된 값으로 계좌배열에서 해당하는 계좌정보를 찾아서 리턴받음
			if (account1.getPw() == pw) { // 비밀번호가 일치하는지 확인
				System.out.println("송금 보낼 상대방의 계좌번호를 입력하세요>");
				String ano2 = sc.next();// 계좌번호 입력
				account2 = findAccount(ano2);// 입력된 값으로 계좌배열에서 해당하는 계좌정보를 찾아서 리턴받음
				if (account2 == null) {
					System.out.println("계좌번호를 확인하세요>");
				} else if (account1 == account2) { // 자신의 계좌와 상대방의 계좌 번호가 같을 경우
					System.out.println("자신의 계좌로는 송금할 수 없습니다.");
				} else {
					break;// 계속 입력받다가 계좌번호가 맞아서 계좌정보를 얻어오면
				}
			} else {
				System.out.println("계좌번호 또는 비밀번호가 일치하지 않습니다.");
			}
		} // 반복문을 빠져나감.

		System.out.print("송금할 금액을 입력하세요>");
		int amount = sc.nextInt();
		int result;
		try {
			result = account1.withdraw(amount);// 잔액 >출금액보다 큰 경우
			System.out.println("출금액:" + result);
		} catch (Exception e) {// 잔액 <출금액보다 작은경우
			System.out.println(e.getMessage());
		}
		account2.deposit(amount);// 송금 처리
		System.out.println("송금 성공");
		System.out.println(account1.getOwner() + " 님의 업무가 처리되었습니다. \n이용해 주셔서 감사합니다.");
	}

	private static void createAccount() {
		// 계좌번호, 이름, 비밀번호, 금액
		System.out.println("계좌생성");
		String ano = PREFIX + String.format(new DecimalFormat("0000").format(++seq));
		; // 계좌번호는 자동으로 생성
		System.out.print("소유주명>");
		String owner = sc.next();// 소유주 입력
		System.out.print("비밀번호>");
		int pw = sc.nextInt(); // 비밀번호 입력
		System.out.print("초기입금액>");
		int amount = sc.nextInt();// 초기입금액 입력
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, pw, amount);
				System.out.println("계좌 등록 성공");
				isCreated = true;
				// isCreated변수는 static이라서 최종값을 가지고있음
				break;
			}
		}
	}

	// 계좌등록 여부 확인
	private static boolean isRegistered() {
		return isCreated;// 최종상태값을 리턴
		// 초기값은 false이고, 계좌를 등록하면 true
	}

	// 입력된 계좌번호로 계좌정보 조회
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null)
				if (accountArray[i].getAno().equals(ano)) {
					// 문자열의 내용비교: 문자열1.equals(문자열2)
					account = accountArray[i];
				}
		}
		return account;
	}

}
