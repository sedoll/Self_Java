package sec02.exam03;
// 정수형, long은 900경까지 표현할 수 있지만 
//L을 안쓰면 Java에서 int형으로 읽어서 오류가 뜬다. int형은 20억까지만 표현 가능하다
public class LongExample {

	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 20000000000; 자바가 L을 안붙혀서 int형으로 인식하여 오류가 발생
		long var3 = 20000000000L; //200억, L을 붙혀야 Long타입으로 간주해서 컴파일에러가 발생하지 않음
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
	}

}
