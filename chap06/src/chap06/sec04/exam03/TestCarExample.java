package chap06.sec04.exam03;

import java.util.*;

public class TestCarExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestCar myCar = new TestCar();
		
		System.out.print("남은 기름 잔량을 입력하세요.> ");
		int gasIn = sc.nextInt();
		myCar.setGas(gasIn);
		
		System.out.println("차가 출발합니다.");
		System.out.println();
		
		while(myCar.isLeftGas()) {
			myCar.run();
		}
		
		System.out.println("차는 더 이상 움직일 수 없습니다.");
	}

}
