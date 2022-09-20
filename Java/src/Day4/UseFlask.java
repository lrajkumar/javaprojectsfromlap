package Day4;

public class UseFlask {
	public static void main(String[] args) {
		String a=args[0];
		String[] b=a.split(",");
		Flask flask=new Flask();
		flask.brand=b[0];
		flask.price=Integer.parseInt(b[1]);
		flask.isSteelType=Boolean.parseBoolean(b[2]);
		System.out.println("BRAND: "+flask.brand.toLowerCase()+", "+"PRICE: "+flask.price+", "+ "STEELTYPE: "+flask.isSteelType+", "+ "LENGTH: "+flask.brand.length()+", "+"SECOND LAST LETTER: "+flask.brand.toLowerCase().charAt(flask.brand.toLowerCase().length()-2));
		
	}

}

 class Flask {
	 String brand;
	 int price;
	 boolean isSteelType;
	 
 }