package calcul;

import java.util.*;

public class Main extends Cal{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int s = 0;
		double x = 0;
		double y = 0;
		
		while(run) {
			System.out.println("1.µ¡¼À | 2.»¬¼À | 3.°ö¼À | 4.³ª´°¼À | 5.¸®¼Â | 6.Á¾·á");
			s = sc.nextInt();
			switch(s) {
				case 1:
					x = sc.nextInt();
					y = sc.nextInt();
					add(x, y);
					print();
					break;
				case 2:
					x = sc.nextInt();
					y = sc.nextInt();
					sub(x, y);
					print();
					break;
				case 3:
					x = sc.nextInt();
					y = sc.nextInt();
					mul(x, y);
					print();
					break;
				case 4:
					x = sc.nextInt();
					y = sc.nextInt();
					div(x, y);
					print();
					break;
				case 5:
					reset();
					print();
					break;
				default:
					run = false;
			}
		}
		System.out.println("°è»ê±â¸¦ Á¾·áÇÕ´Ï´Ù.");

	}

}
