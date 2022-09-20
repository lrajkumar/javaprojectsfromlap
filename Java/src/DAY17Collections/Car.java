package DAY17Collections;

public class Car {
	private String brand;
	private String model;
	private int price;
	
	
	public void setBarnd(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setmodel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return "BRAND: "+brand+", "+"MODEL: "+model+", "+"PRICE: "+price;
	}
	
	public Car(String brand,String model,int price) {
		this.brand=brand;
		this.model=model;
		this.price=price;
	}

}
