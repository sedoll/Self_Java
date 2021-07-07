package test04.exam02;
// 2번문제, 1~100의 정수중에서 3의 배수의 총합구하기
public class Main1 {
	public static void main(String[] args) {
		int i;
		int result = 0;
		for(i=1; i<=100; i++) {
			if(i%3==0) {
				result += i;
			}
		}
		System.out.println("1~" + (i-1) +"의 정수중에서 3의 배수의 총합: " + result);
	}
}
