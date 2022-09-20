package DAY13;

public class UseBoard {
       public static void main(String[] args) {
    	   Frame f=new Frame("black",500,"Square");
    	   
    	   Board b=new Board("octo",1500,"white",f);
    	   
    	  /* System.out.println("Board brand:"+b.getBrand());
    	   System.out.println("board price:"+b.getprice());
    	   System.out.println("board color:"+b.getColor());
    	   System.out.println("frame color:"+f.getColor());
    	   System.out.println("frame price:"+f.getPrice());
    	   System.out.println("frame shape:"+f.getShape());*/
    	   
    	   System.out.println(f);
    	   System.out.println(b);
    	   
       }
}
