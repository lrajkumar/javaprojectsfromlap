package DAY12;

public class Sample2 {
      public void add() {
    	  int a=10;
    	  int b=20;
    	  System.out.println(a+b);
    	  
      }
      
      public void  add1(int a,int b) {
    	 
    	 System.out.println(a+b);
      }
      
      public static void main(String[] args) {
    	  Sample s1=new Sample();
    	  s1.add();
    	  s1.add1(30, 40);
      }
      
}
