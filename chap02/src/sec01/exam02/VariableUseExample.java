package sec01.exam02;

public class VariableUseExample {

	public static void main(String[] args) {
		//들여쓰기 할 때는 tap을 눌러라
		int hour = 3; //변수는 소문자로
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute; //두 문자가 합쳐진 경우에는 앞자리를 대문자로 구분
		System.out.println("총" + totalMinute + "분");
	}

}
