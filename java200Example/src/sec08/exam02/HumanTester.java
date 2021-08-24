package sec08.exam02;

public class HumanTester {

	public static void main(String[] args) {
		Human human1 = new Human("全辨悼", 180, 90);
		Human human2 = new Human("坷技绕", 175, 70);
		Human human3 = new Human("廓府决", 170, 80);

		String name1 = human1.getName();
		int height1 = human1.getHeight();
		int weight1 = human1.getWeight();

		String name2 = human2.getName();
		int height2 = human2.getHeight();
		int weight2 = human2.getWeight();

		String name3 = human3.getName();
		int height3 = human3.getHeight();
		int weight3 = human3.getWeight();
		
		System.out.println(name1);
		System.out.println(weight1);
		System.out.println(height1);
		System.out.println();
		
		System.out.println(name2);
		System.out.println(weight2);
		System.out.println(height2);
		System.out.println();
		
		System.out.println(name3);
		System.out.println(weight3);
		System.out.println(height3);

	}

}
