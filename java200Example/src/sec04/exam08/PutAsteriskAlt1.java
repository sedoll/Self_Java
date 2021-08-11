package sec04.exam08;

import java.util.*;

public class PutAsteriskAlt1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개를 표시할까요?: ");
		int x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			if(i%2 == 0) {
				System.out.print("+");
			} else {
				System.out.print("*");
			}
		}
		System.out.println();
	}

}
