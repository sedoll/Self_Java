package if_.exam2525;

import java.util.Scanner;

public class Exam2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String time = sc.nextLine(); // 시, 분 입력
		int timeSet = sc.nextInt(); // 사용 시간 입력
		String[] strTime = time.split(" "); // 시, 분을 따로 나눔
		int [] intTime = new int[strTime.length]; // 시간 계산을 위해 나눈 시, 분을 정수형으로 변환
		int mTot = 0; // 분 총합
		int hTot = 0; // 시 총합
		int hPlus = 0; // 60분이 넘을 경우 1시간을 추가하기 위한 변수
		
		for(int i=0; i<strTime.length; i++) {// 입력된 문자열 시간을 정수형으로 변환
			intTime[i] = Integer.parseInt(strTime[i]);
		}
		
		mTot = intTime[1] + timeSet; //분, 총합 더함
		if(mTot >= 60) { //분이 60분이 넘을 경우 변환
			hPlus = mTot / 60; // 몫 구하기, 시간 추가
			mTot %= 60; // 나머지 구하기, 분
		}
		
		hTot = intTime[0] + hPlus; // 시간, 총합 더함
		if(hTot >= 24) { // 시간이 24시가 넘을 경우 변환
			hTot %= 24;
		}
		String result = hTot + " " + mTot;
		
		System.out.println(result); //시간, 분 출력
	}

}