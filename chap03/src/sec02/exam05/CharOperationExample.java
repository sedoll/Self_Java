package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		int c3 = 1 + c2;
		//char c3 = (char) (c1 + c2);
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + (char)c3);

	}

}
