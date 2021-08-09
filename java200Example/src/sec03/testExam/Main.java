package sec03.testExam;
//내 예상대로 되긴 했지만 신기하다 ㅋㅋㅋ
public class Main {

	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		int c = 5;
		
		System.out.println("a = b = c 출력: " + (a = b = c));
		System.out.println("c = b = a 출력: " + (c = b = a));
	}

}
