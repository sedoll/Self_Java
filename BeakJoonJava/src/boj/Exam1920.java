// 이분탐색
package boj;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int an = Integer.parseInt(sc.nextLine());
		int[] a = new int[an];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.nextLine();
		Arrays.sort(a); // 차순 정렬
		
		int mn = Integer.parseInt(sc.nextLine());
		int[] m = new int[mn];
		for(int i=0; i<m.length; i++) {
			m[i] = sc.nextInt();
		}
		
	}

}
