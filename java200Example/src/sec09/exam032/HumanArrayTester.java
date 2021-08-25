package sec09.exam032;

import java.util.*;

import sec09.exam03.Human;

public class HumanArrayTester {
	static void printHumanArray(Human[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.printf("이름: %s, 키: %d, 몸무게: %d\n", a[i].getName(), a[i].getHeight(), a[i].getWeight());
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		Human[][] hm = new Human[x][y];
		
		for(int i=0; i<hm.length; i++) {
			for(int j=0; j<hm[i].length; j++) {
				System.out.printf("y[%d]",i);
				System.out.printf("y[%d]",j);
				System.out.print("이름: ");
				String name = sc.next();
				System.out.print("신장: ");
				int height = sc.nextInt();
				System.out.print("체중: ");
				int weight = sc.nextInt();
				hm[i][j] = new Human(name, height, weight);
			}
		}
		
		for(int i=0; i<hm.length; i++) {
			System.out.printf("%d 행\n", i);
			printHumanArray(hm[i]);
		}
		
	}

}
