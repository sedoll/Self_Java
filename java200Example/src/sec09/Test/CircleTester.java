// 원과 좌표 클래스 테스트
package sec09.Test;

public class CircleTester {
	public static void main(String[] args) {
		Point2D[] p = new Point2D[]{
			new Point2D(3, 7), new Point2D(4, 6)
			, new Point2D(3, 7)
		};
		Circle c1 = new Circle();
		Circle c2 = new Circle(new Point2D(10, 15), 5);
		Circle c3 = new Circle();
		for (int i=0; i< p.length; i++) {
			System.out.println("p["+i+"]="+p[i]);
		}
		c1.setRadius(10); // 반지름을 10으로 변경
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println(p[0].equalTo(p[2]));
		System.out.println(c1.equalTo(c2));
//		System.out.println(equal(c1, c3));
	}

}
