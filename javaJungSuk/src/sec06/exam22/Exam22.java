package sec06.exam22;

public class Exam22 {
	
	public static boolean isNumber(String str) {
		 boolean isNumeric =  str.matches("[+-]?\\d*(\\.\\d+)?");
		 if(isNumeric) {
			 return true;
		 } else {
			 return false;
		 }
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(isNumber(str));
		
		str = "123o";
		System.out.println(isNumber(str));

	}

}
