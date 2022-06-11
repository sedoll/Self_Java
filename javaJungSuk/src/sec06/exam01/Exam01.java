package sec06.exam01;

public class Exam01 {
	int num;
	boolean isKwang;
	
	public Exam01() {
		num = 1;
		isKwang = true;
	}
	
	public Exam01(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String info() {
		return num + (isKwang ? "K" : "");
	}
}
