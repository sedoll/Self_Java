package whileExample.beak1110;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean stop = true;
        int temp = 0;
        int i = 0;
        
        int x = sc.nextInt();
        if(x < 10) {
        	x *= 10;
        }
        String strx = String.valueOf(x);
        
        while(stop) {
        	int a = Integer.parseInt(strx.substring(0, 1)); //십의자리
        	String b = strx.substring(1); //일의자리
        	int c = a + Integer.parseInt(b);
        	String strsum = String.valueOf(c);
        	String sum = strsum.substring(strsum.length()-1, strsum.length());
        	String strNewNum = b + sum;
        	int newNum = Integer.parseInt(strNewNum);
        	i++;
        	
        	if(x != newNum) {
        		stop = true;
        	} else {
        		stop = false;
        	}
        	
        }
        System.out.println(i);
    }
}