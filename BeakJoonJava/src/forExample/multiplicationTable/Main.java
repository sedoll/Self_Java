package forExample.multiplicationTable;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int sum = 0;
	        
	        for(int i=1; i<10; i++) {
	            sum = x * i;
	            System.out.printf("%d * %d = %d\n", x, i, sum);
	        }

	}

}
