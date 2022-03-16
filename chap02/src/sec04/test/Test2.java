package sec04.test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int num = Integer.parseInt(str);

		for (int i = 1; i < num+1; i++) { // 1부터 5까지
			for (int j = num+1; j > 0; j--) { //6부터 1까지
				if(j <= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
