package sec08.test01;

public class AbcTester {

	public static void main(String[] args) {
		Abc x = new Abc(1, 2, 3);
		Abc y = new Abc(2, 4, 6);
		int xs = x.getSum();
		int ys = y.getSum();
		
		System.out.print("x: ");
		x.print();
		System.out.println("x sum: "+xs);
		
		System.out.print("\ny: ");
		y.print();
		System.out.println("y sum: "+ys);
	}

}
