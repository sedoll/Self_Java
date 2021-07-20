package sec02.test;
// for을 이용해서 최댓값, 최솟값 구하기
public class Test04 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2};
		int min = (array.length * array.length);
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			
			if(min > array[i]) {
				min = array[i];
			}
		}
		
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}

}
