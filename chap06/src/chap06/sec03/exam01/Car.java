package chap06.sec03.exam01;

public class Car {
	//필드 선언
	//생성자 선언
	/*
	Car() { //매개 변수가 없는 생성자 선언, 사용할 때 매개값이 없어도 에러 안뜸
		
	}
	*/
	
	Car(String color, int cc) { //매개 변수가 있는 생성자 선언
		System.out.println(color);
		System.out.println(cc);
		System.out.println(color + "색의 " + cc + "cc 자동차가 생성됨");
	}
}
