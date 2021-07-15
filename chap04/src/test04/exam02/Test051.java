package test04.exam02;

public class Test051 {
	public static void main(String[] args) {
		/*
		String n = "*";
		for(int i=1; i<=4; i++) {
			System.out.println(n);
			n += "*";
		}
		*/
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i>=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}
}
