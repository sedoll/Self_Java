// 피보나치 수열
package python50_100;

import java.util.Scanner;

public class Exam2748 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] n = new long[91];
		int run = sc.nextInt();
		for(int i=0; i<=run; i++) {
			if(i > 1) {
				n[i] = n[i-1] + n[i-2];
			} else {
				n[i] = i;
			}
		}
		System.out.println(n[run]);

	}

}
