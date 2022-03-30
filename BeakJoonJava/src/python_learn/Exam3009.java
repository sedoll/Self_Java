package python_learn;

import java.util.Scanner;

public class Exam3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x[] = new int[3]; // 입력 받을 x좌표 3개
		int y[] = new int[3]; // 입력 받을 y좌표 3개
		int dx, dy; // 같지 않은 x, y 좌표 넣을 변수 선언
		
		for(int i=0; i<x.length; i++) { // x, y 좌표 입력
			String str = sc.nextLine();
			String[] arr = str.split(" "); // 한줄로 x y 좌표 입력을 받기 위해 문자열로 받은 후 공백을 기준으로 나눠서 값 저장
			x[i] = Integer.parseInt(arr[0]);
			y[i] = Integer.parseInt(arr[1]);
		}
		
		// index 0, 1의 값이 같을 때 t = index 2 / f t = index 0, f f = index 1
		dx = (x[0] == x[1]) ? x[2] : (x[1] == x[2]) ? x[0] : x[1]; 
		dy = (y[0] == y[1]) ? y[2] : (y[1] == y[2]) ? y[0] : y[1];
		
		System.out.printf("%d %d", dx, dy);
	}

}
