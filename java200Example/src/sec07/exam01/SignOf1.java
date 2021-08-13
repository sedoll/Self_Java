package sec07.exam01;

import java.util.*;

public class SignOf1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SignOf signof = new SignOf();
		
		System.out.print("정수값 입력: ");
		int x = sc.nextInt();
		
		int result = signof.signOf(x);
		System.out.println(result);
		
	}

}
