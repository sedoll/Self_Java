package week1;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOPP {

	public static void main(String[] args) throws IOException {
		// class : System, Math, FileWriter
		// instance : f1, f2
		
		
		// Math의 변수
		System.out.println(Math.PI);
	
		// Math의 메소드
		System.out.println(Math.floor(1.8)); // 반 내림
		System.out.println(Math.ceil(1.8)); // 반 올림
		
		// 클래스
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello"); // 메소드
		f1.write(" Java");
		f1.close();
		
		// 클래스
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello"); // 메소드
		f2.write(" Java2");
		f2.close();
	}

}
