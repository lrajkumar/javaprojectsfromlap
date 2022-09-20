package DAY15;

public class MotorCycle extends Cycle {
 public String motorcycle(int speed) {
	
	 if(speed>60) {
		 return "max speed";
		 
	 }
	 else {
		return "normal speed"; 
	 }
 }
 
 
 public static void main(String[] args) {
	 MotorCycle mc=new MotorCycle();
	 System.out.println(mc.cyclename("hero"));
	 System.out.println(mc.motorcycle(80));
 }
}
