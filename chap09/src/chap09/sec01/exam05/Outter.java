package chap09.sec01.exam05;

public class Outter {
	String field = "Outter - field";
	void method() {
		System.out.println("Outter - method");
	}
	
	class Nested { // ÁßÃ¸ Å¬·¡½º
		String field = "Nested - field";
		void method() {
			System.out.println("Nested - method");
		}
		
		void print() {
			System.out.println(this.field); // Nested ÀÇ field¸¦ °¡Á®¿È
			this.method();
			System.out.println();
			
			System.out.println(Outter.this.field); // OutterÀÇ field¸¦ °¡Á®¿È
			Outter.this.method();
		}
	}
}
