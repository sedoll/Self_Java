package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		//지금 현재 두 변수는 같은 객체를 참조하는 변수이다.
		
		if(strVar1 == strVar2) { //==은 객체의 참조 번지가 같은지를 확인
			System.out.println("같은 객체를 참조함");
		} else {
			System.out.println("같은 객체를 참조하지 않음");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("문자열이 같음");
		}
		
		String strVar3 = new String("심민철");
		String strVar4 = new String("심민철");
		//new로 새로운 객체를 만들어 참조를 하므로 1,2 / 3 / 4는 문자열은 같지만 서로 다른 객체를 참조한다.
		
		if(strVar3 == strVar4) { //==은 객체의 참조 번지가 같은지를 확인
			System.out.println("같은 객체를 참조함");
		} else { //3, 4는 서로다른 객체를 참조하므로 false가 된다.
			System.out.println("같은 객체를 참조하지 않음");
		}
		
		if(strVar3.equals(strVar4)) { //3, 4는 서로 다른 객체를 참조하지만 문자열은 같으므로 true가 된다.
			System.out.println("문자열이 같음");
		}
	}

}
