package sec03.exam05;
//자동타입변환, 강제타입변환
public class OperationPromotionExample {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int byteValue3 = byteValue1 + byteValue2;
		System.out.println("정수의 덧셈: " + byteValue3);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int charValue3 = charValue1 + charValue2; // 65 + 1
		System.out.println("유니코드: " + charValue3); //int 66
		System.out.println("출력문자: " + (char)charValue3); //char 'B'
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; //정수의 나누기 이므로 2.5가 아닌 2가 나옴
		System.out.println("정수의 나누기: " + intValue4);
		
		double doubleValue = intValue3 / 4.0; // 실수의 나누기 이므로 2.5가 나옴
		System.out.println("실수로 바꾸어서 나누기: " + doubleValue);
		
		int x = 1;
		int y = 2;
		double result1 = x / y;
		double result2 = (double)x / y;
		System.out.println("정수형을 실수형에 받아서 나누기: " + result1);
		System.out.println("정수형을 실수형으로 바꾸고 받아서 나누기: " + result2);
	}

}
