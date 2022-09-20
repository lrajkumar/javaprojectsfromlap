package Presentation;

public class VarArgumentsExample {
  public static void main(String[] args) {
	 Display obj =new Display();
	 obj.show("RAj");
  }
}
  
  class Display {
	  public void show(String...a) {
		   for(String i:a) {
		    	System.out.println(i);                                // System.out.println(a);
		                                                              
	  }
	  }
  
	  
  
  
 public void show(String a)   //when calling the object the object calls the method with the same name and same parameters 
  {
	  System.out.println(a+ "int show a");
  }
  } 
	


