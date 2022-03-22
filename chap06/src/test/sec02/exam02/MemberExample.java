package test.sec02.exam02;

public class MemberExample {

	public static void main(String[] args) {
		Member mb = new Member();
		
		mb.name = "최하얀";
		mb.id = "gogoring";
		mb.password = "cheoi1234";
		mb.age = 23;
		
		System.out.println("이름: " + mb.name);
		System.out.println("아이디: " + mb.id);
		System.out.println("패스워드: " + mb.password);
		System.out.println("나이: " + mb.age);

	}

}
