package sec07.exam03;

import java.util.*;

public class MedExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x의 값: ");
		int x = sc.nextInt();
		System.out.print("y의 값: ");
		int y = sc.nextInt();
		System.out.print("z의 값: ");
		int z = sc.nextInt();
		
		Med.med(x, y, z);

	}

}
