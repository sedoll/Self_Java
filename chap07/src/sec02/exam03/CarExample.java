package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();
//		mycar.frontR = new HankookTire("frontR", 50);
//		mycar.backL = new KumhoTire("backL", 60);
		for(int i=1; i<=5; i++) {
			System.out.println("----------"+i+"회전-----------");
			int problemLocation = mycar.run();
			switch(problemLocation) {
			case 1:
				System.out.println("frontL 한국Tire로 교체");
				mycar.frontL = new HankookTire("frontL", 15);
				break;
			case 2:
				System.out.println("frontR 금호Tire로 교체");
				mycar.frontR = new KumhoTire("frontR", 13);
				break;
			case 3:
				System.out.println("frontL 한국Tire로 교체");
				mycar.backL = new HankookTire("backL", 14);
				break;
			case 4:
				System.out.println("frontL 한국Tire로 교체");
				mycar.backR = new KumhoTire("backR", 17);
				break;
			}
			
			System.out.println("-------------------------");
		}

	}

}
