package test.sec04.exam06.exam03;

public class MemberExample {

	public static void main(String[] args) {
		
		MemberService ms = new MemberService();
		
		System.out.println(ms.login("id", "1234"));
		System.out.println();
		System.out.println(ms.login("hong", "12345"));

	}

}
