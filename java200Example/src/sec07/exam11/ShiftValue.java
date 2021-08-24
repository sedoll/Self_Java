package sec07.exam11;

import java.util.*;

public class ShiftValue {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int pow1;
	
	public int pow(int n) {
		while(n<0) {
			System.out.print("n: ");
			n = sc.nextInt();
			this.n = n;
		}
		pow1 = (int) Math.pow(2, this.n);
		return pow1;
	}
	
	public static void main(String[] args) {
		ShiftValue shiftval = new ShiftValue();
		
		System.out.println("정수 x를 n비트 합니다.");
		System.out.print("x: ");
		int x = sc.nextInt();
		System.out.print("n: ");
		n = sc.nextInt();
		
		int result1 = x * shiftval.pow(n);
		int result2 = x / shiftval.pow(n);
		int shiftL = x << n;
		int shiftR = x >> n;
		
		System.out.printf("%d * %d = %d\n", x, shiftval.pow(n), result1);
		System.out.printf("%d / %d = %d\n", x, shiftval.pow(n), result2);
		System.out.printf("%d << %d = %d\n", x, n, shiftL);
		System.out.printf("%d >> %d = %d\n", x, n, shiftR);
	}

}
