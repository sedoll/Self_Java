package sec07.exam16;

public class MinOf {
	long result;
	
	static long minOf(int x) {
		MinOf min = new MinOf();
		min.result = 1000000000000L;
		int[] arr = new int[x];
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] = ", i);
			arr[i] = Main.sc.nextInt();
			if(min.result > arr[i]) {
				min.result = arr[i];
			}
		}
		return min.result;
	}
}
