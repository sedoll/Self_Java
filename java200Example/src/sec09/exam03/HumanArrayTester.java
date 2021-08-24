package sec09.exam03;

import java.util.*;

public class HumanArrayTester {

	static void printHumanArray(Human[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.printf("이름: %s, 키: %d, 몸무게: %d\n", a[i].getName(), a[i].getHeight(), a[i].getWeight());
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		//1차원 배열
		Human[] p = {
				new Human("철수", 170, 70),
				new Human("길동", 160, 59),
		};
		
		System.out.print("배열 q의 요소 수: ");
		n = sc.nextInt();
		
		Human[] q = new Human[n];
		for(int i=0; i<q.length; i++) {
			System.out.printf("q[%d]",i);
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("신장: ");
			int height = sc.nextInt();
			System.out.print("체중: ");
			int weight = sc.nextInt();
			q[i] = new Human(name, height, weight);
		}
		
		//2차원 배열
		Human[][] x = {
				{
					new Human("김철수", 175, 52), new Human("안철수", 175, 52)
				},
				{
					new Human("홍길동", 175, 52), new Human("일지매", 175, 52)
				},
				{
					new Human("초파", 175, 52), new Human("루피", 175, 52)
				}
		};
		
		System.out.print("배열 y의 행 수: ");
		int y1 = sc.nextInt();
		System.out.print("배열 y의 열 수: ");
		int y2 = sc.nextInt();
		
		Human[][] y = new Human[y1][y2];
			
		for(int i=0; i<y.length; i++) {
			for(int j=0; j<y[i].length; j++) {
				System.out.printf("y[%d]",i);
				System.out.printf("y[%d]",j);
				String name = sc.next();
				int height = sc.nextInt();
				int weight = sc.nextInt();
				y[i][j] = new Human(name, height, weight);
			}
		}
		
		System.out.println("배열p");
		printHumanArray(p);
		System.out.println("배열q");
		printHumanArray(q);
		System.out.println("배열x");
		for(int i=0; i<x.length; i++) {
			printHumanArray(x[i]);
		}
		System.out.println("배열y");
		for(int i=0; i<y.length; i++) {
			System.out.printf("%d 행\n", i);
			printHumanArray(y[i]);
		}

	}

}
