package sec07.exam03;

public class Med {
	static int result;
	
	static void med(int x, int y, int z) {
		if((x > y && y > z) || (x < y && y < z)) {
			result = y;
			System.out.printf("중간값: %d", result);
		} else if((x > z && z > y) || (y < z && z < x)) {
			result = z;
			System.out.printf("중간값: %d", result);
		} else {
			result = x;
			System.out.printf("중간값: %d", result);
		}
	}
}
