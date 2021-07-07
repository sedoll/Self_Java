package sec02.exam08;
//break를 이용한 while문 종료
public class BreakExample {

	public static void main(String[] args) throws Exception{
		while(true) {
			int num = (int)(Math.random()*6) +1; //1~6사이의 난수 발생
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		System.out.println("포르그램 종료");

	}

}
