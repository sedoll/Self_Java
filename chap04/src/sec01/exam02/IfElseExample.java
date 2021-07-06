package sec01.exam02;
//if, else문 예제
public class IfElseExample {

	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) { //score가 90을 넘지 않으므로 실행x
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else { //score가 85이므로 실행이 된다.
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		} 
		System.out.println("종료");
		
	}

}
