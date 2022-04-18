// 입력한 성과 이름을 인사
package sec02;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성:");
		String fName = sc.nextLine();
		System.out.print("이름:");
		String lName = sc.nextLine();
		System.out.println("안녕하세요. " + fName + lName + " 씨.");

	}

}
