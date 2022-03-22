package bank;

public class Account {
	private String name; // 고객이름
	private int cashId; // 사용할 계좌번호
	private int pwd; // 사용할 비밀번호
	private int money; // 잔액
	
	Account() {
		
	}
	
	Account(String name, int cashId, int pwd){
		this.name = name;
		this.cashId = cashId;
		this.pwd = pwd;
	}
	
	int getIdCheck() { // 계좌번호 확인을 위한 메소드
		return this.cashId;
	}
	
	int getPwdCheck() {
		return this.pwd;
	}
	
	void nameIdPrint() { // 이름과 계좌 번호 출력
		System.out.println("이름: " + this.name);
		System.out.println("계좌 번호: " + this.cashId);
	}
	
	void setSumMoney(int money) {
		this.money += money;
	}
	
	void setSubMoney(int money) {
		this.money -= money;
	}
	
	int getMoney() {
		return this.money;
	}
	
}