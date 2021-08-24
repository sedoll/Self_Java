package sec08.exam03;

import java.util.*;

public class CarTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car myCar = new Car("쏘나타", "12가3456", 80, 100, 200, 500, 1000, 200, 5, 140);
		boolean run = true;
		
		while(run) {
			System.out.println("1.현재 x좌표 | 2.현재 y좌표 | 3.x좌표 이동 | 4.y좌표 이동 | 5.남은 연료 "
					+ "| 6.급유 | 7. 자동차 스펙 | 8. 종료");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				myCar.getX();
				break;
			case 2:
				myCar.getY();
				break;
			case 3:
				double x = sc.nextDouble();
				myCar.setXMove(x);
				run = myCar.getFuelRemain();
				break;
			case 4:
				double y = sc.nextDouble();
				myCar.setYMove(y);
				run = myCar.getFuelRemain();
				break;
			case 5:
				myCar.getFuelRemain();
				break;
			case 6:
				double oil = sc.nextDouble();
				myCar.setFuelRemain(oil);
				break;
			case 7:
				myCar.spec();
				break;
			default:
				run = false;
				break;
			}
				
		}
		System.out.println("시동이 꺼졌습니다.");
	}

}
