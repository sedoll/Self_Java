// 주사위 게임
package python_learn;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int run = Integer.parseInt(sc.nextLine()); // 실행 횟수
		int[] arr = new int[run]; // 값을 저장할 배열 선언
		
		
		for(int i=0; i<run; i++) {
			String str = sc.nextLine();
			String[] strArr = str.split(" ");
			int a = Integer.parseInt(strArr[0]);
			int b = Integer.parseInt(strArr[1]);
			int c = Integer.parseInt(strArr[2]);
			
			if(a == b && b == c) { // 숫자 세 개가 같을 경우
				arr[i] = a * 1000 + 10000;
			} else if(a == b || a == c) { // 숫자 두 개가 같을 경우
				arr[i] = a * 100 + 1000;
			} else if(b == c) { // 숫자 두 개가 같을 경우
				arr[i] = b * 100 + 1000;
			} else {
				int max = (a < b) ? ((b < c) ?  c : b) : ((c < a) ?  a : c); // 제일 큰 값 비교
				arr[i] = max * 100;
			}
		}
		
		Arrays.sort(arr); // 오름차순 정렬
		System.out.println(arr[run-1]); // 맨 뒤에 값이 제일 큰 값이므로 맨 뒤의 값 출력
	}

}
