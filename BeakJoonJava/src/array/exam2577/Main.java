package array.exam2577;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		int[] arrCount = new int[10];
		int result = 1;
		int c = 2;
		
		//선언된 배열 0으로 초기화
		for(int i=0; i<arrCount.length; i++) {
			arrCount[i] = 0;
		}
		
		//세 자리수 세 개 입력후 곱셈
		for(int i=0; i<arr.length; i++) {
			
			// 입력값 범위 추가, 100~1000사이
			boolean run = true;
			do {
				arr[i] = sc.nextInt();
				if(arr[i] <= 1000 && arr[i] >= 100) {
					run = false;
				} else {
					System.out.println("입력 값은 100이상 1000 이하여야 합니다.");
				}
			} while(run);
			result *= arr[i];
		}
		
		// 계산된 수의 자리수 계산
		int leng = (int)(Math.log10(result)+1);
		
		//결과값의 이용된 숫자 계산
		for(int i=0; i<leng; i++) {
			for(int j=0; j<10; j++) {
				if(result % 10 == j) {
					arrCount[j] += 1;
				}
			}
			result /= 10;
		}
		
		//계산된 숫자 값 출력
		for(int i=0; i<arrCount.length; i++) {
			System.out.println(arrCount[i]);
		}

	}

}