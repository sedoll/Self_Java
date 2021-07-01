package sec02.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		byte b = 100;
		//byte result3 = (byte) -b; // byte 타입으로 강제타입변환방식
		int result3 = -b; //연산을 받는 변수를 int 형으로 바꾸는 방식
		System.out.println("result3 = " + result3);
	}

}
