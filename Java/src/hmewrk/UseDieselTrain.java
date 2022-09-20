package hmewrk;

  public class UseDieselTrain {
	public static void main(String[] args) {
		String trainName=args[0];
		String trainNo=args[2];
		int speed=Integer.parseInt(args[1]);
		boolean isPilot=Boolean.parseBoolean(args[3]);
		boolean isDoor=Boolean.parseBoolean(args[4]);
	
		DieselTrain t=new DieselTrain();
		
System.out.println("TRAINNAME: "+trainName.toUpperCase()+", "+"SPEED: "+speed+", "+"TRAIN NO: "+trainNo+", "+"MILEAGE "+t.getMileage(speed)+", "+"AUTOPILOT FUNCTION= "+t.autoPilot(isPilot)+", "+"AUTOMATIC DOOR CLOSE= "+t.autoDoorClose(isDoor));		
	}
	
}
