package hmewrk;

public class UseCar {
	 public static void main(String[] args) {
		 Car car1=new Car();
		 Car car2=new Car();
		 
		 
		 String[] a=args[0].split(",");
		 car1.distance=Integer.parseInt(a[0]);
		 car1.price=Integer.parseInt(a[1]);
		 
		 String[] b=args[0].split(",");
		 car2.distance=Integer.parseInt(b[0]);
		 car2.price=Integer.parseInt(b[1]);
		 
		 int totalDistance=car1.distance+car2.distance;
		 int totalPrice=car1.price+car2.price;
		 
		 Car[] cars= {car1,car2};
		 
		 
		 for(int i=0;i<cars.length;i++) {
			 
		 }
		 System.out.println("Total distance= "+totalDistance+" "+"Total Price "+totalPrice);
	 }
		 
		 
	
		 
	 }
			


