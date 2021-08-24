package sec08.exam03;

public class Car {
	private String name; // 이름
	private String number; //번호
	private int width; //폭
	private int height; //높이
	private int linear; //길이
	private double x; //x좌표
	private double y; //y좌표
	private double tank; //탱크용량
	private double fuelRemain; //남은연로
	private double fuelEfficiency; //연비
	
	Car(String name, String number, int width, int height, int linear, double x , 
			double y, double tank, double fuelEfficiency, double fuelRemain){
		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.linear = linear;
		this.x = x;
		this.y = y;
		this.tank = tank;
		this.fuelEfficiency = fuelEfficiency;
		this.fuelRemain = fuelRemain;
	}

	public void getX() {
		System.out.println("현재 x좌표: " + x);
	}

	public void setXMove(double x) {
		System.out.println("x 방향으로 움직이기");
		this.x += x;
		this.fuelRemain -= 100;
	}

	public void getY() {
		System.out.println("현재 y좌표: " + y);
		
	}

	public void setYMove(double y) {
		System.out.println("y 방향으로 움직이기");
		this.y += y;
		this.fuelRemain -= 100;
	}

	public boolean getFuelRemain() {
		if(this.fuelRemain < 0) {
			this.fuelRemain = 0;
			System.out.println("남은 연료> " + this.fuelRemain + " L");
			return false;
		}
		System.out.println("남은 연료> " + this.fuelRemain + " L");
		return true;
	}
	
	public void setFuelRemain(double fuelRemain) {
		System.out.println("급유");
		this.fuelRemain += fuelRemain;
		if(tank < this.fuelRemain) {
			this.fuelRemain = tank;
			System.out.println("급유가 다 되었습니다.");
			System.out.println("기름이 최대치 입니다.> " + this.fuelRemain + " L");
		} else {
			System.out.println("급유가 다 되었습니다.> " + this.fuelRemain + " L");
		}
	}
	
	public void spec() {
		System.out.println("이름: " + name);
		System.out.println("번호: " + number);
		System.out.println("폭: " + width);
		System.out.println("높이: " + height);
		System.out.println("길이: " + linear);
		System.out.println("현재 x좌표: " + x);
		System.out.println("현재 y좌표: " + y);
		System.out.println("탱크용량: " + tank);
		System.out.println("남은연료: " + fuelRemain);
		System.out.println("연비: " + fuelEfficiency);
	}
	
}