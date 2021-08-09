package sec02.exam10;
// 구의 겉넓이, 부피 구하는 코딩
import java.util.*;

public class Globe {
	static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구의 반지름을 입력하세요.> ");
		double r = sc.nextDouble();
		double area = 4 * PI * r * r;
		double volume = (4/3) * PI * r * r * r;
		
		System.out.printf("구의 겉넓이: %.3f m^2\n", area);
		System.out.printf("구의 부피:  %.3f m^3\n", volume);

	}

}
