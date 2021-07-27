package sec03.test3;
//열거타입
import sec03.test.LoginResult;

public class Main {

	public static void main(String[] args) {
		LoginResult result = LoginResult.SUCCESS;
		if(result == LoginResult.SUCCESS) {
			System.out.println("로그인에 성공하였습니다.");
		} else if (result == LoginResult.FAIL_ID) {
			System.out.println("로그인 실패 아이디가 틀렸습니다.");
		} else if (result == LoginResult.FAIL_PASSWORD) {
			System.out.println("로그인 실패 비밀번호가 틀렸습니다.");
		} 

	}

}
