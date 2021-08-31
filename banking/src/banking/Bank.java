package banking;

import java.util.*;

public class Bank{

	static Scanner sc = new Scanner(System.in);
    private Account[] accounts;
    private int index;
    boolean run = true;
    private int idNum = 100;
    
    public Bank() { //계좌생성 개수
        accounts = new Account[idNum];
    }
    
    public static void main(String[] args) {
        Bank sd = new Bank();
        sd.openBank();
    }
    
    public void openBank() {
        System.out.println("반갑습니다. SEDO 뱅크입니다.");
        //User Interface 작업
        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.계좌생성 |2.계좌목록 |3.예금   |4.출금   |5.송금   |6.종료   ");
            System.out.println("----------------------------------------------------");
            System.out.print("선택 >> ");
            int cmd = sc.nextInt();
            if(cmd==6) {
                System.out.println("뱅킹서비스를 종료합니다.");
                run = false;
            } else if(cmd==1) {
                System.out.print("계좌번호 입력 >> ");
                String accountNo = sc.next();
                System.out.print("계좌주 입력 >> ");
                String accountOwner = sc.next();
                System.out.print("입금액 입력 >> ");
                int balance = sc.nextInt();
                boolean idcheck = this.overLapping(accountNo);
                if(idcheck == true) {
                	this.createAccount(new Account(accountNo,accountOwner,balance));
                }
            } else if(cmd==2) {
                this.getAccountList();
            } else if(cmd==3) {
                System.out.print("계좌번호 입력 >> ");
                String accountNo = sc.next();
                System.out.print("입금액 입력 >> ");
                int balance = sc.nextInt();
                this.deposit(accountNo, balance);
            } else if(cmd==4) {
            	System.out.print("계좌번호 입력 >> ");
                String accountNo = sc.next();
                System.out.print("출금액 입력 >> ");
                int balance = sc.nextInt();
                this.withdraw(accountNo, balance);
            } else if(cmd==5){
            	if(index > 1) { //생성된 계좌가 두 개 이상일 때
            		System.out.print("보낼 계좌번호 입력 >> ");
                    String accountNo1 = sc.next();
                    System.out.print("받을 계좌번호 입력 >> ");
                    String accountNo2 = sc.next();
                    System.out.print("송금 액 >>");
                    int balance = sc.nextInt();
                    this.trans(accountNo1, accountNo2, balance);
            	} else {
            		System.out.println("아직 계좌가 충분히 만들어 지지 않았습니다.");
            	}
            } else {
                System.out.println("올바른 선택이 아닙니다.");
            }
        }
    }
    
    //계좌생성
    private void createAccount(Account account) {
        System.out.println("------");
        System.out.println("계좌생성");
        System.out.println("------");
        accounts[index++] = account;
        System.out.println(index+"번째 계좌가 생성되었습니다.");
    }
    
    //입금
    private void deposit(String accountNo,int amount) {
        System.out.println("------");
        System.out.println("입금");
        System.out.println("------");
        Account account = this.findAccount(accountNo);
        account.setBalance(account.getBalance()+amount);
        System.out.println("예금이 성공되었습니다.");
    }
    
    //입금, 출금할 계좌 찾기
    private Account findAccount(String accountNo) {
        Account account = null;
        for(int i=0;i<index;i++) {
            if(accountNo.equals(accounts[i].getAccountNo())) {
                account = accounts[i];
                break;
            }
        }
        return account;
    }
    
    //같은 계좌번호가 있는지 확인
    private boolean overLapping(String accountNo) {
    	boolean check = false;
        for(int i=0;i<index;i++) {
            if(accountNo.equals(accounts[i].getAccountNo())) {
            	System.out.println("이미 같은 계좌번호가 있습니다. \n다시 입력 해주세요.");
            	return check;
            }
        }
        check = true;
        return check;
    }
    
    //출금
    private boolean withdraw(String accountNo,int amount) {
        System.out.println("------");
        System.out.println("출금");
        System.out.println("------");
        Account account = this.findAccount(accountNo);
        if(account.getBalance() >= amount) {
        	account.setBalance(account.getBalance()-amount);
            System.out.println("예금이 성공되었습니다.");
            return true;
        } else {
        	System.out.println("금액이 초과됩니다. \n실패하였습니다.");
        	return false;
        }
    }
    
 	//송금
    private void trans(String accountNo1, String accountNo2, int amount) {
        System.out.println("------");
        System.out.println("송금");
        System.out.println("------");
        this.findAccount(accountNo1);
        boolean check = withdraw2(accountNo1, amount);
        if(check == true) {
        	deposit2(accountNo2, amount);
        	System.out.println("송금이 성공되었습니다.");
        } else {
        	System.out.println("금액이 초과됩니다. \n실패하였습니다.");
        }
    }
    
    //송금 보냄
    private void deposit2(String accountNo,int amount) {
        Account account = this.findAccount(accountNo);
        account.setBalance(account.getBalance()+amount);
    }
    
    //송금 받음
    private boolean withdraw2(String accountNo,int amount) {
        Account account = this.findAccount(accountNo);
        if(account.getBalance() >= amount) {
        	account.setBalance(account.getBalance()-amount);
            return true;
        } else {
        	return false;
        }
    }
    
    //목록조회
    private void getAccountList() {
        System.out.println("------");
        System.out.println("목록조회");
        System.out.println("------");
        for(int i=0;i<index;i++) {
            System.out.print(accounts[i].getAccountNo()+" ");
            System.out.print(accounts[i].getAccountOwner()+" ");
            System.out.println(accounts[i].getBalance());
        }
    }
}