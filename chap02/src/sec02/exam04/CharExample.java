package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		
		//영어
		char c1 = 'A'; //char 타입은 문자를 초기화 할 때 작은 따옴표 ' '을 쓴다
		// 유니코드를 통해 하는 것은 그냥 알아두는 것만 하자, 별로 안쓴다고 한다.
		char c2 = 65; //65의 번호를 갖고 있는 유니코드 문자를 출력
		char c3 = '\u0041'; //16진수로 표현된 유니코드를 c3에 초기화, 실제로 많이 안 쓴다고 함
							//0041 = 0 + 0 +64(16*4) + 1 = 65
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//한글
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uAC00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		

	}

}
