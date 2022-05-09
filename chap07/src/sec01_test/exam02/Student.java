package sec01_test.exam02;

public class Student extends People{ // ÇÐ»ý
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
