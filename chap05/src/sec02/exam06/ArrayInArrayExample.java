package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3]; //2행 3열의 이차원 배열 선언
		mathScores[1][2] = 10;
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("mathScores[%d][%d] = %d\n", i, j, mathScores[i][j]);
			}
		}
		
		System.out.println();
		
		int[][] englishScores = new int[2][]; //행을 먼저 선언하여 계단식 배열 만들기
		englishScores[0] = new int[2]; // 0, 1만 되므로 2는 사용할 수 없기에 오류가 뜬다.
		englishScores[1] = new int[3];
		englishScores[0][1] = 500;
		for(int i=0; i<englishScores.length; i++) {
			//for(int j=0; j<3; j++)
			for(int j=0; j<englishScores[i].length; j++) {
				System.out.printf("englishScores[%d][%d] = %d\n", i, j, englishScores[i][j]);
			}
		}
		
		System.out.println();
		
		int[][] javaScores = {{95, 80}, {92, 96, 80}}; //값목록으로 생성한 계단식구조 배열 
		for(int i=0; i<javaScores.length; i++) {
			for(int j=0; j<javaScores[i].length; j++) {
				System.out.printf("englishScores[%d][%d] = %d\n", i, j, javaScores[i][j]);
			}
		}
	}

}
