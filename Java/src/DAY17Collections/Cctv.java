package DAY17Collections;

public class Cctv {
	private String brand;
	private int price;
	private String color;
	private boolean isWaterResistance;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	
	public void setIsWaterResistance(boolean isWaterResistance) {
		this.isWaterResistance = isWaterResistance;
	}
	public boolean getIsWaterResistance() {
		return isWaterResistance;
		
	}
	
	@Override
	public String toString() {
		return "brand=" +brand +","+"price=" +price+","+"Color:"+color;
				
	}
	
	public Cctv(String brand, int price, String color, boolean isWaterResistance) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.isWaterResistance = isWaterResistance;
	}
	
  
	
	
}
