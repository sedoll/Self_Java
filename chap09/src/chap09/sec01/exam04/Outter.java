package chap09.sec01.exam04;

public class Outter {
	public void method1(int arg) { // final 특성을 가짐
		int localVariable = 1; // final 특성을 가짐
		
		// arg = 100
		// localVariable = 100;
		
		class Inner { // 로컬클래스에서 매개변수는 final 특성을 가지기에 값을 변경하면 오류가 뜬다.
			void method() {
				int result = arg + localVariable;
			}
		}
	}
}
