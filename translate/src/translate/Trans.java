package translate;

public class Trans {
	//필드선언
	private static boolean result;
	private static String fileName1;
	private static String fileName2;
	private static String textName;
	private static String textName2;
	private static int echoP;
	private static int catNameF;
	private static int catNameE;
	private static int catNameF2;
	private static int catNameE2;
	private static int i;
	
	//코드 문법 체크, (), echo, cat이 있는지 검사 
	public static boolean gramCheck(String s) {
		boolean leftParenCheck = ("(".equals(s.substring(0,1))) ? true : false; //처음에 (로 시작하는지 확인
		boolean rightParenCheck = (")".equals(s.substring(s.length()-1))) ? true : false; //끝이 )로 끝나는지 확인
		boolean echoCheck = s.contains("(echo "); //echo와 (가 붙어 있는지 확인
		boolean catCheck = s.contains("(cat "); //cat과 (가 붙어 있는지 확인
		result = ((leftParenCheck && rightParenCheck) && (echoCheck  || catCheck)); //코드가 옳바르면 t, 옳바르지 않으면 f를 출력
		return result;
	}
	
	//코드 번역
	public static String translate(String s) {
		String cCode = "";
		//echo 코드 변환
		if(s.contains("echo")) { //echo 코드 변환
			cCode += "printf(";
			echoP = s.indexOf(" ");
			cCode += s.substring(echoP+1, s.length()-2);
			cCode += "\\n";
			cCode += s.substring(s.length()-2);
			cCode += ";\n\n";
		}
		
		//cat 파일 복사 코드 변환 a > b or b > a
		else if(s.contains("cat") && s.contains(".txt")) { // cat 코드 변환
			// 첫 번째 텍스트 파일 이름 찾기
			catNameF = s.indexOf(" ")+1;
			catNameE = s.indexOf(".");
			//텍스트 파일 이름 대입
			textName = s.substring(catNameF, catNameE);
			// 텍스트파일 복사 코드 a > b or b > a
			if(s.contains(">")) {
				// 두 번째 텍스트 파일 이름 찾기
				catNameF2 = s.lastIndexOf(" ")+1;
				catNameE2 = s.lastIndexOf(".");
				textName2 = s.substring(catNameF2, catNameE2);
				if(s.indexOf(textName) < s.indexOf(textName2)) { //text 이름 a
					fileName1 = "f1";
					fileName2 = "f2";
				} else {  //text 이름 b
					fileName1 = "f2";
					fileName2 = "f1";
				}
				cCode += fileName1 + " = fopen(\"" + textName + ".txt\", \"r\");\n";
				cCode += fileName2 + " = fopen(\"" + textName2 + ".txt\", \"w\");\n";
				cCode += "while((c = getc(" + fileName1 +")) != EOF) fputc((int)c," + fileName2 + ");\n";
				cCode += "fclose(" + fileName1 + ");\n";
				cCode += "fclose(" + fileName2 + ");\n\n";
			}
			//텍스트 파일 출력 a.txt or b.txt
			else {
				if(i==0) {
					fileName1 = "f1";
					i = 1;
				} else {
					fileName1 = "f2";
					i = 0;
				}
				cCode += fileName1 + " = fopen(\"" + textName + ".txt\", \"r\");\n";
				cCode += "while((c = getc(" + fileName1 +")) != EOF) printf(\"%c\",c);\n";
				cCode += "fclose(" + fileName1 + ");\n\n";
			}
		}
		System.out.println("코드 변환 성공\n");
		return cCode;
}
	
	public static void error(){
		System.out.println("코드가 잘 못 되었습니다. \n변환 실패\n");
	}
}