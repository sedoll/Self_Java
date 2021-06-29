package sec02.exam01;
//리터럴 예제, 2, 8, 10, 16진수 이용
public class IntegerLiteralExample {

	public static void main(String[] args) {
		
		int var1 = 0b1011; //var1 변수에 2진수 값으로 11 초기화, 2진수는 앞에 0b를 붙인다.
		int var2 = 013; //var2에 8진수 값으로 11 초기화, 8진수는 앞에 0을 붙인다.
		int var3 = 11; //var3에 10진수 값으로 11 초기화, 10진수는 그냥 쓴다.
		int var4 = 0xB3; //var4에 16진수 값으로 179 초기화, 16진수는 앞에 0x를 붙인다.
		
		System.out.println("var1(2진수): " + var1);
		System.out.println("var2(8진수): " + var2);
		System.out.println("var3(10진수): " + var3);
		System.out.println("var4(16진수): " + var4);

	}

}
