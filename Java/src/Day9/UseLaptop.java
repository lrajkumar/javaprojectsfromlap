package Day9;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop laptop1=new Laptop();
		Laptop laptop2=new Laptop();
		Laptop laptop3=new Laptop();
		
		laptop1.brand="Lenevo";
		laptop1.colour="Black";
		laptop1.price=18000;
		laptop1.discount=3000;
		laptop1.netPrice=laptop1.price-laptop1.discount;
		
		laptop2.brand="Apple";
		laptop2.colour="White";
		laptop2.price=20000;
		laptop2.discount=5000;
		laptop2.netPrice=laptop2.price-laptop2.discount;
		
		laptop3.brand="HP";
		laptop3.colour="Black";
		laptop3.price=25000;
		laptop3.discount=4000;
		laptop3.netPrice=laptop3.price-laptop3.discount;
		
		
		Laptop[] laptop= {laptop1,laptop2,laptop3};
		for(int i=0;i<laptop.length;i++) {
				System.out.println("price1:"+laptop[i].price);
				System.out.println("netprice:"+laptop[i].netPrice);
				System.out.println("Brand & colour:"+(laptop[i].brand.concat(laptop[i].colour)));
				System.out.println("brand to upper case: "+laptop[i].brand.toUpperCase());
				System.out.println("colour in lowercase :"+laptop[i].colour.toUpperCase());
				
		}
		
		
	}
	
	}


