package DAY13;

public class Frame {
     private String color;
     private int price;
     private String shape;
     
     
     public void setColor(String color) {
    	 this.color=color;
     }
     public String getColor() {
    	 return color;
     }
     
     public void setPrice(int price) {
    	 this.price=price;
     }
     public int getPrice() {
    	 return price;
  	 
     }
     public void setShape(String shape) {
    	 this.shape=shape;
     }
     public String getShape() {
    	 return shape;
     }
     
     public Frame(String color,int price,String shape) {
    	 this.color=color;
    	 this.price=price;
    	 this.shape=shape;
     }
  public String toString() {
 	 return color+" "+price+" "+shape;
  }
}
