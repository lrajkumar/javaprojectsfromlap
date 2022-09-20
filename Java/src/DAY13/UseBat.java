package DAY13;

public class UseBat {
 public static void main(String[] args) {
	     Ball b=new Ball("SG",400,"red");
	     
	     Bat b1=new Bat("SS",5000,35.34f,"Short handle",b);
	     System.out.println("brand:"+b1.getBrand());
	     System.out.println("ball price:"+b1.getPrice());
	     System.out.println("bat length:"+b1.getLength());
	     System.out.println("type:"+b1.getType());
	     System.out.println("ball brand:"+b.getBrand());
	     System.out.println("ball price:"+b.getPrice());
	     System.out.println("ball color:"+b.getColor());
 }
}
