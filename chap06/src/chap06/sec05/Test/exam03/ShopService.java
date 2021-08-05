package chap06.sec05.Test.exam03;

public class ShopService {
	private static ShopService singleton = new ShopService(); 
	
	static ShopService getInstance() {
		return singleton;
	}
}
