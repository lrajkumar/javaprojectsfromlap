package DAY16;

public class Car implements Vehicle {
	public int findMileage(int speed) {
		if(speed > 30 && speed <60) {
	            return 40 ;
		}
		else if(speed > 61 && speed <80) {
			return 30;
		}
		else if(speed >81 && speed <100) {
			return 20;
		}
		else {
			return 0;
		}
	}

}
