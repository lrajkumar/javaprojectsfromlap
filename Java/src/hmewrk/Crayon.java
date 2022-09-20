package hmewrk;

public class Crayon {
	
	private String brand;
	private int price; 
	private int noOfShades;

	
	public void setBrand (String brand) {

	this.brand=brand;

	}
   public String getBrand() {
	return brand;
}

	public void setPrice(int price) {

	this.price=price;
	}

	public int getPrice() {
	return price;
	}

	public void seNoOfShades(int noorShades) {
		this.noOfShades=noOfShades;
	}
	public String toString() {
		return brand+price+noOfShades;
	}
	public Crayon(String brand,int price,int noOfShades) {
		this.brand=brand;
		this.price=price;
		this.price=price;
	}
}
		
	
