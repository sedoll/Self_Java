package compiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

	public class ReadFile {
		public static void main(String[] args){
	        try{
	            //파일 객체 생성
	            File file = new File("C:\\Users\\donha\\OneDrive\\바탕 화면\\git\\Self_Java\\compiler\\src\\compiler\\Sample.txt");
	            //입력 스트림 생성
	            FileReader filereader = new FileReader(file);
	            int singleCh = 0;
	            while((singleCh = filereader.read()) != -1){
	                System.out.print((char)singleCh);
	            }
	            filereader.close();
	        }catch (FileNotFoundException e) {
	            // TODO: handle exception
	        }catch(IOException e){
	            System.out.println(e);
	        }
	    }

}