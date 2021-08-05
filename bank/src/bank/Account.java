package bank;

public class Account {
	
	int arrLength = 100;
	String[] id = new String[arrLength];
	String[] pw = new String[arrLength];
	String idCheck;
	String pwCheck;
	int i = 0;
	
	boolean account(String id, String pw) {
		this.idCheck = id;
		this.pwCheck = pw;
		System.out.println(id);
		System.out.println(pw);
		System.out.println("i: " + i);
			for(int j=0; j<arrLength; j++) {
				if(this.idCheck.equals(this.id[j])) {
					return false;
				}
			}
		this.id[i] = this.idCheck;
		this.pw[i] = this.pwCheck;
		i++;
		return true;
	}
}
