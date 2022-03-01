package array.exam3052;

import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arrVar = 10;
		
		int[] arr = new int[arrVar];
		int[] arrResult = new int[arrVar]; //나머지값
		
		//입력
		for(int i=0; i<arr.length; i++) {
			
			// 입력값 범위 추가, 0~1000사이
			boolean run = true;
			do {
				arr[i] = sc.nextInt();
				if(arr[i] <= 1000 && arr[i] >= 0) {
					run = false;
				} else {
					System.out.println("입력 값은 0이상 1000 이하여야 합니다.");
				}
			} while(run);
		}
		
		//나머지값
		for(int i=0; i<arr.length; i++) {
			arrResult[i] = arr[i] % 42;
		}
		
		ArrayList<Integer> list = new ArrayList<>(); 
		for(int checkData : arrResult) { 
			if(!list.contains(checkData)) { 
				//리스트의 contains 메서드를 활용해 
				//리스트 내부의 데이터를 체크해 본다. 
				//이후 중복 데이터가 없을 경우 그 값을 
				// add 를 통해 넣어준다. 
				list.add(checkData); 
			} 
		}
		
		int [] newArr = new int [list.size()]; 
		// list의 크기 만큼 새로운 배열을 선언해준다. 
		for(int i = 0; i < newArr.length; i++ ) {
			newArr[i] = list.get(i); 
		} 
		// get을 통해 중복값을 제외하고 선언한 배열에 
		// 하나씩 넣어준다. 
		
		//계산된 숫자 값 출력
		System.out.println(newArr.length);
	}

}