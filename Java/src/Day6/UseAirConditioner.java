package Day6;

public class UseAirConditioner {
	public static void main(String[] args) {
		AirConditioner air1=new AirConditioner();
		AirConditioner air2=new AirConditioner();
		AirConditioner air3=new AirConditioner();
		
		String[] a=args[0].split(",");
		air1.brand=a[0];
		air1.color=a[1];
		air1.isWarranty=Boolean.parseBoolean(a[2]);
		air1.price=Integer.parseInt(a[3]);
		air1.discountAmount=Integer.parseInt(a[4]);
		air1.netPrice=air1.price-air1.discountAmount;
		
		String[] b=args[1].split(",");
		air2.brand=b[0];
		air2.color=b[1];
		air2.isWarranty=Boolean.parseBoolean(b[2]);
		air2.price=Integer.parseInt(b[3]);
		air2.discountAmount=Integer.parseInt(b[4]);
		air2.netPrice=air2.price-air2.discountAmount;
		
		String[] c=args[2].split(",");
		air3.brand=c[0];
		air3.color=c[1];
		air3.isWarranty=Boolean.parseBoolean(c[2]);
		air3.price=Integer.parseInt(c[3]);
		air3.discountAmount=Integer.parseInt(c[4]);
		air3.netPrice=air3.price-air3.discountAmount;
		
		if (air1.brand.charAt(0)=='v'||'b'||'s'){
			System.out.println("the brand name is:"+(air1.brand));
			System.out.println("the price of the brand is:"+(air1.price));
		}
		else if(air2.brand.charAt(0)=='b') {
			b
		}
		else if(air3.brand.charAt(0)=='s') {
			
		}
	}

}
