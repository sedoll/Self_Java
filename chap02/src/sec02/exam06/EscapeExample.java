package sec02.exam06;
//탈출 문자
public class EscapeExample {

	public static void main(String[] args) {
		
		System.out.println("번호\t이름\t직업"); //tab 만큼 간격으로 띄어서 한 줄에 출력
		System.out.println("번호\n이름\n직업"); //행마다 떨어뜨려서 출력, ln도 똑같은 효과임
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\"입니다."); // "같은 걸 출력할 때 \"라고 쓴다.
		System.out.println("봄 \\ 여름 \\ 가을 \\ 겨울"); // \을 출력할 때 사용

	}

}
