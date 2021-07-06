package compare;

import java.util.*;

public class CompareAB {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a ,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		String result = (a > b) ? ">" : (a < b) ? "<" : "==";
		System.out.println(result);
	}
}
