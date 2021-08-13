package sec07.exam02;

public class Min {
	static int result;
	
	 static void min(int x, int y, int z) {
		result = x;
		if(result > y && z > y) {
			result = y;
			System.out.printf("ÃÖ¼Ú°ª: %d", result);
		} else if(result > z && y > z) {
			result = z;
			System.out.printf("ÃÖ¼Ú°ª: %d", result);
		} else {
			result = x;
			System.out.printf("ÃÖ¼Ú°ª: %d", result);
		}
	}
}
