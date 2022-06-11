package sec06.exam02;

import sec06.exam01.Exam01;

public class Exam02 {

	public static void main(String[] args) {
		Exam01 e1 = new Exam01(3, false);
		Exam01 e2 = new Exam01();
		System.out.println(e1.info());
		System.out.println(e2.info());

	}

}
