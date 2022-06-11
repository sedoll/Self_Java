package sec03.exam02.test;

public class Example {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());

	}
	
	public static void method(HttpServlet hs) {
		hs.service();
	}

}
