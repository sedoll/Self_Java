package sec01.exam03;

public class Computer extends Calculator{
	@Override //메소드 재정의가 잘 됐는지 검사하는 코드
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
