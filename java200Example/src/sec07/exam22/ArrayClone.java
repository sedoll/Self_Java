package sec07.exam22;

import java.util.*;

public class ArrayClone {
	static Scanner sc = new Scanner(System.in);
	
	static int[] arrayClone(int[] a) { //똑같은 배열 만드는 메소드
		int[] b = new int[a.length];
		for(int i=0; i<a.length; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		return b;
	}
	
	static void printArr(int[] b) { //배열 출력 메소드
		for(int i=0; i<b.length; i++) {
			System.out.printf("b[%d] = %d\n", i, b[i]);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("요소 수: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = arrayClone(a);
		printArr(b);
		
	}

}
