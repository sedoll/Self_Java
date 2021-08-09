package sec02.exam11;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		int[] arr = new int[6];
		
		System.out.println("-----로또복권 추첨기기-----");
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int) (Math.random()*45) + 1;
				for(int j=0; j<i; j++) {
					if(arr[i] == arr[j]) {
						i--;
						break;
					}
				}
		}
		Arrays.sort(arr, 0, arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
