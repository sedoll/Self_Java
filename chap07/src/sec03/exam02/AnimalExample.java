package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog(); // Dog 객체 선언, 인스턴스 화
		Cat cat = new Cat(); // Cat 객체 선언, 인스턴스 화
		
		dog.sound(); // 소리 출력
		cat.sound(); // 소리 출력
		
		Animal animal = null;
		
		animal = new Dog(); // 다형성
		animalSound(animal); // Dog에서 재정의 된 소리 출력
		
		animal = new Cat(); // 다형성
		animalSound(animal); // Cat에서 재정의 된 소리 출력

	}
	
	public static void animalSound(Animal animal) { // 정적 메서드
		animal.sound();
	}

}
