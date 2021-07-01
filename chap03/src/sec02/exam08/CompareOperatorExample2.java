package sec02.exam08;
//비교 연산자, float과 double의 차이
public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		//되도록이면 둘을 같이 써서 비교하는 방식은 사용하지 말아라
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println((double)v5); //0.1보다 더 큼
		System.out.println(v4 == v5); //0.1f가 0.1보다 더 크므로 false가 뜬다
		System.out.println((float)v4 == v5); //double을 float으로 강제 변환하여 비교
		System.out.println((int)(v4*10) == (int)(v5*10)); //int, 정수형으로 강제 변환하여 비교
		
	}

}
