package hmewrk;

public class UseChair {
	 public static void main(String[] args) {
		 Chair chair1=new Chair();
		 Chair chair2=new Chair();
		 Chair chair3=new Chair();
		
		 String[] a=args[0].split(",");
		 chair1.brand=a[0];
		 chair1.color=a[1];
		 chair1.price=Integer.parseInt(a[2]);
		 chair1.taxAmount=Integer.parseInt(a[3]);
		 chair1.netPrice= chair1.price+chair1.taxAmount;
		 

		String[] b=args[1].split(",");
		 chair2.brand=b[0];
		 chair2.color=b[1];
		 chair2.price=Integer.parseInt(b[2]);
		 chair2.taxAmount=Integer.parseInt(b[3]);
		 chair2.netPrice= chair2.price+chair2.taxAmount;
		 

		 String[] c=args[2].split(",");                                        
		 chair3.brand=c[0];
		 chair3.color=c[1];
		 chair3.price=Integer.parseInt(c[2]);
		 chair3.taxAmount=Integer.parseInt(c[3]);
		 chair3.netPrice= chair3.price+chair3.taxAmount;
		 
		 Chair[] chairs= {chair1,chair2,chair3};
		 int min=chairs[0].netPrice;
		 
		 for(int i=0;i<chairs.length;i++) {
				if(chairs[i].netPrice<min) {
					min=chairs[0].price;
				}
			}
			for(int i=0;i<chairs.length;i++) {
				if(min==chairs[i].netPrice) {
System.out.println("BRAND="+chairs[i].brand.toUpperCase()+", "+"COLOR="+chairs[i].color.toUpperCase()+", "+"NETPRICE="+chairs[i].netPrice);					
				}
			}
	 }
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		/* for(int i=0;i<chairs.length;i++) {
			 if(chairs[i].netPrice>max) {
				 max=chairs[i].netPrice;
			 }
		 }
		 
		 for(int i=0;i<chairs.length;i++) {
			 if(max==chairs[i].netPrice) {
System.out.println("BRAND="+chairs[i].brand.toUpperCase()+", "+"COLOR="+chairs[i].color.toUpperCase()+", "+"NETPRICE="+chairs[i].netPrice);
			 }
		 }
		
			 }
		 }
	 
   /*for(int i=0;i<bikes.length;i++) {
	if(bikes[i].price>max) {
		max=bikes[i].price;
	}*/

   /*for(int i=0;i<bikes.length;i++) {
	
	if(max==bikes[i].price) {
		System.out.println("Brand: "+bikes[i].brand);}
	}
	System.out.println("Max price of bike: "+max); */
	
	
	

