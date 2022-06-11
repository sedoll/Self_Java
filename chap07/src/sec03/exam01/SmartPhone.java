package sec03.exam01;

public class SmartPhone extends Phone{ // 추상 클래스를 상속하는 자식 클래스
	// 생성자
	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}
	
	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
		
	}

}
