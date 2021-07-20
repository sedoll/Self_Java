package sec02.exam02;

public class Test02 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87, 80, 90, 70};
		int sum1 = 0;
		for(int i=0; i<scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("รัวี: " + sum1);
		
		int sum2 = add(scores);
		System.out.println("รัวี: "+ sum2);
		System.out.println();

	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
