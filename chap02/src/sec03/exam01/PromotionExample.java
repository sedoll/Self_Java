package sec03.exam01;
//자동타입변환
public class PromotionExample {

	public static void main(String[] args) {
		//byte -> int
		byte byteValue = 10; //byte 타입으로 10을 선언
		int intValue = byteValue; //int 타입으로 10을 선언
		System.out.println("intValue: " + intValue); //int 타입으로 선언된 10을 출력
		
		//char -> int
		char charValue = '가';
		intValue = charValue;
		System.out.println("intValue: " + intValue);
		
		//int -> long
		intValue = 30;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		//long -> float
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		// float -> double
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}

}
