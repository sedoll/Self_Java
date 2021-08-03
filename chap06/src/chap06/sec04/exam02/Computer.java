package chap06.sec04.exam02;

public class Computer {
	//필드
	//생성자
	//메소드
	int sum1(int[] values) { //배열의 요소를 모두 더한 값을 리턴
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	long mul(int[] values) {
		long mul = 1L;
		for(int i=0; i<values.length; i++) {
			mul *= values[i];
		}
		return mul;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
