package sec02.exam10;
//대입 연산자
public class AssignmentoperatorExample {

	public static void main(String[] args) {
		int result = 0; //정수형 변수에 0으로 초기화
		
		result += 10; //10을 더해주고 값을 저장 0 + 10 = 10
		System.out.println(result); // 10
		result -= 5; // 5를 빼주고 값을 저장 10 - 5 = 5
		System.out.println(result); // 5
		result *= 3; // 3을 곱해주고 값을 저장 5 * 3 = 15
		System.out.println(result); // 15
		result /= 5; // 5를 나누고 나온 값을 저장 15 / 5 = 3
		System.out.println(result); // 3
		result %= 3; // 3으로 나누고 나온 나머지를 저장한다 3 % 3 = 0
		System.out.println(result); // 0

	}

}
