package sec02.exam09;
//논리 연산자 and, or, xor
public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if((charCode>=65) & (charCode<=90)) { //앞이 false여도 뒤의 모든 논리 연산을 확인
			System.out.println("대문자 이군요.");
		}
		
		if((charCode>=97) && (charCode<=122)) { //앞이 false이면 뒤에 있는 모든 연산을 스킵
			System.out.println("소문자 이군요.");
		}
		
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("소문자 이군요.");
		}
		
		int value = 6;
		
		if((value%2 == 0) | (value%3 == 0)) { //앞이 true여도 뒤의 모든 논리 연산을 확인
			System.out.println("2 또는 3의 배수 이군요.");
		}
		
		if((value%2 == 0) || (value%3 == 0)) { //앞이 true이면 뒤에 있는 모든 연산을 스킵
			System.out.println("2 또는 3의 배수 이군요.");
		}

	}

}
