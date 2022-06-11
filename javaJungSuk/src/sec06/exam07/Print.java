package sec06.exam07;

public class Print {
	int x;
	int y;
	
	Print(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int x1, int y1) {
		return Math.sqrt((double) Math.pow(x1-x, 2) + Math.pow(y1-y, 2));
	}
}

class Example {
	public static void main(String args[]) {
		Print p = new Print(1, 1);
		System.out.println(p.getDistance(2, 2));
	}
}