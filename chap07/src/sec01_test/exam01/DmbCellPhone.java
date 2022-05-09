package sec01_test.exam01;

public class DmbCellPhone extends CellPhone{ // dmb 기능 제공 휴대폰
	// 필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel) {
		super(); // 부모 클래스의 생성자 실행, 이건 안써도 실행하면 자동으로 생성된다.
		this.model = model; // 부모 클래스로 부터 물려받은 필드
		this.color = color; // 부모 클래스로 부터 물려받은 필드
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
