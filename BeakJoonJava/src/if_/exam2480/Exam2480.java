package if_.exam2480;

import java.util.*;

public class Exam2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dice = sc.nextLine(); // 주사위 값 입력
		String[] strDice = dice.split(" "); // 각각의 주사의 값을 나눈다
		int[] intDice = new int[strDice.length];
		int result = 0;
		
		for(int i=0; i<strDice.length; i++) { // 주사위 값을 정수형으로 바꿈
			intDice[i] = Integer.parseInt(strDice[i]);
		}
		
		if(intDice[0] == intDice[1] && intDice[0] == intDice[2]) { //모두다 같을 경우
			result = 10000+intDice[0]*1000;
		} else if(intDice[0] == intDice[1] || intDice[0] == intDice[2]) { // 두개의 주사위가 같은경우
			result = 1000+intDice[0]*100;
		} else if(intDice[1] == intDice[2]) { // 두개의 주사위가 같은경우
			result = 1000+intDice[1]*100;
		} else { // 주사위가 같은게 없는 경우
			Arrays.sort(intDice);
			result = intDice[2]*100;
		}
		
		System.out.println(result); //결과 출력
		
	}

}