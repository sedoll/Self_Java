package sec03;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int point = sc.nextInt();
		
		if(point >= 80 && point <= 100) {
			print("수");
		} else if(point >= 70) {
			print("우");
		} else if(point >= 60) {
			print("미");
		} else if(point >= 50) {
			print("양");
		} else {
			print("가");
		}

	}
	
	public static void print(String s) {
		System.out.println(s);
	}

}
