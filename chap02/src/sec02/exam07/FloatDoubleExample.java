package sec02.exam07;
//실수 타입 리터럴
public class FloatDoubleExample {

	public static void main(String[] args) {
		
		//float var1 = 3.14; // 실수형의 기본타입은 double 이라서 f or F를 붙이지 않으면 컴파일 에러가 발생한다.
		float var2 = 3.14f;
		double var3 = 3.14;
		
		System.out.println(var2);
		System.out.println(var3);
		
		float var4 = 0.1234567890123456789f; //소수점 7자리까지 출력이 가능하기에 8에서 반올림되어 출력됨, //컴파일 에러는 발생하지 않음
		double var5 = 0.123456789123456789; //소수점 17자리까지 출력이 가능
		
		System.out.println(var4);
		System.out.println(var5);
		
		double var6 = 3e6; // 3 * 10.0^6 = 3백만, e는 실수타입의 리터럴이라서 정수타입에서는 사용불가
		float var7 = 3e6f;
		double var8 = 2e-3;
		
		System.out.println(var6); 
		System.out.println(var7); 
		System.out.println(var8); 

	}

}
