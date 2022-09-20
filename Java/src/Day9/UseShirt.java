package Day9;

public class UseShirt {
	public static void main(String[] args) {
		Shirt shirt1=new Shirt();
		Shirt shirt2=new Shirt();
		Shirt shirt3=new Shirt();
		
		shirt1.brand="Levis";
		shirt1.colour="Black";
		shirt1.size="S";
		shirt1.price=1500;
		shirt1.taxAmount=500;
		shirt1.netprice=shirt1.price+shirt1.taxAmount;
		
		shirt2.brand="Allensolley";
		shirt2.colour="Blue";
		shirt2.size="S";
		shirt2.price=1800;
		shirt2.taxAmount=300;
		shirt2.netprice=shirt2.price+shirt2.taxAmount;
		
		shirt3.brand="Lacotse";
		shirt3.colour="Brown";
		shirt3.size="L";
		shirt3.price=2000;
		shirt3.taxAmount=500;
		shirt3.netprice=shirt3.price+shirt3.taxAmount;
		
		Shirt[] shirt= {shirt1,shirt2,shirt3};
		
		for(int i=0;i<shirt.length;i++) {
		System.out.println("netprice of Shirt: "+shirt[i].netprice);
		System.out.println("Brand & length : "+shirt[i].brand.concat(shirt[i].colour)+" "+shirt[i].brand.concat(shirt[i].colour).length());
		System.out.println("To uppercase :"+shirt[i].brand.concat(shirt[i].colour).toUpperCase());
		System.out.println("To lowercase :"+shirt[i].brand.concat(shirt[i].colour).toLowerCase());
		System.out.println("To first letter of brand and colour :"+shirt[i].brand.charAt(0)+" "+shirt[i].colour.charAt(0));
		//System.out.println("To last letter of brand and colour :"+shirt[i].brand.charAt(shirt[i].length())-1);
		}
		
		

	}

}
