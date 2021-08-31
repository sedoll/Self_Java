package sec07.exam212;

import java.util.*;

public class AryExchngExample extends AryExchng{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
