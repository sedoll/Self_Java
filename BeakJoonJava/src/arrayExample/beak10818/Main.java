package arrayExample.beak10818;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array;
		int x = sc.nextInt();
		int min = 1000000;
		int max = -1000000;
		array = new int[x];
		
		for(int i=0; i<x; i++) {
			array[i] = sc.nextInt();
			if(min > array[i]) {
				min = array[i];
			} else if(max < array[i]) {
				max = array[i];
			}
		}

		System.out.println(min);
		System.out.println(max);
	}

}