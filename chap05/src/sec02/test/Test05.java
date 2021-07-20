package sec02.test;

public class Test05 {

	public static void main(String[] args) {
		int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		
		int sum = 0;
		int arrayLength = 0;
		double avg = 0.0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
			}
			arrayLength += array[i].length;
		}
		avg = (double) sum / arrayLength;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}

}
