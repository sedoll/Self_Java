package test3;

public class Test6_115 {

	public static void main(String[] args) {
		int i, j;
		int temp;
		int[] a = {14, 22, 53, 45, 1};
		
		for(i=0; i<4; i++) {
			for(j=0; j<4-i; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			for(int k=0; k<a.length; k++) {
				System.out.print(a[k] + " ");
			}
			System.out.println();
		}
		for(i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
