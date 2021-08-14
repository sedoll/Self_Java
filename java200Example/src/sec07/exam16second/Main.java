package sec07.exam16second;
//배열의 값에서 최솟값 구하기 방법1
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int x;
		int y;
		do {
			System.out.print("배열의 갯수 입력: ");
			x = Main.sc.nextInt();
			
			long result = MinOf.minOf(x);
			System.out.println("최솟값: " + result);
			
			System.out.printf("종료하겠습니까? 1.예 | 2. 아니오");
			y = Main.sc.nextInt();
		} while( y != 1);
		System.out.println("프로그램이 종료되었습니다.");

	}

}
