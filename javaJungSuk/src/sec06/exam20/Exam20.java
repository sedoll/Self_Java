package sec06.exam20;

import java.util.*;

public class Exam20 {
	
	public static int[] shuffle(int[] arr) {
		int i = 0;
		int[] r = new int[arr.length];	
		Random rd = new Random();
		while(i < arr.length) {
			int index = rd.nextInt(9);
			int temp = arr[index];
			if(temp != 0) {
				r[i] = temp;
				arr[index] = 0;
				i++;
			}
		}
		return r;
		
	}
	
	public static void main(String args[]) {
		int[] o = { 1, 2, 3, 4, 5, 6, 7 ,8 ,9};
		System.out.println(java.util.Arrays.toString(o));
		
		int[] r = shuffle(o);
		System.out.println(java.util.Arrays.toString(r));
	}
}
