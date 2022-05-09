package blog;

public class Main {

	public static void main(String[] args) {
		// 인스턴스 멤버
		Instance1 i1 = new Instance1("가", "나");
		Instance1 i2 = new Instance1("나", "가");
		System.out.println(i1.instance1());
		System.out.println(i2.instance1());
		if(i1.y == i2.y) {
			System.out.println("같은 번지");
		} else {
			System.out.println("다른 번지");
		}
		
		// 정적 멤버
		System.out.println(Static1.static1());
		Static1.x = 3;
		Static1.y = 5;
		System.out.println(Static1.static1());

	}

}
