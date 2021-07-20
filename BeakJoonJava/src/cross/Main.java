package cross;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		        Scanner sc = new Scanner(System.in);
		        System.out.print("x의 값: ");
		        String x = sc.nextLine();
		        System.out.print("y의 값: ");
		        String y = sc.nextLine();
		        
		        String str1 = y.substring(0, 1); 
		        int intX = Integer.parseInt(x);
		        int intY1 = Integer.parseInt(str1);
		        int num1 = intX * intY1;
		        System.out.println(num1);
		        
		        String str2 = y.substring(1, 2); 
		        int intY2 = Integer.parseInt(str2);
		        int num2 = intX * intY2;
		        System.out.println(num2);
		        
		        String str3 = y.substring(2, 3); 
		        int intY3 = Integer.parseInt(str3);
		        int num3 = intX * intY3;
		        System.out.println(num3);
		        
		        int intYTotal = Integer.parseInt(y);
		        int numTotal = intX * intYTotal;
		        System.out.println(numTotal);
		        */
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String y = sc.next();
		sc.close();
		
		System.out.println(x * (y.charAt(2) - '0'));
		System.out.println(x * (y.charAt(1) - '0'));
		System.out.println(x * (y.charAt(0) - '0'));
		System.out.println(x * Integer.parseInt(y));

	}

}
