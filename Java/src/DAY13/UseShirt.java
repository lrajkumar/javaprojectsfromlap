package DAY13;

public class UseShirt {
	public static void main(String[] args) {
		Shirt s=new Shirt("Levis","blue",1500,"good");
		System.out.println(s.getbrand()+", "+s.getColor()+", "+s.getPrice()+", "+s.getIsQuality());
		
	}

}
