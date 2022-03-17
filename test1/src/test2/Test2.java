package test2;

public class Test2 {

	public static void main(String[] args) {
//		String s = "OH";
//		System.out.println(s.equals(null));
		
		String[] oldArr = {"java", "array", "copy"};
		String[] newArr = new String[5];
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
		
		for(int i=0; i<newArr.length; i++) {
			System.out.println(newArr[i]);
		}

	}

}
