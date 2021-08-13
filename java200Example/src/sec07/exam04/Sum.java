package sec07.exam04;

public class Sum {
	static long result;
	
	static long sum(int n) {
		for(int i=1; i<=n; i++) {
			result += i;
		}
		return result;
	}
}
