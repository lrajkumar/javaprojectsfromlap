package DAY16;

public class AcRemote extends Remote {
	public int batteryLife() {
		return 2;
	}
   public static void main(String[] args) {
	   AcRemote ac=new AcRemote();
	   System.out.println(ac.batteryLife());
	   System.out.println(ac.onOffRemote());
   }
}
