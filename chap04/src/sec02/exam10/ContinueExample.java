package sec02.exam10;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) { //짝수가 아닐때 
				continue; //for로 되돌아가서 다시 실행,
						 // 홀수는 밑으로 내려가지 못하면서 출력 x
			}
			System.out.println(i); //짝수만 출력
		}

	}

}
