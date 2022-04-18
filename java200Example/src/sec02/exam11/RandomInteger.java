// 랜덤 함수
package sec02.exam11;

public class RandomInteger {

	public static void main(String[] args) {
		int x = (int) ((Math.random() * 9) +1); // 1이상 9이하의 값 랜덤 생성
		int y = (int) ((Math.random() * -9) -1); // -9이상 -1이하의 값 랜덤 생성
		int z = (int) ((Math.random() * 90) +10); // 10이상 99이하의 값 랜덤 생성
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
