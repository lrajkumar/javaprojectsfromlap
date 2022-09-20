package DAY13;

public class Board {
	 private String brand;
	 private int price;
	 private String color;
	           Frame frame;
	 
     public void setBrand(String brand) {
    	 this.brand=brand;
     }
     public String getBrand() {
    	 return brand;
     }
     public void setprice(int price) {
    	 this.price=price;
     }
     public int getprice() {
    	 return price;
     }
     public void setColor(String color) {
    	 this.color=color;	 
     }
     public String getColor() {
    	 return color;
     }
     
     public Board(String brand,int price,String color,Frame frame) {
    	 this.brand=brand;
    	 this.price=price;
    	 this.color=color;
     }
     public String toString() {
    	 return brand+" "+price+" "+color;
     }
}
