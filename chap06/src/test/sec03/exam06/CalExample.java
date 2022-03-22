package test.sec03.exam06;

public class CalExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int result1 = cal.squ(5);
		cal.println("≥–¿Ã: " + result1);
		
		int result2 = cal.squ(5, 10);
		cal.println("≥–¿Ã: " + result2);

	}

}
