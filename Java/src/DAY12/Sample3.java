package DAY12;

public class Sample3 {
    public void sub(){     //void without parameter()
    	int a=40;
    	int b=10;
    	System.out.println(a-b);
    	System.out.println(a+b);
    	System.out.println(a*b);
    }
    
    public void sub1(int a,int b) {  //void with parameter
    	System.out.println(a/b);
    	System.out.println(a%b);
    }
    
    
    public static void main(String[] args) {
    	Sample3 s2=new Sample3();
    	s2.sub();
    	s2.sub1(45, 15);
    }
}
