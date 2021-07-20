package sec02.exam08;
//for문을 이용한 복사
public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.printf("newIntArray[%d] = %d\n", i, newIntArray[i]);
		}
	}

}
