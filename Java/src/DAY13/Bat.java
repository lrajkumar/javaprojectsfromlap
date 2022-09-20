package DAY13;

public class Bat {
	private String brand;
	private int price;
	private float length;
	private String type;
	Ball ball;
	
	public void SetBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void SetPrice(int price) {
		this.price=price;
		
	}
	public int getPrice() {
		return price;
	}
	public void SetLength(float length) {
		this.length=length;
	}
	public float getLength() {
		return length;	
	}
	public void SetType(String type) {
		this.type=type;
	}
	public String getType() {
		return type;
	}
	
	public Bat(String brand,int price,float length,String type,Ball ball) {
             this.brand=brand;
             this.price=price;
             this.length=length;
             this.type=type;
             this.ball=ball;
} 
}
