package hmewrk;

public class DieselTrain implements ElectricTrain {
        String trainName;
        int speed;
        int trainNo;
        public int getMileage(int speed) {
        	if(speed > 200) {
        		return 6;
        	}
        	else {
        		return 10;
        	}
        	
        }
        public boolean autoPilot(boolean isPilot) {
        	return isPilot;
        }
        public boolean autoDoorClose(boolean isDoor) {
        	return isDoor;
        }
}
		
			
			
		

