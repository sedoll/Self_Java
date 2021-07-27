package forExample.aPulsB3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i=1; i<(t+1); i++) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	int sum = x + y;
        	System.out.println("Case #" + i + ": " + x + " + " + y + " = " + sum);
        }

	}

}
