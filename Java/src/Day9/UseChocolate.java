package Day9;

public class UseChocolate {
     public static void main(String[] args) {
    	 Chocolate c1=new Chocolate();
    	 Chocolate c2=new Chocolate();
    	 Chocolate c3=new Chocolate();
    	 
    	 c1.brand="5Star";
    	 c1.price=10;
    	 c1.weight=10.22f;
    	 
    	 c2.brand="DiaryMilk";
    	 c2.price=25;
    	 c2.weight=20.23f;
    	 
    	 c3.brand="Mars";
    	 c3.price=35;
    	 c3.weight=35.22f;
    	 
    	 Chocolate[] choco= {c1,c2,c3};
    	 
    	 for(Chocolate choco1:choco) {
    		 System.out.println("Brand: "+choco1.brand);
    		 System.out.println("weight: "+choco1.weight);
    	 }
    	 
    	 //for(int i=0;i<choco.length;i++) {
    		 //System.out.println("Chocolate brand:"+choco[i].brand);
    		 
    		 //System.out.println("Chocolate price:"+choco[i].price);
    	 }
    
    	 
     }

