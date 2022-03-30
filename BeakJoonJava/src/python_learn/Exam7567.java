package python_learn;

import java.util.Scanner;

public class Exam7567 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = 10; // 그릇을 쌓은 길이 변수, 초기값 10
		
		// 한 글자 씩 자르기
		String[] strArray = str.split("");
		
		for(int i=1; i<strArray.length; i++) { // 문자열의 길이 만큼 반복
			if(strArray[i].equals(strArray[i-1])) { // 그릇을 전에 꺼랑 같은 모양으로 쌓을경우
				len += 5;
			} else { // 다른 모양으로 쌓을 경우
				len += 10;
			}
		}
		
		System.out.println(len);

	}

}
