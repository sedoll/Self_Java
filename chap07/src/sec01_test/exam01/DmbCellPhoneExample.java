package sec01_test.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// 자식 객체를 생성할 때 부모 객체가 먼저 생성되고 그 다음 자식 객체가 생성
 		DmbCellPhone dcp = new DmbCellPhone("java", "black", 10);
		System.out.println(dcp.model);
		System.out.println(dcp.color);
		System.out.println(dcp.channel);
		
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("여보세요");
		dcp.receiveVoice("저는 홍길동입니다.");
		dcp.sendVoice("반갑습니다.");
		dcp.hangUp();
	}

}
