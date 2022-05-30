package sec09.Test;

import java.util.Scanner;

class Int {
	private int v;
	public Int(int v) {
		this.v = v;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
}

public class IntTester {
	public static int compare(int x, int y) {
		if (x > y) { // x가 큰경우
			return 1;
		} else if(x < y) { // y가 큰경우
			return -1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("b = ");
		int b = Integer.parseInt(sc.nextLine());
		int balance = compare(a, b);
		if (balance == 1) {
			System.out.println("a가 크다.");
		} else if ( balance == -1) {
			System.out.println("b가 크다.");
		} else {
			System.out.println("a와 b가 같다.");
		}
		
		Int[] intA = {new Int(1), new Int(2), new Int(3), new Int(4), new Int(5)};
		Int[][] intB = new Int[2][];
		intB[0] = new Int[]{new Int(1), new Int(2), new Int(3)};
		intB[1] = new Int[]{new Int(5), new Int(6), new Int(7), new Int(8)};

	}

}
