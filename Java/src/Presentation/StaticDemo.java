package Presentation;

public class StaticDemo {
         static int a=10;  //Static variable
          static int i=5;
          static int k=6;
         static int j=0;
          
          
          static void display() {                        //static method
        	  System.out.println("STATIC METHOD");
          }
          static {
        	 int j=k+i;
        	  
        	   System.out.println(j);
          }
          
        public static void main(String[] args) {
        	
        	  System.out.println(a);
        	 display();
          } 
}
