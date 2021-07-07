package sec02.exam04;
//실수를 이용한 for문
public class ForFloatCounterExample {

	public static void main(String[] args) {
		
		/*
		 * 9번 실행
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
		*/
		
		//10번 실행
		for(double x=0.1; x<=1.0; x+=0.1) {
			System.out.println(x);
		}
		
	}

}
