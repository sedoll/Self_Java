package sec07.exam08;

public class Example {
	static int result;
	static int x;
	static int y;
	static int z;
	static int culc;
	
	static void example(int ran) {
		x = (int) (Math.random()*100);
		y = (int) (Math.random()*100);
		z = (int) (Math.random()*100);
		switch(ran) {
			case 1:
				Example.println(x, y, z);
				Example.culc();
				break;
			case 2:
				Example.println(x, y, z);
				Example.culc();
				break;
			case 3:
				Example.println(x, y, z);
				Example.culc();
				break;
			case 4:
				Example.println(x, y, z);
				Example.culc();
				break;
		}
	}
	
	static void println(int x, int y, int z) {
		if(y <=2) {
			System.out.print( x + " + " + y + " ");
			if(z % 2 == 0) {
				result = x + y - z;
				System.out.print(" - " + z + " ");
			} else {
				result = x + y + z;
				System.out.print(" + " + z + " ");
			}
		} else {
			System.out.print( x + " - " + y);
			if(z % 2 == 0) {
				result = x - y - z;
				System.out.print(" - " + z + " ");
			} else {
				result = x - y + z;
				System.out.print(" + " + z + " ");
			}
		}
	}
	
	static void culc() {
		int cont = 1;
		do {
			if(cont == 1) {
				System.out.print("정답은? : ");
				culc = Main.sc.nextInt();
				cont++;
			} else {
				System.out.print("틀렸습니다. 다시 입력하세요 : ");
				culc = Main.sc.nextInt();
			}
		} while(culc != result);
		System.out.println("정답입니다.");
	}
}
