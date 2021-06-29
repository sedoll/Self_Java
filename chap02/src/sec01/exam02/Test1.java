package sec01.exam02;

public class Test1 {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60) + minute; //시간을 분으로 환산하여 나타냄
		System.out.println(totalMinute);

	}

}
