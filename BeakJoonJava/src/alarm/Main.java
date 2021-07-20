package alarm;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(y>=45) {
			System.out.println(x +" "+ (y-45));
		} else {
			if(x>0) {
				System.out.println((x-1) +" "+ (60+(y-45)));
			} else {
				System.out.println(23 +" "+ (60+(y-45)));
			}
		}

	}

}
