package DAY16;

public class AxisBank implements Bank {
	int tax=10;
	public int findInterest(int principleAmount) {
		 int netAmount=(principleAmount*tax/100);
		 return netAmount;
		 
}
	
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		System.out.println(a.findInterest(5000));
	}

}
