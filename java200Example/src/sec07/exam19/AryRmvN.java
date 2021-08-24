package sec07.exam19;

import java.util.*;

public class AryRmvN {
	static void aryRmv(int[] a, int idx, int n) {
		int temp = n;
		for(int i=idx; i<n; i++) {
			if(temp<a.length-1) {
				temp++;
			} else {
				temp = n + 1;
			}
			a[i] = a[temp];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]: ", i);
			arr[i] = sc.nextInt();
		}
		
		System.out.print("삭제를 시작할 인덱스: ");
		int idx = sc.nextInt();
		System.out.print("삭제할 요소의 수: ");
		int n = sc.nextInt();
		
		aryRmv(arr, idx, n);
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]: %d\n", i, arr[i]);
		}

	}

}