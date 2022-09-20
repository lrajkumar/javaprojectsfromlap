package DAY16;

public class UseBike {
        public static void main(String[] args) {
        	Car c=new Car();
        	Lorry l=new Lorry();
        	Bike b=new Bike();
        	
        	System.out.println(c.findMileage(85));
        	System.out.println(l.findMileage(35));
        	System.out.println(b.findMileage(95));
        }
}
