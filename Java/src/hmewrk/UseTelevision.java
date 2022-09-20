package hmewrk;

public class UseTelevision {
	public static void main(String[] args) {
		String brand=args[0];
		int price=Integer.parseInt(args[1]);
		int deliveryCharge=Integer.parseInt(args[2]);
		String access=args[3];
		String cool=args[4];
		
		Television t=new Television();
System.out.println("BRAND= "+brand.toUpperCase()+", "+"PRICE= "+price+", "+"NETPRICE METHOD= "+t.getNetPrice(price,deliveryCharge)+", "+"WIFI= "+t.wifiAccess(access)+", "+"AUTOCOOLING= "+t.autocooling(cool));
	
		
	}

}
