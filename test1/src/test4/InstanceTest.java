package test4;

public class InstanceTest {
	private int ins;
	
	InstanceTest(int ins) {
		this.ins = ins;
	}
	
	public int cal(int a, int b) {
		return a + b + ins;
	}
}
