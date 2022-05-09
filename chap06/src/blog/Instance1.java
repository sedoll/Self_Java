package blog;

public class Instance1 {
	String x, y;
	
	Instance1(String x, String y) {
		this.x = x;
		this.y = y;
	}
	
	String instance1() {
		return x + y;
	}
}
