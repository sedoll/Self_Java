package sec07.exam07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		do {
			System.out.print("정수값을 입력하세요.");
			x = sc.nextInt();
		} while(x < 1);
		
		Method.readPulsInt(x);

	}

}
