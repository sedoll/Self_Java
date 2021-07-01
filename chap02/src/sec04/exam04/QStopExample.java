package sec04.exam04;
//q를 이용해 프로그램 종료
public class QStopExample {

	public static void main(String[] args) throws Exception{
		
		int keyCode;
		boolean proExit = true;
		
		while(proExit) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113 || keyCode == 81) {
				proExit = false;
			}
		}
		
		System.out.println("종료");
	}

}
