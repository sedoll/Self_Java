package sec02.exam02;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		
		int [] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		int sum2 = add(new int[] {83, 90, 87} );
		System.out.println("총합: " + sum2);
	}
	
	public static int add(int[] scores) { //add라는 메소드가 호출되면
		int sum = 0; //실행하고
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum; //sum 값을 돌려준다.
	}

}
