package sec07.exam08;

public class Example {
	static int result;
	static int x;
	static int y;
	static int z;
	static int culc;
	static int maximum = 5;
	
	public void culc(int ran) {
		x = (int) (Math.random()*100);
		y = (int) (Math.random()*100);
		z = (int) (Math.random()*100);
		switch(ran) {
			case 1:
				result = x + y + z;
				println(ran, x, y, z);
				break;
			case 2:
				result = x + y - z;
				println(ran, x, y, z);
				break;
			case 3:
				result = x - y + z;
				println(ran, x, y, z);
				break;
			case 4:
				result = x - y - z;
				println(ran, x, y, z);
				break;
		}
	}
	
	public void println(int ran,int x, int y, int z) {
		int cont = 1;
		System.out.println(x + ((ran>2) ? " - "+y:" + "+y) + ((ran%2==0) ? " - "+z:" + "+z));
		do {
			if(cont==1) {
				System.out.print("정답 : ");
				cont++;
			} else {
				System.out.print("다시 입력하세요. : ");
			}
			culc = Main.sc.nextInt();
		} while(culc != result);
		System.out.println("정답입니다!");
	}
}