package chap06.sec06.exam06;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	//메소드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}

	}
	public boolean isStop() { //boolean 타입의 메소드는 is로 시작ㄴ
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop) {
			System.out.println("차가 멈춥니다.");
			speed = 0;
		} else {
			System.out.println("차가 계속 달립니다.");
		}
	}
	
}