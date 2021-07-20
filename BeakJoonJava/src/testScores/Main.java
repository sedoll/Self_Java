package testScores;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		/*
		String y = (x>=90 ? "A" : (x>=80 ? "B" : (x>=70 ? "C" : (x>=60 ? "D" : "F")))); 
		System.out.println(y);
		*/
		if(x>=90) {
			System.out.println("A");
		} else if(x>=80) {
			System.out.println("B");
		} else if(x>=70) {
			System.out.println("C");
		} else if(x>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
