package sec03.testExam02;
//입력한 두 정수의 홀, 짝 구별하기
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a % 2 != 0 && b % 2 != 0) {
			System.out.println("양쪽다 홀 수");
		} else if (a % 2 != 0 || b % 2 != 0) {
			System.out.println("하나만 홀 수");
		} else {
			System.out.println("양쪽 다 짝 수");
		}
		

	}

}
