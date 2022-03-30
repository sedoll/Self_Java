package test.sec04.exam06.exam03;

public class MemberService {
	private String id = "hong";
	private String pwd = "12345";
	
	
	boolean login(String id, String pwd) {
		
		if(id.equals(this.id) && pwd.equals(this.pwd)) {
			System.out.println("로그인 성공");
			logout(id);
			return true;
		}
		System.out.println("로그인 실패");
		return false;
	}
	
	void logout(String id) {
		System.out.println(id + " 로그아웃");
	}
}
