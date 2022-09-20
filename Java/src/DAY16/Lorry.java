package DAY16;

public class Lorry implements Vehicle {
	public int findMileage(int speed) {
		if(speed > 30 && speed < 60) {
			return 30;
		}
		else if(speed > 61 && speed <80) {
			return 20;
		}
		else if(speed > 81 && speed < 100) {
			return 10;
		}
		else {
			return 0;
		}
	}

}
