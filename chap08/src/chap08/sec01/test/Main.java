package chap08.sec01.test;

public class Main {
	private static void printSound(Soundalbe soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

}


