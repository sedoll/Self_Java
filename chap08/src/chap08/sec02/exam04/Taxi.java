package chap08.sec02.exam04;

public class Taxi implements Vehicle{
	@Override
	public void run() {
		System.out.println("�ýð� �޸��ϴ�.");	
	}
	
	public void checkFare() {
		System.out.println("�ý� ����� üũ�մϴ�.");
	}
}