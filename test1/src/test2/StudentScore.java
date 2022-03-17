package test2;

import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = null;
		int sum = 0;
		float avg = 0.0f;
		boolean run = true;
		
		while(run) {
			println("-------------------------------------------");
			println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			println("-------------------------------------------");
			
			String select = sc.nextLine();
			
			switch(select) {
				case "1":
					println("학생수를 입력하세요");
					String student = sc.nextLine();
					int stuNum = Integer.parseInt(student);
					score = new int[stuNum];
					break;
				case "2":
					println("점수를 입력하세요");
					for(int i=0; i<score.length; i++) {
						print((i + 1) + " 번 학생 점수 입력: ");
						String scores = sc.nextLine();
						score[i] = Integer.parseInt(scores);
					}
					break;
				case "3":
					println("학생 점수 리스트");
					for(int i=0; i<score.length; i++) {
						println((i + 1) + " 번 학생 점수: " + score[i]);
					}
					break;
				case "4":
					println("분석");
					int max = score[0];
					for(int i=0; i<score.length; i++) {
						sum += score[i];
						if(max < score[i]) {
							max = score[i];
						}
					}
					avg = (float) sum / score.length;
					println("최고 점수: " + max);
					println("평균 점수: " + avg);
					break;
				case "5":
					println("시스템을 종료합니다.");
					run = false;
					break;
				default:
					println("잘못 된 접근입니다.");
					
			}
		}

	}
	
	public static void println(String result) {
		System.out.println(result);
	}
	
	public static void print(String result) {
		System.out.print(result);
	}

}
