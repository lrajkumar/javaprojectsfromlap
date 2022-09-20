package DAY13;

public class UseBike {
 public static void main(String[] args) {
	 Bike b=new Bike();
	 b.SetBrand("Honda");
	 b.SetPrice(90000);
	 b.SetColor("Black");
	 b.SetModel("BSVI");
	 
	 System.out.println(b.getBrand());
	 System.out.println(b.getPrice());
	 System.out.println(b.getColor());
	 System.out.println(b.getModel());
 }
}
