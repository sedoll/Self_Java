package forExample.beak10871;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int[] a;
	        
	        int n = sc.nextInt();
	        int x = sc.nextInt();
	        a = new int[n];
	        for(int i=0; i<n; i++) {
	            a[i] = sc.nextInt();
	        }
	        for(int i=0; i<n; i++) {
	            if(x > a[i]) {
	                System.out.println(a[i]);
	            }
	        }

	}

}
