package sec07.exam18;
/* 배열 삭제하고 뒤에서부터 값 옮기기
 * 1 2 3 4 5 -> 1 3 4 5 5 이런식으로 만들기
 */
import java.util.*;

public class AryRmv {
	static Scanner sc = new Scanner(System.in);
	static int[] arr;
	
	static void aryRmv(int[] arr, int idx) {
		for(int i=idx; i<arr.length; i++) {
			AryRmv.arr[i] = (i< arr.length-1) ? AryRmv.arr[i+1] : AryRmv.arr[i];
		}
	}
	
	static void aryNew(int n) {
		arr = new int[n];
		for(int i=0; i<n; i++) {
			System.out.printf("a[%d]: ", i);
			arr[i] = sc.nextInt();
		}
	}
	
	
	public static void main(String[] areg) {
		int idx;
		int n;
		
		System.out.print("배열의 요소 수: ");
		n = sc.nextInt();
		aryNew(n);
		
		do {
			System.out.print("삭제할 요소의 인덱스: ");
			idx = sc.nextInt();
			while(idx < 0) {
				System.out.print("삭제할 요소의 인덱스: ");
				idx = sc.nextInt();
			}
		}while(idx > n);
		aryRmv(arr, idx);
		for(int i=0; i<arr.length; i++) {
			System.out.printf("a[%d]: %d\n", i, arr[i]);
		}
	}
}