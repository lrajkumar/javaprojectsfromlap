package DAY13;

public class Ball {
     private String brand;
     private int price;
     private String color;
     
     
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
     
     public void SetColor(String color) {
    	 this.color=color;
     }
     public String getColor() {
    	 return color;
     }
     
     public Ball(String brand,int price,String color) {
     this.brand=brand;
     this.price=price;
     this.color=color;
    
}
}


