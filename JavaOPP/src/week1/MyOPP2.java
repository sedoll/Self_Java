package week1;

public class MyOPP2 {

	public static void main(String[] args) {	
		Print.s1 = "----";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
		
		Print.s1 = "****";
		Print.A();
		Print.A();
		Print.B();
		Print.B();

	}
	
}

class Print {
	public static String s1 = "";
	public static void A() {
		System.out.println(s1);
		System.out.println("A");
		System.out.println("A");
	}
	
	public static void B() {
		System.out.println(s1);
		System.out.println("B");
		System.out.println("B");
	}
}



