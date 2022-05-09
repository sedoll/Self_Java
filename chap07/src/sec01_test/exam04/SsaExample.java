package sec01_test.exam04;

public class SsaExample {

	public static void main(String[] args) {

		SuperSonicAirplane ssa = new SuperSonicAirplane();
		ssa.takeOff();
		ssa.fly();
		ssa.flyMode = SuperSonicAirplane.SUPERSONIC;
		ssa.fly();
		ssa.flyMode = SuperSonicAirplane.NORMAL;
		ssa.fly();
		ssa.land();

	}

}
