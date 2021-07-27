package whileExample.beak10952;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean stop = true;
		
		while(stop) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int sum = x + y;
			if(sum != 0) {
				System.out.println(sum);
			} else {
				stop = false;
			}
        
		}
	}
}