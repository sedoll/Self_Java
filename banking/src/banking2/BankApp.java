package banking2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BankApp {
	private static Account[] accountArray = new Account[100]; // 100���� ����� ������ ���� �迭ũ�� ����
	private static Scanner sc = new Scanner(System.in); // �Է�
	private static final String PREFIX = "111-"; // ������� ���ڸ�
	private static int seq = 0;// ���¹�ȣ �ڵ��߹�
	private static boolean isCreated = false;// ���µ�Ͽ���

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.���»���|2.���¸��|3.�ܾ���ȸ|4.����|5.���|6.�۱�|7.����");
			System.out.println("-----------------------------------------------");
			System.out.print("����>");
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
		System.out.println("���α׷� ����");
	}

	// ���
	private static void withdraw() {
		if (!isRegistered()) {
			System.out.println("���� ���µ���� �ϼ���");
			return;// �޼ҵ� ���� ����.
		}
		// ���¹�ȣ ���
		accountList();
		// ���(�ܾ�<��ݾ�)
		Account account;
		while (true) {
			System.out.println("����� ���¹�ȣ �Է�>");
			String ano = sc.next();// ��� ���¹�ȣ �Է�
			System.out.println("��й�ȣ �Է�>");
			int pw = sc.nextInt();
			account = findAccount(ano);// �Է¹��� ������ ������ȸ
			if (account.getPw() == pw) // ��й�ȣ�� ��ġ�ϴ��� Ȯ��
				break;// �ݺ��� ����������
			else
				System.out.println("���¹�ȣ �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		// ���ó��
		System.out.print("����� �ݾ��� �Է��ϼ���>");
		int amount = sc.nextInt();
		int result;
		try {
			result = account.withdraw(amount);// �ܾ� >��ݾ׺��� ū ���
			System.out.println("��ݾ�:" + result);
			System.out.println(account.getOwner() + " ���� ������ ó���Ǿ����ϴ�. \n�̿��� �ּż� �����մϴ�.");
		} catch (Exception e) {// �ܾ� <��ݾ׺��� �������
			System.out.println(e.getMessage());
		}
	}

	// ����
	private static void deposit() {
		if (!isRegistered()) {// if(!isCreated)
			System.out.println("���� ���µ���� �ϼ���");
			return;// return;-���̻� ������ ���� �ʰ� �޼ҵ� ȣ���Ѱ����� �ǵ��ư�.
		}
		System.out.println("�Ա��� ���¹�ȣ�� �����ϼ���>");
		Account account;
		while (true) {
			String ano = sc.next();// ���¹�ȣ �Է�
			account = findAccount(ano);// �Էµ� ������ ���¹迭���� �ش��ϴ� ���������� ã�Ƽ� ���Ϲ���
			if (account == null)// �ش��ϴ� ���°� ������
				System.out.println("���¹�ȣ�� Ȯ���ϼ���>");
			else
				break; // ��� �Է¹޴ٰ� ���¹�ȣ�� �¾Ƽ� ���������� ������
		}
		System.out.print("�Ա��� �ݾ��� �Է��ϼ���>");
		int amount = sc.nextInt();
		account.deposit(amount);// �Ա� ó��
		System.out.println("���� ����");
		System.out.println(account.getOwner() + " ���� ������ ó���Ǿ����ϴ�. \n�̿��� �ּż� �����մϴ�.");
	}
	
	// ���¸��
	private static void accountList() {
		if (!isRegistered()) {// if(!isCreated)
			System.out.println("���� ���µ���� �ϼ���");
			return;// return;-���̻� ������ ���� �ʰ� �޼ҵ� ȣ���Ѱ����� �ǵ��ư�.
		}
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) { // ���¹�ȣ, �̸�
				System.out.println(accountArray[i].getAno() + " " + accountArray[i].getOwner());
			}
		}
	}
	
	// �ܾ���ȸ
	private static void balance() {
		Account account;
		while (true) {
			System.out.println("�ܾ���ȸ�� ���¹�ȣ �Է�>");
			String ano = sc.next();// ���¹�ȣ �Է�
			System.out.println("��й�ȣ �Է�>");
			int pw = sc.nextInt();
			try {
				account = findAccount(ano);// �Է¹��� ������ ������ȸ
				if (account.getPw() == pw) { // ��й�ȣ�� ��ġ�ϴ��� Ȯ��
					System.out.println(account.getOwner() + " ���� �ܾ�: " + account.getBalance() + " ��");
					System.out.println(account.getOwner() + " ���� ������ ó���Ǿ����ϴ�. \n�̿��� �ּż� �����մϴ�.");
					break;
				}
				else
					System.out.println("���¹�ȣ �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			} catch (Exception e) {
				System.out.println("���� ���� ��ȣ�� �������� �ʾҽ��ϴ�.");
				break;
			}
		}
	}

	// �۱�
	private static void trans() {
		if (!isRegistered()) {// if(!isCreated)
			System.out.println("���� ���µ���� �ϼ���");
			return;// return;-���̻� ������ ���� �ʰ� �޼ҵ� ȣ���Ѱ����� �ǵ��ư�.
		}
		// �Ա�
		Account account1; // ����� ����
		Account account2; // �۱� ���� ����
		while (true) {
			System.out.println("����� ���¹�ȣ�� �Է��ϼ���>");
			String ano = sc.next();// ���¹�ȣ �Է�
			System.out.println("��й�ȣ�� �Է��ϼ���>");
			int pw = sc.nextInt();// ��й�ȣ �Է�
			account1 = findAccount(ano);// �Էµ� ������ ���¹迭���� �ش��ϴ� ���������� ã�Ƽ� ���Ϲ���
			if (account1.getPw() == pw) { // ��й�ȣ�� ��ġ�ϴ��� Ȯ��
				System.out.println("�۱� ���� ������ ���¹�ȣ�� �Է��ϼ���>");
				String ano2 = sc.next();// ���¹�ȣ �Է�
				account2 = findAccount(ano2);// �Էµ� ������ ���¹迭���� �ش��ϴ� ���������� ã�Ƽ� ���Ϲ���
				if (account2 == null) {
					System.out.println("���¹�ȣ�� Ȯ���ϼ���>");
				} else if (account1 == account2) { // �ڽ��� ���¿� ������ ���� ��ȣ�� ���� ���
					System.out.println("�ڽ��� ���·δ� �۱��� �� �����ϴ�.");
				} else {
					break;// ��� �Է¹޴ٰ� ���¹�ȣ�� �¾Ƽ� ���������� ������
				}
			} else {
				System.out.println("���¹�ȣ �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} // �ݺ����� ��������.

		System.out.print("�۱��� �ݾ��� �Է��ϼ���>");
		int amount = sc.nextInt();
		int result;
		try {
			result = account1.withdraw(amount);// �ܾ� >��ݾ׺��� ū ���
			System.out.println("��ݾ�:" + result);
		} catch (Exception e) {// �ܾ� <��ݾ׺��� �������
			System.out.println(e.getMessage());
		}
		account2.deposit(amount);// �۱� ó��
		System.out.println("�۱� ����");
		System.out.println(account1.getOwner() + " ���� ������ ó���Ǿ����ϴ�. \n�̿��� �ּż� �����մϴ�.");
	}

	private static void createAccount() {
		// ���¹�ȣ, �̸�, ��й�ȣ, �ݾ�
		System.out.println("���»���");
		String ano = PREFIX + String.format(new DecimalFormat("0000").format(++seq));
		; // ���¹�ȣ�� �ڵ����� ����
		System.out.print("�����ָ�>");
		String owner = sc.next();// ������ �Է�
		System.out.print("��й�ȣ>");
		int pw = sc.nextInt(); // ��й�ȣ �Է�
		System.out.print("�ʱ��Աݾ�>");
		int amount = sc.nextInt();// �ʱ��Աݾ� �Է�
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, pw, amount);
				System.out.println("���� ��� ����");
				isCreated = true;
				// isCreated������ static�̶� �������� ����������
				break;
			}
		}
	}

	// ���µ�� ���� Ȯ��
	private static boolean isRegistered() {
		return isCreated;// �������°��� ����
		// �ʱⰪ�� false�̰�, ���¸� ����ϸ� true
	}

	// �Էµ� ���¹�ȣ�� �������� ��ȸ
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null)
				if (accountArray[i].getAno().equals(ano)) {
					// ���ڿ��� �����: ���ڿ�1.equals(���ڿ�2)
					account = accountArray[i];
				}
		}
		return account;
	}
	
//	private void 
}
