package sec02.exam06;
//while문을 이용한 1~100까지 더해서 출력
public class WhileSumForm1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + "합: " + sum);

	}

}
