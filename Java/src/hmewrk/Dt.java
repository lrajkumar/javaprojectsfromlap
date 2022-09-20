package hmewrk;

public class UseDt {

	int speed=Integer.parseInt(args[0]);
	boolean isPilot=Boolean.parseBoolean(args[1]);
	boolean isDoor=Boolean.parseBoolean(args[2]);

	DieselTrain t=new DieselTrain();
	System.out.println(t.getMileage(speed));
	System.out.println(t.autoDoorClose(isDoor));
	System.out.println(t.autoPilot(isPilot));

}
