package chap06.sec05.Exam05.Test01;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		System.out.println();
		
		p1.name = "강감찬";
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		/*
		 * final을 이용 했으므로 한 번 입력된 값은 다시 수정이 되지 않는다.
		p1.ssn = "12345";
		p1.name = "usa";
		*/

	}

}
