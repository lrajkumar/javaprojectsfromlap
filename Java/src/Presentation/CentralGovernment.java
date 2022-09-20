package Presentation;

public interface CentralGovernment { //Single abstract method->sam
//Functional Interface have one abstract method and can have any
	//                                           no of default method
	
        public void numberPlateId();
        // public void numberPlateColor();
         //public void numberPlateFont();
        default void joiningType() {
        	 System.out.println("The number plates are joined by the Screws");
         }
         
}
