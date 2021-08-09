package sec02.exam07;

import java.util.*;

public class LowestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값을 입력하세요.> ");
		String x = sc.nextLine();
		
		System.out.println(x.substring(0, x.length()-1));
		System.out.println(x.substring(x.length()-1 , x.length()));

	}

}
