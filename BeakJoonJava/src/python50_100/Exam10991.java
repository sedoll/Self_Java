//º° Âï±â 20
package python50_100;

import java.util.Scanner;

public class Exam10991 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println(" ".repeat(n-i)+"*"+" *".repeat(i-1));
		}
		
	}
	
}
