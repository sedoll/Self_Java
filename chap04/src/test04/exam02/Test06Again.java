package test04.exam02;

public class Test06Again {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=4; j>0; j--) {
				if(j>i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

	}

}
