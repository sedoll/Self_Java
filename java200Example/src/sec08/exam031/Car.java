package sec08.exam031;

public class Car {
	private String name;
	private String company;
	private int timeOil;
	
	Car(String name, String company, int timeOil){
		this.name = name;
		this.company =company;
		this.timeOil = timeOil;
	}
	
	void print() {
		System.out.println(name);
		System.out.println(company);
		System.out.println(timeOil);
	}
}
