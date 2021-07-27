package forExample.star1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String star = "";
		int x = sc.nextInt();
		for(int i=0; i<x; i++) {
			star +="*";
			System.out.println(star);
		}

	}

}
