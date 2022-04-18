package sec03;

import java.util.*;

public class Exam18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] arr = new Integer[2]; 
		for(int i=0; i<2; i++) {
			arr[i] = sc.nextInt();
		}
		// 오름 차순정렬을 할 때는 int형을 사용하면 에러가 발생하므로 Integer로 바꾸어서 해준다.
		Arrays.sort(arr, Collections.reverseOrder()); // 오름 차순정렬
		System.out.println(arr[0]+ " " + arr[1]);
	}
	
}
