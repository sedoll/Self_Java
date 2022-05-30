package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		// 강제타입변환
		// 자식객체가 부모객체로 자동 타입변환 후
		// 다시 반대로 변환할 때 사용
		// 자신의 원래 타입으로 돌아가는 것
		Parent p1 = new Child();
		p1.field1 = "xxx";
		p1.m1();
		p1.m2();
		// 불가능
//		c1.field2 = "yyy";
//		c1.m3();
		
		// 강제타입변환
		Child c1 = (Child) p1;
		// 가능
		c1.field2 = "yyy";
		c1.m3();
		
		// 부모객체로 선언된 것을 자식객체로 강제타입변환 불가
//		Parent p2 = new Parent();
//		Child c2 = (Child) p2;
//		c2.m1();

	}

}
