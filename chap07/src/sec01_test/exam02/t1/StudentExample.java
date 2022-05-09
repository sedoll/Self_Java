package sec01_test.exam02.t1;

import sec01_test.exam02.Student;

public class StudentExample {

	public static void main(String[] args) {
		Student s = new Student("ȫ�浿", "123456-7654321", 1);
		System.out.println(s.name);
		System.out.println(s.ssn);
		System.out.println(s.studentNo);
	}

}
