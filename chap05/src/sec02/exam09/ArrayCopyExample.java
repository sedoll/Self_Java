package sec02.exam09;
// 배열 복사를 이용한 복사
public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		System.out.println("-----oldStrArray-----");
		for(int i=0; i<oldStrArray.length; i++) {
			System.out.printf("newStrArray[%d]: %s\n", i, oldStrArray[i]);
		}
		System.out.println();
		
		System.out.println("-----newStrArray-----");
		for(int i=0; i<newStrArray.length; i++) {
			System.out.printf("newStrArray[%d]: %s\n", i, newStrArray[i]);
		}

	}

}
