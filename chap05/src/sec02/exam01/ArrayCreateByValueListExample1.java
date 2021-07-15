package sec02.exam01;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		
		int[] scores = {83, 90, 87}; // 0, 1, 2¿« ∞¥√ºø° ¿˙¿Â
		
		System.out.println("scores[0]: "+ scores[0]);
		System.out.println("scores[1]: "+ scores[1]);
		System.out.println("scores[2]: "+ scores[2]);
		
		//√—«’ ±∏«œ±‚
		int sum = 0;
		for(int i=0; i<=2; i++) {
			sum += scores[i];
		}
		System.out.println("√—«’: " + sum);
		
		//∆Ú±’ ±∏«œ±‚
		double avg = (double) sum / 3;
		System.out.printf("∆Ú±’: %.2f", avg);
	}

}
