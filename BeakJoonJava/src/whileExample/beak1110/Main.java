package whileExample.beak1110;

import java.util.*;

public class Main {	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
		int num = 0;
		int result = x;
		boolean run = true;
		
		while(run) {
			x = (((x % 10)*10) + (((x/10) + (x%10))%10));
			num++;
			if(result == x) {
				run = false;
			}
		}
		System.out.print(num);
    }
}