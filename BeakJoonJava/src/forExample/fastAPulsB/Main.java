package forExample.fastAPulsB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		br.close();
		int sum = 0;

		for(int i=0; i<t; i++) {
			int x = Integer.parseInt(br.readLine());
			br.close();
			int y = Integer.parseInt(br.readLine());
			br.close();
			sum = x + y;
			bw.write(sum);
			bw.newLine();
		}
		

	}

}
