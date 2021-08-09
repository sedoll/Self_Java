package sec02.exam12;

import java.util.*;

public class Random {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random1 = (int) (Math.random()*5);
		int random2 = (int) (Math.random()* -5);
		
		int x = sc.nextInt();
		
		System.out.println(x + random1 + random2);
		

	}

}
