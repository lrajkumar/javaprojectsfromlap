package day2;

public class UseShirt {
	public static void main(String[] args) {
		Shirt details1=new Shirt();
		Shirt details2=new Shirt();
		Shirt details3=new Shirt();
		details1.brand="Levis";
		details1.colour="Red";
		details1.price=1500;
		details1.discount=300;
		System.out.println("Brand Name:"+details1.brand);
		System.out.println("Colour:"+details1.colour);
		System.out.println("price:"+(details1.price-details1.discount));
		details2.brand="Allen Solley";
		details2.colour="Blue";
		details2.price=2100;
		details2.discount=300;
		System.out.println("Brand Name:"+details2.brand);
		System.out.println("colour:"+details2.colour);
		System.out.println("price:"+details2.price);
		System.out.println("price:"+(details2.price-details2.discount));
		
		details3.brand="Puma";
		details3.colour="Black";
		details3.price=2000;
		details3.discount=400;
		System.out.println("Brand name:"+details3.brand);
		System.out.println("Colour:"+details3.colour);
		System.out.println("price:"+(details3.price-details3.discount));
		System.out.println("total price:" +((details1.price-details1.discount)+(details2.price-details2.discount)+(details3.price-details3.discount)));
		
		
		
		
	}

}
