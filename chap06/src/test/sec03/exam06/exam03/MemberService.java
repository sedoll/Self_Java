package test.sec03.exam06.exam03;

public class MemberService {
	boolean login(String id, String pwd) {
		
		if(id.equals("hong") && pwd.equals("12345")) {
			return true;
		}
		return false;
	}
	
	void logout(String id) {
		System.out.println(id + " ·Î±×¾Æ¿ô");
	}
}
