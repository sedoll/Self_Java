package arrayExample.beak10818;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array;
		int x = sc.nextInt();
		array = new int[x];
		
		for(int i=0; i<x; i++) {
			array[i] = sc.nextInt();
		}
        
        Arrays.sort(array);
		System.out.println(array[0]);
		System.out.println(array[x-1]);
	}

}