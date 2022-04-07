package information_processing_engineer.test2101;

class SuperClass {
	SuperClass() {
		System.out.print("Super");
	}
}

class SubClass extends SuperClass {
	SubClass() {
		System.out.print("Sub");
	}
}

public class Exam03 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		@SuppressWarnings("unused")
		SuperClass s = new SubClass();
	}

}
