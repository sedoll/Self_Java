package sec03.exam02;
//강제타입변환
public class CastingExample {

	public static void main(String[] args) {
		
		//int -> char
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println("charValue: " + charValue);
		
		long longValue = 500L;
		intValue = (int) longValue;
		System.out.println("intValue: " + intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println("intValue: " + intValue);

	}

}
