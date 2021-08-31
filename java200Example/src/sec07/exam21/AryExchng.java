package sec07.exam21;

import java.util.*;

public class AryExchng {
	static Scanner sc = new Scanner(System.in);
	
	static void arr(int[] arr, String s) { //배열값 선언
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%s[%d] = ",s,i);
			arr[i] = sc.nextInt();
		}
	}
	
	static void arrPrint(int[] arr, String s) {
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%s[%d] = %d\n",s,i,arr[i]);
		}
	}
	
	static void aryExchng(int[] a, int[] b) {
		int temp;
		if(a.length > b.length) {
			for(int i=0; i<b.length; i++) {
				temp = a[i];
				a[i] = b[i];
				b[i] = temp;
			}
		} else {
			for(int i=0; i<a.length; i++) {
				temp = a[i];
				a[i] = b[i];
				b[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] a;
		int[] b;
		String arrA = "a";
		String arrB = "b";
		
		System.out.printf("배열 %s의 요소 수: ", arrA);
		int x = sc.nextInt();
		a = new int[x];
		arr(a, arrA);
		
		System.out.printf("배열 %s의 요소 수: ", arrB);
		int y = sc.nextInt();
		b = new int[y];
		arr(b, arrB);
		
		System.out.println("교환 전");
		arrPrint(a, arrA);
		arrPrint(b, arrB);
		
		aryExchng(a, b);
		
		System.out.println("교환 후");
		arrPrint(a, arrA);
		arrPrint(b, arrB);
	}

}