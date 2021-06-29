package sec03.exam03;
//정수타입연산
public class ByteOperationExample {

	public static void main(String[] args) {
		
		//무 타입, 컴파일러에서 연산
		byte result1 = 30 + 20; //피연산자의 변수, 타입을 선언하지 않고 연산을 할 때에는 받는 값의 타입을 보고 연산을 해서 컴파일 오류가 안뜸
		System.out.println(result1);
		
		// int, JVM에서 연산
		byte x = 10;
		byte y = 20;
		int result = x + y; //정수는 연산할 때 int 타입으로 변환되므로 받는 값은 int로 선언
		System.out.println(result);
		
		// long, JVM에서 연산
		byte x2 = 30;
		long y2 = 40L;
		long result2 = x2 + y2; //피연산자에 long이 있으면 long으로 변환되므로 받는 값은 long으로 선언한다.
		System.out.println(result2);
	}

}
