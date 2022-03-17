package test2;

public class Test4 {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score: scores) {
			sum += score;
		}
		print(String.valueOf(sum));
		
		float avg = sum / scores.length;
		print(String.valueOf(avg));
		
	}
	
	public static void print(String result) {
		System.out.println(result);
	}

}
