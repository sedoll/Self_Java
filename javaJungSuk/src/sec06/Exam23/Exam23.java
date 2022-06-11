package sec06.Exam23;

public class Exam23 {
	
	public static int max(int[] arr) {
		int max = 0;
		if(arr == null || arr.length == 0) {
			return -999999;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("ÃÖ´ñ°ª: "+max(data));
		System.out.println("ÃÖ´ñ°ª: "+max(null));
		System.out.println("ÃÖ´ñ°ª: "+max(new int[] {}));

	}

}
