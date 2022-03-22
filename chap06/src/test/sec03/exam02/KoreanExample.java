package test.sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "011225-1234567");
		Korean k2 = new Korean("김자바", "950110-1234320");
		
		System.out.println(k1.nation +" "+ k1.name +" "+ k1.ssn);
		System.out.println(k2.nation +" "+ k2.name +" "+ k2.ssn);
	}

}
