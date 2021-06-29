package sec01.exam03;
//변수를 이용한 위치 이동
public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:"+ x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:"+ x + ", y: " + y);

	}

}
