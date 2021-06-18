package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		int v1 = 9; //int형으로 초기값이 15인 v1변수 선언
		int v2;
		if(v1>10) { //조건문 v1이 10 미만일 때 실행
			//int v2; //int형인 v2변수 선언, 근데 여기에 v2를 선언하면 v3에서 오류가 뜨기 때문에 
					//밖에다가 변수를 선언해야 한다.
			v2= v1 - 10; //v2는 v1에서 10을 뺀 값이다 라고 선언
			int v3 = v1 + v2 + 5; //
			System.out.println(v3);
		}
		
		else
		{
			v2 = 3;
			int v3 = v1 + v2 + 5; //
			System.out.println(v3);
		}
	}

}
