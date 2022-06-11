package sec06.Exam24;

public class Exam24 {
	
	public static int abs(int a) {
		return (a < 0) ? -a : a;
	}

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값 : " + abs(value));
		value = -10;
		System.out.println(value + "의 절대값 : " + abs(value));

	}

}
