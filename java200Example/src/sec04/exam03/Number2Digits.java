package sec04.exam03;
//10~99사이의 값 맞추기 프로그램
import java.util.*;

public class Number2Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rd = (int) ((Math.random() * 90) + 10);
		boolean run = true;
		int x = 0;
		int numberTime = 0;
		int maxNumberTime = 10;
		
		System.out.println("숫자 맞추기 게임 시작!!");
		System.out.println("10~99 사이의 값을 맞춰보세요.");
		System.out.printf("남은 시도 횟수: %d\n", maxNumberTime);
		System.out.println();
		
		do {
			System.out.print("수를 입력하세요.>");
			x = sc.nextInt();
			
			if(numberTime != maxNumberTime) {
				if(rd == x) {
					System.out.printf("\n수가 일치합니다. 정답: %d\n", rd);
					run = false;
				} else if(rd > x) {
					System.out.printf("\n입력받은 수가 더 작습니다. x < %d\n", x);
					numberTime++;
					System.out.printf("남은 시도 횟수: %d\n", maxNumberTime - numberTime);
				} else if(rd < x) {
					System.out.printf("\n입력받은 수가 더 큽니다. x > %d\n", x);
					numberTime++;
					System.out.printf("남은 시도 횟수: %d\n", maxNumberTime - numberTime);
				}
			} else {
				System.out.println("아쉽게도 숫자를 맞추지 못 했습니다.");
				run = false;
			}
			System.out.println();
		} while(run); 

		System.out.println("프로그램을 종료합니다.");

	}

}
