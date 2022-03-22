package test.sec03.exam01;

public class Car {
	//필드
	//생성자
	Car(String color, int cc) { // 자동차의 색깔, 배기량을 매개변수로 입력받음
		System.out.println(color);
		System.out.println(cc);
		System.out.println(color + "색의 " + cc + "cc 자동차가 생성됨");
		
	}
}
