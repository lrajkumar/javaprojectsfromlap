package Day6;

public class Test14 {
	
	public static void main(String[] args) {
		
		String flavour=args[0];
		int qty=Integer.parseInt(args[1]);
		
		System.out.println("welcome to onesoft shop");
		System.out.println("choose your menu");
		switch (flavour) {
		
		case "strawberry": int price=qty*30;
			              System.out.println("Your order is: "+flavour);
		                   System.out.println("Price is:"+ price);break;
		case "chocolate": int price1=qty*40;
			              System.out.println("Your order is:"+flavour);
                           System.out.println("Price is:" + price1);break;
		case "Butterscrocth":int price2=qty*50;
			               System.out.println("Your order is:"+flavour);
		                    System.out.println("Price is:" + price2);break;
		case "Blackberry":int price3=qty*45;
			              System.out.println("Your order is:"+flavour);
                           System.out.println("Price is:"+ price3);break;
		case "vennila":int price4=qty*30;
			           System.out.println("Your order is:"+flavour);
                        System.out.println("Price is:"+ price4);break;
        default:System.out.println("Not in money");break;
		}
		
        System.out.println("Enjoy your icecream");
        System.out.println("Thanks for coming('_')");
        
		
	}

}
