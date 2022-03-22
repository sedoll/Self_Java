package test.sec02.exam02;

public class FieldInitValueExample {

	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		// 정수 타입 초기값 출력
		System.out.println(fiv.byteField);
		System.out.println(fiv.charField);
		System.out.println(fiv.shortField);
		System.out.println(fiv.intField);
		System.out.println(fiv.longField);
		
		// 불 타입 초기값 출력
		System.out.println(fiv.booleanField);
		
		// 실수 타입 초기값 출력
		System.out.println(fiv.floatField);
		System.out.println(fiv.doubleField);
		
		// 참조 타입 초기값 출력
		System.out.println(fiv.arrField);
		System.out.println(fiv.strField);

	}

}
