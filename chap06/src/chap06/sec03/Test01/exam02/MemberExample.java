package chap06.sec03.Test01.exam02;

import java.util.*;

public class MemberExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요> ");
		String name = sc.nextLine();
		System.out.print("아이디를 입력하세요> ");
		String id = sc.nextLine();
		
		Member member = new Member(name, id);
		
		System.out.println("이름: "+member.name);
		System.out.println("아이디: "+member.id);
		

	}

}
