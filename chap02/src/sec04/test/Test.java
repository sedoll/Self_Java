package sec04.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("[필수 정보 입력]");
		System.out.print("\n1. 이름: ");
		String name = scan.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String rNumber = scan.nextLine();
		System.out.print("3. 전화번호: ");
		String pNumber = scan.nextLine();
		
		System.out.println("\n[입력한 내용]");
		System.out.println(name);
		System.out.println(rNumber);
		System.out.println(pNumber);
		
	}

}
