package Day3;

public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="bmw";
		car1.model="XVI";
		car1.price=400000;
		car1.isPetrol=(car1.price>700000);
		System.out.println((car1.brand).toUpperCase());
		System.out.println((car1.brand).length());
		System.out.println(car1.model);
		System.out.println(car1.price);
		System.out.println(car1.isPetrol);
		Car car2=new Car();
		car2.brand="tata";
		car2.model="IX";
		car2.price=300000;
		car2.isPetrol=(car2.price>200000);
		System.out.println((car2.brand).toUpperCase());
		System.out.println((car2.brand).length());
		System.out.println(car2.model);
		System.out.println(car2.price);
		System.out.println(car2.isPetrol);
		Car car3=new Car();
		car3.brand="tata";
		car3.model="IX";
		car3.price=200000;
		car3.isPetrol=(car3.price>200000);
		System.out.println((car3.brand).toUpperCase());
		System.out.println((car3.brand).length());
		System.out.println(car3.model);
		System.out.println(car3.price);
		System.out.println(car3.isPetrol);
		System.out.println("total price:"+(car1.price+car3.price+car2.price));
		
		
	}
	

}
