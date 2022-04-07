// 정처기 실기 예상문제 3번 실습
package ipe;

public class Exam01 {
	public static void main(String[] args) {
		SuperClass s = new SubClass();
	}
}

class SuperClass { // 부모 클래스
	SuperClass() {
		System.out.print("Super");
	}
}

class SubClass extends SuperClass { // 자식 클래스
	SubClass() {
		System.out.print("Sub");
	}
}
