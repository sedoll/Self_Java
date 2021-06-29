package sec01.exam03;

public class Test1 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int z = 7;
		System.out.println("x의 값: " + x + ", y의 값: " + y + ", z의 값: " + z); //순서 변경x
		
		int temp = x;
		x = y;
		y = z;
		z = temp;
		System.out.println("x의 값: " + x + ", y의 값: " + y + ", z의 값: " + z); //순서가 변경됨

	}

}
