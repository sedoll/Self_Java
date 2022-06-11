package week1;

public class MyOPP {
	
	public static String s1 = "";

	public static void main(String[] args) {	
		s1 = "----";
		printA();
		printA();
		printB();
		printB();
		
		s1 = "****";
		printA();
		printA();
		printB();
		printB();

	} 

	private static void printA() {
		System.out.println(s1);
		System.out.println("A");
		System.out.println("A");
	}
	
	private static void printB() {
		System.out.println(s1);
		System.out.println("B");
		System.out.println("B");
	}

}
