package Day7;

public class doublevalue {
	public static void main(String[] args) {
		double temp=0.0;
		double temp1=0.0;
		for(double i=1;i<=4;i++) {
			System.out.println(temp);
			temp=temp+(1/i);
			temp1=temp1+temp;
		}
		System.out.println(temp);
		
		}
	}


