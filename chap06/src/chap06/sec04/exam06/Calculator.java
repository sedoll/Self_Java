package chap06.sec04.exam06;
//메소드 오버라이딩
public class Calculator {
	//필드
	//생성자
	//메소드
	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
