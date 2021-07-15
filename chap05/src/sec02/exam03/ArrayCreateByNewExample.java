package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		System.out.println("[정수형 배열]");//정수형 배열
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			//처음에 배열을 선언할 때 아무값도 주지 않았으므로 모두 0으로 초기화 됨
			System.out.printf("arr[%1$d]: %2$d\n",i ,arr1[i]);
		}
		System.out.println("");
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			//각 배열에 넣어준 값이 출력됨
			System.out.printf("arr[%1$d]: %2$d\n",i ,arr1[i]);
		}
		System.out.println("");
		
		System.out.println("[실수형 배열]");//실수형 배열
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			//처음에 배열을 선언할 때 아무값도 주지 않았으므로 모두 0으로 초기화 됨
			System.out.printf("arr[%d]: %.2f\n",i ,arr2[i]);
		}
		System.out.println("");
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			//처음에 배열을 선언할 때 아무값도 주지 않았으므로 모두 0으로 초기화 됨
			System.out.printf("arr[%d]: %.2f\n",i ,arr2[i]);
		}
		System.out.println("");
		
		System.out.println("[문자열 배열]");//문자열 배열
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			//처음에 배열을 선언할 때 아무값도 주지 않았으므로 모두 0으로 초기화 됨
			System.out.printf("arr[%d]: %s\n",i ,arr3[i]);
		}
		System.out.println("");
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			//처음에 배열을 선언할 때 아무값도 주지 않았으므로 모두 0으로 초기화 됨
			System.out.printf("arr[%d]: %s\n",i ,arr3[i]);
		}
	}

}
