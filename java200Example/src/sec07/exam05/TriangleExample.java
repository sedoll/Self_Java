package sec07.exam05;

import java.util.*;

public class TriangleExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("심각형의 크기가 될 1이상의 수를 입력하세요.: ");
		int num1 = sc.nextInt();
		System.out.println();
		Triangle.putStart(num1);
	}

}
