package sec07.exam20;

import java.util.*;

public class AryIns {
	static Scanner sc = new Scanner(System.in);
	static private int idx;
	
	static void aryIns(int[] a, int idx, int x) {
		
		// 책에 있는 코드
		for(int i=a.length-1; i > idx; i--) {
			a[i] = a[i-1];
		}
		a[idx] = x;
		
		/* 내가 쓴 코드
		for(int i=a.length-1; i>=idx; i--) {
			if(i != idx) {
				a[i] = a[i-1];
			} else {
				a[i] = x;
			}
		}
		*/
	}
	
	static void arrPrint(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.printf("a[%d]: %d\n", i,a[i]);
		}
	}
	
	static void arrMake(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.printf("a[%d]: ", i);
			a[i] = sc.nextInt();
		}
	}
	
	static void arrLength(int[] a) {
		boolean run = true;
		int idx = 0;
		while(run) {
			idx = sc.nextInt();
			if(0 <= idx && idx < a.length) {
				AryIns.idx = idx;
				run = false;
			} else {
				System.out.printf("배열 범위를 벗어났습니다. \n다시 입력 해주세요.: ");
			}
		}
	}

	public static void main(String[] args) {
		int[] a;
		System.out.printf("요소 수: ");
		int n = sc.nextInt();
		a = new int[n];
		
		arrMake(a);
		arrPrint(a);
		System.out.printf("삽입할 요소의 인덱스: ");
		arrLength(a);
		System.out.printf("삽입할 값: ");
		int x = sc.nextInt();
		aryIns(a, idx, x);
		arrPrint(a);
	}

}