// 첼시를 도와줘
package python50_100;

import java.util.*;

public class Exam11098 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int run = Integer.parseInt(sc.nextLine());
		for(int i=0; i<run; i++) {
			int cost = 0;
			String name = null;
			int val = Integer.parseInt(sc.nextLine());
			for(int j=0; j<val; j++) {
				String str = sc.nextLine(); // 가격, 이름을 공백으로 나눠 입력
		        String[] cn = str.split(" "); // 공백을 기준으로 가격, 이름 나눔
		        if(cost <= Integer.parseInt(cn[0])) { // 최고가 일 경우
		        	cost = Integer.parseInt(cn[0]);
		        	name = cn[1]; // 이름 추가
		        }
			}
			System.out.println(name);
		}
	}

}
