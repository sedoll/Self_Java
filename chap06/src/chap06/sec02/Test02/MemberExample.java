package chap06.sec02.Test02;

import java.util.*;

public class MemberExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		
		member.name = "오세훈";
		member.age = 24;
		member.id = "dhtpgns";
		member.password = "1234";
		
		System.out.print("아이디를 입력하세요.> ");
		String idEnter = sc.nextLine(); 
		System.out.print("비밀번호를 입력하세요.> ");
		String pwEnter = sc.nextLine();
		
		if(member.id.equals(idEnter) && member.password.equals(pwEnter)) {
			System.out.println("유저 확인, 아이디와 비밀번호가 일치합니다.");
			System.out.printf("유저 이름: %s\n", member.name);
			System.out.printf("유저 나이: %s\n", member.age);
			
		} else if(!(member.id.equals(idEnter) || member.password.equals(pwEnter))) {
			System.out.println("아이디와 비밀번호 둘 다 틀렸습니다.");
			
		} else if(!(member.id.equals(idEnter))) {
			System.out.println("아이디가 일치하지 않습니다.");
			
		} else if(!(member.password.equals(pwEnter))) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		} 

	}

}
