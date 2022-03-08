package array.exam8958;

import java.util.*;

public class Exam8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		int intNum = Integer.parseInt(num);
		String[] test = new String[intNum]; // 배열 개수 입력 후 배열 선언
		int[] result = new int[intNum];
		
		for(int i=0; i<intNum; i++) {
			test[i] = sc.nextLine(); // ox 결과 입력
			String[] strArray = test[i].split(""); //비교를 위해 하나씩 자르기
			int count = 0;
			int sum = 0;
			
			for(int j=0; j<strArray.length; j++) {
				if(strArray[j].equals("O") || strArray[j].equals("o")) {
					sum += ++count;
				} else {
					count = 0;
				}
			}
			result[i] = sum;
		}
		
		for(int i=0; i<intNum; i++) {
			System.out.println(result[i]);
		}

	}

}