package forExample.aPulsB;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            sum = x + y;
            System.out.println(sum);
        }

	}

}
