package translate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String cCode = "#include <stdio.h>\nint main() {\nFILE *f1, *f2; \nchar c;\n"; //기본 코드 생성
        try{
            //파일 객체 생성
            File file = new File("src/test.n");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);
            //text.n 한 줄씩 읽기
            String line = "";
            //한줄 씩 읽음
            while((line = bufReader.readLine()) != null){ 
            	System.out.println(line);
            	//코드 문법 확인, 문법이 정확하면 실행
            	boolean run = Trans.gramCheck(line);
            	if(run) {
            		cCode += Trans.translate(line);
            	} else {
            		Trans.error();
            	}
            }         
            bufReader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }
        
        //c코드 파일 만들기
        try {
        	File file = new File("src/test.c");
        	BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(cCode);
            writer.write("return 0; \n}"); //마지막
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
