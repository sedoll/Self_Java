package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		
		//value3이 long타입 이므로 받는 변수의 타입은 long으로 선언한다.
		long result = value1 + value2 + value3;
		System.out.println(result);

	}

}
