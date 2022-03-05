package array.exam1546;

import java.util.Scanner;

public class Exam1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		// 과목 개수 입력
		int subSize = sc.nextInt(); //입력
		float[] subject = new float[subSize]; //배열 선언
		float max = subject[0];
		
		// 과목 성적 입력
		for(int i=0; i<subject.length; i++) {
			subject[i] = sc.nextInt(); // 성적 값 입력
		}
		
//		while(run) {
//			int i = 0;
//			if(i >= subject.length) {
//				run = false;
//			} else {
//				if(max < subject[i]) {
//					max = subject[i];
//					i++;
//				}
//			}
//		}
		
		//성적 출력
		for(int i=0; i<subject.length; i++) {
			System.out.println(subject[i]);
		}
		//최댓값
		System.out.printf("\n최대값: " + max);
	}

}
