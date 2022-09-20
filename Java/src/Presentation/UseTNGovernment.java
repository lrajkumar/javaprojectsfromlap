package Presentation;

public class UseTNGovernment {
	public static void main(String[] args) {
		/*TNGovernment t=new TNGovernment();
		t.numberPlateId();
		t.numberPlateColor();
		t.numberPlateFont();
		t.joingType(); */
		
	//-> Lamba expression used for functional interface 
   // functional interface can create object for interface
		
		CentralGovernment cg = new CentralGovernment() {
			
			@Override
			public void numberPlateId() {
				System.out.println("TN");
				
			}
		};
		
	  CentralGovernment g = ()-> System.out.println("TN");
	  g.numberPlateId();
	  g.joiningType();   
	}

}
