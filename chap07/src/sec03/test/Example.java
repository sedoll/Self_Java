package sec03.test;

public class Example {

	public static void main(String[] args) {
		method(new Login());
		method(new FileDown());

	}
	
	public static void method(HttpServlet s) {
		s.service();
	}

}
