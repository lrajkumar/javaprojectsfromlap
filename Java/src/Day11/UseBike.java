package Day11;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1=new Bike();
		Bike bike2=new Bike();
		Bike bike3=new Bike();
		Bike bike4=new Bike();
		Bike bike5=new Bike();
		
		
		bike1.brand="HERO";
		bike1.price=80000;
		bike1.color="BLACK";
		bike1.regno="TN 51 AZ 2246";
		bike1.mileage=45;
		bike1.tax=(bike1.price*20)/100;
		
		bike2.brand="HONDA";
		bike2.price=90000;
		bike2.color="BLUE";
		bike2.regno="PY 02 AH 2236";
		bike2.mileage=52;
		bike2.tax=(bike2.price*20)/100;
		
		bike3.brand="YAMAHA";
		bike3.price=100000;
		bike3.color="WHITE";
		bike3.regno="UP 22 BA 3244";
		bike3.mileage=46;
		
		bike4.brand="TVS";
		bike4.price=120000;
		bike4.color="YELLOW";
		bike4.regno="KA 44 CH 4455";
		bike4.mileage=44;
		bike4.tax=(bike4.price*20)/100;
		
		bike5.brand="SUZUKI";
		bike5.price=130000;
		bike5.color="GREY";
		bike5.regno="KL 32 FA 2246";
		bike5.mileage=42;
		bike5.tax=(bike5.price*20)/100;
		int discount=10000;
		int max=0;
		
		
		

		Bike[] bikes= {bike1,bike2,bike3,bike4,bike5};
		int min=bikes[0].price;
		/*for(int i=0;i<bikes.length;i++) {
			if(bikes[i].regno%2==0) {
				System.out.println("Brand: "+bikes[i].brand+", "+"PRICE: "+bikes[i].price);
				
			}
			
			}*/
		
		for(int i=0;i<bikes.length;i++) {
			if(bikes[i].brand.length()>4) {
				System.out.println("BRAND NAME: "+bikes[i].brand+","+"PRICE"+bikes[i].price);
			}
		}
		
		for(int i=0;i<bikes.length;i++) {
			System.out.println("brand in lower case: "+bikes[i].brand.toLowerCase()+"   "+"Length of the brand: "+bikes[i].brand.length());
		}
		
		for(int i=0;i<bikes.length;i++) {
			if(bikes[i].price>90000) {
				System.out.println("Discount on price: "+bikes[i].brand+"-"+(bikes[i].price-discount));
			}
		}
		
		for(int i=0;i<bikes.length;i++) {
			if(bikes[i].brand.startsWith("H")) {
				System.out.println("Brand name: "+bikes[i].brand+"-"+bikes[i].price);
			}
		}
		
		for(int i=0;i<bikes.length;i++) {
			if(bikes[i].price>max) {
				max=bikes[i].price;
			}
			
		}
		for(int i=0;i<bikes.length;i++) {
		
		if(max==bikes[i].price) {
			System.out.println("Brand: "+bikes[i].brand+", "+"PRICE="+bikes[i].price+", "+"COLOR="+bikes[i].color);}
		}
		//System.out.println("Max price of bike: "+max);
		
		
		/*for(int i=0;i<bikes.length;i++) {
			if(bikes[i].price<min) {
				min=bikes[0].price;
			}
		}
		for(int i=0;i<bikes.length;i++) {
			if(min==bikes[i].price) {
				System.out.println("Brand: "+bikes[i].brand);
			}
			}
		System.out.println("Min price: "+min);
		
		for(int i=0;i<bikes.length;i++) {
			if(bikes[i].mileage>45) {
				System.out.println("Brand Name: "+bikes[i].brand);
			}
			
		}
		
	for(int i=0;i<bikes.length;i++) {
		if(bikes[i].regno.startsWith("TN")) {
			System.out.println("Brand Name: "+bikes[i].brand+"-"+"Reg no: "+bikes[i].regno);
		}
	}
	   
	for(int i=0;i<bikes.length;i++) {
		if(bikes[i].regno.contains("FA")) {
			System.out.println("Brand Name: "+bikes[i].brand+"-"+"Reg no: "+bikes[i].regno);
		}
	}
	
	for(int i=0;i<bikes.length;i++) {
		if(bikes[i].brand.equals("YAMAHA")) {
			System.out.println("Tax for Yamaha is: tax free");
		}
			else {
				System.out.println("Brand name: "+bikes[i].brand+"-"+(bikes[i].price+bikes[i].tax));
			}
		}*/
	}
	
		}
		
		
	


