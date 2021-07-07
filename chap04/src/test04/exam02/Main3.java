package test04.exam02;
//두 주사위의 합이 5일때 종료
public class Main3 {

	public static void main(String[] args) {
		int result = 0;
		
		while(result != 5) {
			int dice1 = (int) (Math.random()*6) + 1;
			int dice2 = (int) (Math.random()*6) + 1;
			result = dice1 + dice2;
			System.out.printf("(%1$d, %2$d) 주사위 눈의 합: %3$d\n", dice1, dice2, result);
		}
		
		System.out.println("\n두 주사위의 합이 5인 경우가 나왔습니다. \n시스템을 종료합니다.");
	}

}