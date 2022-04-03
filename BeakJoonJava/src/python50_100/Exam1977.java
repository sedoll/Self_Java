package python50_100;

import java.util.Scanner;

public class Exam1977 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = Integer.parseInt(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		int min = 0;
		int i = 1;
		int result = 0;
		while(n > result) {
			result = (int) Math.pow(i++, 2); // 완전 제곱 공식
			if(m <= result && result <= n) { // n~m 범위 일 경우
				if(min <= 0) { // 처음일때
					min = result; // 최솟값 대입
				}
				sum += result; // 완전제곱근 합
			}
		}
		if(sum == 0) { // 완전제곱근의 합이 0일경우, 없을경우
			System.out.println(-1);
		} else { // 출력
			System.out.println(sum);
			System.out.println(min);
		}
		

	}

}
