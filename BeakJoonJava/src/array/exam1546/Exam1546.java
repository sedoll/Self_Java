package array.exam1546;

import java.util.Scanner;

public class Exam1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		int subSize = sc.nextInt(); // 과목 갯수 입력
		float[] score = new float[subSize]; //배열 선언 (정수형)
		float[] newScore = new float[subSize];
		float sum = 0; // 새로운 점수 합 변수
		float max = 0; //최댓값을 알기위한 변수
		 
		for(int i=0; i<score.length; i++) { // 과목 성적 입력
			score[i] = sc.nextFloat(); // 성적 값 입력 (실수형)
			if(max < score[i]) { // 최댓값 비교
				max = score[i];
			}
		}
		
		for(int i=0; i<score.length; i++) { // 새로운 점수 생성
			newScore[i] = (score[i] / max) * 100;
			sum += newScore[i];
		}
		
		float avg = sum / score.length; // 새로운 점수를 통한 평균 값 계산후 출력
		System.out.println(avg); //성적 출력
	}

}