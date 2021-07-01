package sec02.exam06;
//문자열 결합 연산자
public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0; //문자가 처음에 연산되면서 문자결합연산이됨
		String str2 = str1 + "특징"; //문자가 처음에 연산되면서 문자결합연산이됨
		System.out.println(str2); //문자결합이된 순으로 출력이 됨
		
		String str3 = "JDK" + 3 + 3.0; //문자가 처음에 연산되면서 문자결합연산이됨
		String str4 = 3 + 3.0 + "JDK"; //처음에 3 + 3.0은 사칙연산으로 적용되어 6.0이 되고
		//JDK가 문자이기 때문에 6.0 + "JDK"는 문자결합연산이 된다
		System.out.println(str3);
		System.out.println(str4);

	}

}
