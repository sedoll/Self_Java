package sec02.exam07;
//객체를 참조(문자열)하는 배열
public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		//0과 1은 같은 객체 번지를 공유한다
		strArray[0] = "Java";
		strArray[1] = "Java";
		
		//2는 new로 새로 만들었기 때문에 0, 1이랑은 다른 객체 번지를 이용한다.
		strArray[2] = new String("Java");
		
		//==은 String에서 객체 번지가 같은지를 비교하는데 사용한다.
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		
		//equals는 String에서 객체의 내용이 같은지를 비교하는데 사용한다.
		System.out.println(strArray[0].equals(strArray[2]));

	}

}
