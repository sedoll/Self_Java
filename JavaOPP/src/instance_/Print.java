package instance_;

public class Print {
	private String s1 = "";
	
	Print(String s1) {
		this.s1 = s1;
	}
	
	public void A() {
		System.out.println(s1);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(s1);
		System.out.println("B");
		System.out.println("B");
	}
}