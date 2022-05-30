package sec09.exam05;

public class Account {
	private String name;
	private String no;
	private long balance;
	private Day date;
	
	// 생성자
	Account(String n, String num, long z, Day d) {
		name = n;
		no = num;
		balance = z;
		date = new Day(d);
	}
	
	//계좌 명의 확인
	public String getName() {
		return name;
	}
	
	//계좌 번호 확인
	public String getNo() {
		return no;
	}
	
	//예금 잔고 확인
	public long getBalance() {
		return balance;
	}
	
	public Day date() {
		return new Day(date);
	}
	
	//k원 입금
	void deposit(long k) {
		balance += k;
	}
	
	//k원 출금
	void withdraw(long k) {
		balance -= k;
	}
	
	//
	public String toString() {
		return "{"+name+", "+no+", "+balance+"}";
	}
	
}
