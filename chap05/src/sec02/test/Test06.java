package sec02.test;

import java.util.*;

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			int selectNo = sc.nextInt();
			
			if(selectNo == 1 ) { //1.학생수
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				
			} else if(selectNo == 2 ) { //2.점수입력
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> ", i);
					scores[i] = sc.nextInt();
				}
				
			} else if(selectNo == 3 ) { //3.점수리스트
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> %d\n", i, scores[i]);
				}
				
			} else if(selectNo == 4 ) { //4.분석
				int max = 0;
				double avg = 0.0;
				int sum = 0;
				for(int i=0; i<scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				avg = (double) sum / scores.length;
				
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				
			} else if(selectNo == 5 ) { //5.종료
				System.out.println("시스템종료");
				run = false;
			} else {
				System.out.println("잘못 입력하였습니다. 다시 선택해주십시오.");
			}
		}
	}

}
