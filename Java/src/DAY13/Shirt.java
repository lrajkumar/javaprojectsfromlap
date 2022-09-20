package DAY13;

public class Shirt {
	private String color;
	private String brand;
	private int price;
	private String isQuality;
	
	
	public void SetBrand(String brand) {
		this.brand=brand;
	}
	public String getbrand() {
		return brand;
		
	}
	public void SetColor(String color) {
		this.color=color;
		
	}
	public String getColor() {
		return color;
	}
  public void SetPrice(int price) {
	  this.price=price;
  }
  public int getPrice() {
	  return price;
  }
  
  public void SetIsQuality(String isQuality) {
	  this.isQuality=isQuality;
  }
  public String getIsQuality() {
	  return isQuality;
  }
  
  public Shirt(String brand,String color,int price,String isQuality) {
	  this.brand=brand;
	  this.color=color;
	  this.price=price;
	  this.isQuality=isQuality;
  }
}
