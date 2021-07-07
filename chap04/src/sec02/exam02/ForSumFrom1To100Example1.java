package sec02.exam02;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		for(i=1; i<=100; i++) {
			sum += i;
		} //여기내에서 i는 1~100이다 
		//여기로 나오면서 i는 100을 초과한 101이 되면서 나오므로 100을 만들어 줄때 -1을 해준다
		System.out.println("1~" +(i-1) + "합: "+sum);
	}

}
