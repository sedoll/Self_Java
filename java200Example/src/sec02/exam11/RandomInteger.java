package sec02.exam11;

public class RandomInteger {

	public static void main(String[] args) {
		int x = (int) ((Math.random() * 9) +1);
		int y = (int) ((Math.random() * -9) -1);
		int z = (int) ((Math.random() * 99) +10);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
