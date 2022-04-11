// ¥ı«œ±‚
package python50_100;

import java.util.Scanner;

public class Exam9085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int run = 0;
		
		int t = Integer.parseInt(sc.nextLine());
		while(run < t) {
			int result = 0;
			int n = Integer.parseInt(sc.nextLine());
			String str = sc.nextLine();
        	String[] num = str.split(" ");
			for(int i=0; i<n; i++) {
				result += Integer.parseInt(num[i]);
			}
			System.out.println(result);
			run++;
		}
	}

}
