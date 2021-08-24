package sec08.exam01;

public class HumanTester {

	public static void main(String[] args) {
		Human human = new Human();
		
		human.name = "오세훈";
		human.age = 24;
		human.sex = "남성";
		human.height = 175;
		human.weight = 70;
		System.out.println("이름: " + human.name);
		System.out.println("나이: " + human.age);
		System.out.println("성별: " + human.sex);
		System.out.println("신장: " + human.height);
		System.out.println("체중: " + human.weight);
	}

}
