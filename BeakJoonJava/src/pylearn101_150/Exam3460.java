package pylearn101_150;

import java.util.*;

public class Exam3460 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for(int i=0; i<t; i++) {
			String result = "";
			int n = Integer.parseInt(sc.nextLine());
			String bin=Integer.toBinaryString(n);
			for(int j=bin.length()-1;j>=0;j--) {
                if(bin.charAt(j)=='1') {
                    System.out.print(bin.length()-j-1+" ");
                }                    
            }
			System.out.println();
		}

	}

}
