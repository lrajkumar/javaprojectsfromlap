package DAY15;

public class AC1 extends Summer {
	public String range(int temp) {
		if(temp>35) {
			return "no charge";
			
		}
		else if(temp>=30 && temp<=34) {
			return "medium";
		}
		else if(temp>=27 && temp<=29) {
			return "high";
		}
		else {
			return "very high";
		}
	}

 public static void main(String[] args) {
	 AC1 ac1=new AC1();
	 System.out.println(ac1.range(32));
	 System.out.println(ac1.range(32));
 }
}
