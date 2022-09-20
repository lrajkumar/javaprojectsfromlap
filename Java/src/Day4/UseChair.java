package Day4;

public class UseChair {
	public static void main(String[] args) {
		String brandName = args[0];
		String withHand = args[1];
		String price = args[2];
//		String tax = args[3]; //Array contains only 3 items. This will throw ArrayIndexOutOfBoundsException
		Chair chair = new Chair();
		chair.brand = brandName;
		chair.price = Integer.parseInt(price);
		chair.withHand = Boolean.parseBoolean(withHand);
		
		System.out.println("Brand=" + chair.brand + ", " + "WithHand=" + chair.withHand + ", " + "Price=" + chair.price);
		
		//Brand=?, WithHand=?, Price=?
		System.out.println(String.format("Brand=%s, WithHand=%s, Price=%s",
				chair.brand.toUpperCase(),
				chair.withHand,
				chair.price
				));
	}
}

class Chair {
	String brand;
	boolean withHand;
	int price;

}
