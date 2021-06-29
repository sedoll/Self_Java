package sec01.exam04;
//로컬변수(지역변수)
public class VariableScopeExample {

	public static void main(String[] args) {
		
		int v1 = 9; //int형으로 초기값이 15인 v1변수 선언
		if(v1>10) { //조건문 v1이 10 미만일 때 실행
			
			int v2; //int형인 v2변수 선언
			v2= v1 - 10; //v2는 v1에서 10을 뺀 값이다 라고 선언
		
		} // end if(v1>10), 여기 안에서 v2가 선언되었으므로 14줄에 있는 v3에서 오류가 뜬다
		
			//int v3 = v1 + v2 + 5;

	}

}
