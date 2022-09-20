package hmewrk;

public class PersonalLoan {
	public static void main(String[] args) throws Exception {
		Loan loan=new Loan();
		
		try {
			loan.getInterestRate("R");
		} catch(Exception exception) {
			System.out.println("Exception occured");
		}
		System.out.println("Successfully");
		
		
		
		int a=10;
		int b=0;
		
	
		/*try {
			int c=a/b;
		} 
		catch(Exception e) {
			System.out.println("Error occured");
		
		}
		
		//.finally {
			//System.out.println("Run program");
		//}*/
	}
	//System.out.println(c);

}

