package sec02.exam05;
//for문을 이용한 구구단
public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for(int n=2; n<=9; n++) {
			System.out.println("*** " + n +"단 ***");
			for(int m=1; m<=9; m++) {
				System.out.println(n + "x" + m + "=" + (n*m));
			}
		}

	}

}
