package chap06.sec04.exam01;

import java.util.*;

public class TestCalculatorExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator myCalc = new Calculator();

		boolean run = true;
		myCalc.powerOn();
		
		while(run){
			System.out.println("1.µ¡¼À | 2.³ª´°¼À | 3.Á¾·á");
			int selct = sc.nextInt();
			
			switch(selct) {
				case 1:
					System.out.print("Ã¹ ¹øÂ° ¼ýÀÚ> ");
					int x1 = sc.nextInt();
					System.out.print("µÎ ¹øÂ° ¼ýÀÚ> ");
					int y1 = sc.nextInt();
					int result1 = myCalc.plus(x1, y1);
					System.out.printf("µ¡¼À °á°ú: %d\n", result1);
					break;
					
				case 2:
					System.out.print("Ã¹ ¹øÂ° ¼ýÀÚ> ");
					int x2 = sc.nextInt();
					System.out.print("µÎ ¹øÂ° ¼ýÀÚ> ");
					int y2 = sc.nextInt();
					double result2 = myCalc.divide(x2, y2);
					System.out.printf("³ª´°¼À °á°ú: %.2f\n", result2);
					break;
					
				case 3:
					run = false;
					break;
			}
		}
		myCalc.powerOff();

	}

}
