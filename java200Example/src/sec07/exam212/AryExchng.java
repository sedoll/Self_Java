package sec07.exam212;

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

}