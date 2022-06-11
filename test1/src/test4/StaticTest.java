package test4;

public class StaticTest {
	public static int static_ins;
	public int ten = 10;
	
	public static int cal(int a, int b) {
		StaticTest st = new StaticTest();
		return a + b + static_ins++ + st.ten;
	}
}
