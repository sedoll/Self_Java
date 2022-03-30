//학점계산
package python_learn;

import java.util.Scanner;

public class Exam2754 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String score = sc.nextLine();
		double scoreNum;
		
		if(score.equals("A+")) {
			scoreNum = 4.3;
		} else if(score.equals("A0")) {
			scoreNum = 4.0;
		} else if(score.equals("A-")) {
			scoreNum = 3.7;
		} else if(score.equals("B+")) {
			scoreNum = 3.3;
		} else if(score.equals("B0")) {
			scoreNum = 3.0;
		} else if(score.equals("B-")) {
			scoreNum = 2.7;
		} else if(score.equals("C+")) {
			scoreNum = 2.3;
		} else if(score.equals("C0")) {
			scoreNum = 2.0;
		} else if(score.equals("C-")) {
			scoreNum = 1.7;
		} else if(score.equals("D+")) {
			scoreNum = 1.3;
		} else if(score.equals("D0")) {
			scoreNum = 1.0;
		} else if(score.equals("D-")) {
			scoreNum = 0.7;
		} else {
			scoreNum = 0.0;
		}
		System.out.println(scoreNum);
	}

}
