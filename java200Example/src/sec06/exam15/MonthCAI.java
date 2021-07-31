package sec06.exam15;
// 각 월에 해당하는 영어 단어 학습 프로그램 

import java.util.*;

public class MonthCAI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] month = {"January", "February", "March", "April", "May"
				, "June", "July", "August", "September", "October", "November", "December"
		};
		boolean run = true;
		int rd = (int) (Math.random() * 11);  //1~12까지 랜덤 출력
		System.out.println("게임을 시작하겠습니다.");
		
		while(run) {
			System.out.printf("%d월: ", rd+1);
			String monthIn = sc.nextLine();
			
			if(monthIn.equals(month[rd])){
				System.out.println("답: " + month[rd] + " 정답입니다.");
				rd = (int) (Math.random() * 11); // 1~12까지 랜덤 출력
				System.out.println("계속하시겠습니까? 1.예, 2.아니요");
				int selct = sc.nextInt();
				if (selct == 1) {
				} else {
					run = false;
				}	
			} else {
				System.out.println("틀렸습니다. ");
			}
		}
		System.out.println("프로그램을 종료 합니다. ");
	}

}