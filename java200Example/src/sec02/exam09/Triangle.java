package sec02.exam09;
//사각형의 넓이 구하기
import java.util.*;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형의 넓이 구하기");
		
		System.out.print("밑변의 길이를 입력하세요> ");
		double x = sc.nextDouble();
		System.out.print("높이의 길이를 입력하세요> ");
		double y = sc.nextDouble();
		
		double sum = x * y * 0.5;
		System.out.printf("삼각형의 넓이는 %.2f 입니다.", sum);
		

	}

}
