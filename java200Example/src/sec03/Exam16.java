package sec03;

import java.util.Arrays;
import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i=0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); // 오름차순 정렬
		System.out.println(arr[1]); // 중간 값 출력
	}

}
