package sec07.exam07;
  
public class Method {
	static int result1;
	
	static void readPulsInt(int x) {
		
		do {
			result1 = x % 10;
			x /= 10;
			System.out.print(result1);
		} while(x > 0);
		
	}
}
