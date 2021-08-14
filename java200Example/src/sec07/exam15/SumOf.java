package sec07.exam15;

public class SumOf {
	Main in = new Main();
	int x;
	int[] arr;
	
	public void sumOf(int x) {
		this.x = 0;
		arr = new int[x];
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]의 값을 입력하세요.: ", i);
			arr[i] = in.sc.nextInt();
			this.x += arr[i];
		}
		System.out.println("모든 배열을 더한 값: " + this.x);
	}
}