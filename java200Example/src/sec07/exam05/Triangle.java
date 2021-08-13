package sec07.exam05;

public class Triangle {

	static void putChar(int n, char c) {
		for(int i=0; i<=n; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	static void putStart(int n) {
		System.out.println("*을 이용해 삼각형 만들기");
		if(n<=0) {
			System.out.println("입력된 값이 0 이하 입니다.");
		}
		for(int i=0; i<n; i++) {
			putChar(i, '*');
		}
	}
}