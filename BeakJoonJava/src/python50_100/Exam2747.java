//피보나치 수
package python50_100;

import java.util.Scanner;

public class Exam2747 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1]; // 피보나치 수열은 10을 입력하면 0~10까지 11개를 사용하므로 +1 해줌
		for(int i=0; i<arr.length; i++) {
			if(i < 2) {
				arr[i] = i;
			} else {
				arr[i] += arr[i-1] + arr[i-2];
			}
		}
		System.out.println(arr[n]);

	}

}
