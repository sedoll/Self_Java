package sec01.exam02;

public class NullExample {

	public static void main(String[] args) {
		/*
		String hobby = null;
		//String hobby = "축구"; //이렇게 값이 주어져 있어야 에러가 발생하지 않음
		System.out.println(habby.length()); //nullpoint에러 발생
		*/
		
		String name = "홍자바";
		name = null;
		//name이 참조하고 있던 홍자바를 없애고 null(아무것도없는값)으로 저장
		//홍자바는 쓰레기 객체가 되어버리면서 쓰레기 수집기가 홍자바를 없애면서 메모리에서 제거
	}

}
