package sec02.exam11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		
		int score = 65;
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : 
			(score > 70) ? 'C' : (score > 60) ? 'D' : 'F'; //다항 연산자
		System.out.println(score + "점은 " + grade + "등급입니다.");

	}

}
