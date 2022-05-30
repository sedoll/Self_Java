package sec02.test.exam02;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire s = new SnowTire();
		Tire t = s;
		
		s.run();
		t.run();

	}

}
