package sec03.test2;

public class Main {

	public static void main(String[] args) {
		LoginResult result = LoginResult.SUCCESS; //열거 변수 선언, 열거 상수의 값에 따라 출력값이 변함
		
		if(result == LoginResult.SUCCESS) {
			System.out.println("로그인에 성공했습니다.");
		} else if(result == LoginResult.FAIL_ID) {
			System.out.println("로그인 실패 \n아이디가 틀렸습니다.");
		} else if(result == LoginResult.FAIL_PASSWORD) {
			System.out.println("로그인 실패 \n비밀번호가 틀렸습니다.");
		}

	}
}