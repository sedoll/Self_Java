package chap06.sec06.exam02.mycompany;

import chap06.sec06.exam02.hyndai.Engine;
import chap06.sec06.exam02.hankook.SnowTire;
import chap06.sec06.exam02.kumho.BigWidthTire;
/*
 * 다른패키지에 같은 이름의 클래스가 있을 경우 
 * import 하지 않고 바로 객체를 선언할 때 이름을 import 할때 처럼 바꿔준다.
 */

public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	chap06.sec06.exam02.hankook.Tire tire3 = new chap06.sec06.exam02.hankook.Tire();
	chap06.sec06.exam02.kumho.Tire tire4 = new chap06.sec06.exam02.kumho.Tire();
}
