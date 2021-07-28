package chap06.sec03.exam02;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	Korean(String name, String ssn) {
		//통상적으로 필드의 이름과 매개변수의 이름을 같은 걸로 설정한다.
		 this.name = name; //this.name, 내가 가지고 있는 name이라는 필드 사용
		 this.ssn = ssn; //this.ssn, 내가 가지고 있는 ssn이라는 필드 사용
	}
}
