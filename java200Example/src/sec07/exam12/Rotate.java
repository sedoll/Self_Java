package sec07.exam12;
// 잘 모르겠음
import java.util.*;

public class Rotate {
	static int rResult;
	static int lResult;
	
	static int rRotate(int x, int n) {
		rResult = x >> n;
		return rResult;
		
	}
	static int lRotate(int x, int n) {
		lResult = x << n;
		return lResult;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 x를 n비트 회전합니다.");
		System.out.print("x: ");
		int x = sc.nextInt();
		System.out.print("n: ");
		int n = sc.nextInt();
		
		int Result1 = rRotate(x, n);
		int Result2 = lRotate(x, n);
		System.out.println("");
		
		

	}

}
