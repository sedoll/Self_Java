package chap06.sec05.Exam05.exam;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}

}
