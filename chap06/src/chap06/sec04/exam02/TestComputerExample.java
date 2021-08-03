package chap06.sec04.exam02;

import java.util.*;

public class TestComputerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Computer myCom = new Computer();
		int[] arr = null;
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.배열객체선언 | 2.배열값넣기 | 3.덧셈 | 4.곱셈 | 5.종료");
			int selct = sc.nextInt();
			switch(selct) {
				case 1:
					System.out.println("몇개의 배열을 선언하시겠습니까?");
					int arrLength = sc.nextInt();
					arr = new int[arrLength];
					break;
				case 2:
					for(int i=0; i<arr.length; i++) {
						System.out.printf("arr[%d]> ",i);
						int arrIn = sc.nextInt();
						arr[i] = arrIn;
					}
					break;
				case 3:
					int result1 = myCom.sum1(arr);
					System.out.println("모든 배열의 합: " + result1);
					break;
				case 4:
					long result2 = myCom.mul(arr);
					System.out.println("모든 배열의 곱: " + result2);
					break;
				default:
					run = false;
					break;
			}
		}
		System.out.println("시스템 종료");
	}

}
