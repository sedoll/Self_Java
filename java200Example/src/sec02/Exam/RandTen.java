package sec02.Exam;

import java.util.Scanner;

public class RandTen {

	public static void main(String[] args) {
		int ran = 0;
		while(true) {
			ran = (int) (Math.random()*900) +100;
			if(ran % 2 == 1) {
				break;
			}
		}
		System.out.println(ran*10); // 난수를 10배 한 값
		System.out.println(ran%10); // 난수의 마지막 자릿수
		
	}

}
