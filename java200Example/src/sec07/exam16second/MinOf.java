package sec07.exam16second;

import java.util.Arrays;

public class MinOf {
	int result;
	
	static long minOf(int x) {
		MinOf min = new MinOf();
		int[] arr = new int[x];
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] = ", i);
			arr[i] = Main.sc.nextInt();
		}
		Arrays.sort(arr);
		min.result = arr[0];
		return min.result;
	}
}
