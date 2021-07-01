package sec04.exam02;

public class KeyCodeExample {
	// throws Exception 입력코드 에러 예외?
	public static void main(String[] args) throws Exception { 
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);

		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
	}

}
