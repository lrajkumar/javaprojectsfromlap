package DAY12;

public class Sample4 {
	public int add() {
		int a=400;
		int b=200;
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
		
	}
	
	public float multiply() {
		float a=11.22f;
		float b=11.23f;

		return a*b;
	}
	
  public float multiply1(float a,float b) {
	  return a*b;
  }

   public char add1() {
	   char a1='B';
	   
	   return a1;
   }
   
   public char add2(char b) {
	    return b;
   }
   
   public String add3() {
	   String a="hello";
	   String b="world";
	   return a+b;
   }
		
   public String add4(String a,String b) {
	   return (a+b);
   }
	
   public long add5() {
	   long a=9919189;
	  long b=1651846;
	   return(a+b);
   }
   
   public long add6(long a,long b) {
	   return(a-b);
   }
   
   public boolean add7() {
	   boolean a=true;
	   return (a);
   }
   
   public boolean add8(boolean a) {
	   return a;
   }
   
   
      public static void main(String[] args) {
    	  Sample4 s4=new Sample4();
    	  System.out.println(s4.add());
    	  System.out.println(s4.sub(45,15));
    	  System.out.println(s4.multiply());
    	  System.out.println(s4.multiply1(11.11f, 11.11f));
    	  System.out.println(s4.add1());
    	  System.out.println(s4.add2('e'));
    	  System.out.println(s4.add3());
    	  System.out.println(s4.add4("welcome", "java"));
    	  System.out.println(s4.add5());
    	  System.out.println(s4.add6(11555l, 115546l));
    	  System.out.println(s4.add7());
    	  System.out.println(s4.add8(false));
      }
      

}
