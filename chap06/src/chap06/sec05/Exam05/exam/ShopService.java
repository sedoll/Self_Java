package chap06.sec05.Exam05.exam;

public class ShopService {
	private static ShopService ss = new ShopService();

	static ShopService getInstance() {
		return ss;
	}
}
