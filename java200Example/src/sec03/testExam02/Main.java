package sec03.testExam02;
//입력한 두 정수의 홀, 짝 구별하기
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a == 0 && b == 0) {
			System.out.println("a와 b는 둘다 0입니다.");
		} else if(a < 0 || b < 0) {
			System.out.println("둘다 혹은 둘중에 하나가 음수 입니다.");
		} else if(a%2==0 && b%2==0) {
			System.out.println("a와 b는 둘다 짝수 입니다.");
		} else if(!(a%2==0 || b%2==0)) {
			System.out.println("a와 b는 둘다 홀수 입니다.");
		} else {
			System.out.println("둘중에 하나가 홀수 입니다.");
		}
		

	}

}
