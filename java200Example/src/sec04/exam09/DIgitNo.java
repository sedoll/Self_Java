package sec04.exam09;

import java.util.*;

public class DIgitNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.: ");
		String x = sc.nextLine();
		
		System.out.printf("값: %s, 자리수: %s", x, x.length());

	}

}
