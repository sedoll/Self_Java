package test1;

public class Child extends Parents{
	@Override
	int compute(int num) {
		if(num <= 1) {
			return num;
		}
		return compute(num-1) + compute(num-3);
	}
}
