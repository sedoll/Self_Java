package python50_100;

import java.util.Scanner;

public class Exam2442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int run = sc.nextInt();
		for(int i=1; i<=run; i++) {
			System.out.println(" ".repeat(run-i)+"*".repeat(2*i-1));
		}

	}

}
