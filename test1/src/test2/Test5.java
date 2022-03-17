package test2;

public class Test5 {

	public static void main(String[] args) {
		int[][] arr = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		float avg = 0.0f;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		avg = (float) sum / count;
		
		print(String.valueOf(sum));
		print(String.valueOf(avg));
		print(String.valueOf(count));
	}
	
	public static void print(String result) {
		System.out.println(result);
	}

}
