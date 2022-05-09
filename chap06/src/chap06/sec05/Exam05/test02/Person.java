package chap06.sec05.Exam05.test02;

public class Person {
	final String nation = "korean";
	final String ssn;
	String name;
	
	Person(String ssn, String name) { // final 필드에 값을 제공할 때
		this.ssn = ssn;
		this.name = name;
	}
}
