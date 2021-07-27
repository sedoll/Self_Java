package whileExample.beak10951;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) { //hasNextInt(), 입력받는 수가 정수인지 아닌지 확인, 정수이면 프로그램이 실행되고 아니면 종료된다.
			int x = sc.nextInt();
			int y = sc.nextInt();
			int sum = x + y;
			System.out.println(sum);
        
		}
	}
}