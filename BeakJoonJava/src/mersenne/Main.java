package mersenne;

public class Main {
	public static void main(String[] args) 
	{
		/*
		1~100 사이의 정수 중 소수를 구하여 출력
		소수인지 검사하여 소수여부를 리턴하는 메소드를 제작
		*/
		for (int i = 2 ; i <= 100 ; i++ )
		{
			if (isPrime(i))
			{
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int n){
		// 매개변수로 받은 n이 소수인지 여부를 검사하여 리턴하는 메소드
		int q;
		boolean chk = true;
		for (int i = 2; i < n ; i++ )
		{
			q = n % i;

			if (q == 0)
			{
				chk = false; // 나누어 떨어질 경우 소수가 아님.
				break;
			} else {
				chk = true; // 모든 수로 나누었을 때 나누어 떨어지지 않는다면 소수.
			}
		}
		return chk;
	}
}
