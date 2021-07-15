package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) { 
		
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0); //프로그램 종료 코드, 0은 정상종료를 뜻함
		} else {
			String strNum1 = args[0];
			String strNum2 = args[1];
			
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			
			int result = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + result);
		}
		

	}

}
