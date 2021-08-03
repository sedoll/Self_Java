package chap06.sec04.exam03;

public class Car {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) { //입력받은 가스를 필드에 저장
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas <= 0) {
			System.out.println("gas가 없습니다.");
			return false;
		} 
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas잔량: " + gas + ")");
				gas--;
			} else {
				System.out.println("멈춥니다. (gas잔량: " + gas + ")");
				return; //프로그램 종료로 사용된 return
			}
		}
	}
}
