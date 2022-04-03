package python50_100;

import java.text.*;
import java.util.*;

public class Exam1408 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss", Locale.KOREA);
		Scanner sc = new Scanner(System.in);
		String aHms = sc.nextLine();
		String bHms = sc.nextLine();
		
		Date d1 = f.parse(aHms);
		Date d2 = f.parse(bHms);
		int diff = (int) (d2.getTime() - d1.getTime());
		int[] hms = new int[3];
		hms[2] = diff / 1000;
		
		if(hms[2] < 0) {
			hms[2] += 60*60*24;
		}
		
		for(int i=1; i>=0; i--) {
			hms[i] = hms[i+1] / 60;
			hms[i+1] %= 60;
		}
		
		String[] result = new String[3];
		for(int i=0; i<3; i++) {
			if(hms[i] < 10) {
				result[i] = "0" + hms[i];
			} else {
				result[i] = String.valueOf(hms[i]);
			}
		}
		
		System.out.println(result[0] + ":" + result[1] + ":" + result[2]);

	}

}
