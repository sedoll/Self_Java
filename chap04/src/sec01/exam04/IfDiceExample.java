package sec01.exam04;
// 랜덤 주사위 출력
public class IfDiceExample {

	public static void main(String[] args) {
		System.out.println(Math.random());//0과 1사이의 난수 발생
		System.out.println(Math.random()*6); //0.0에서 6.0사이의 난수 발생
		int num = (int) ((Math.random()*6)+1); //1 ~ 6의 난수 발생
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}

}
