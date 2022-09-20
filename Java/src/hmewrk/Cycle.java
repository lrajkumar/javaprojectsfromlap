package hmewrk;

public class Cycle {

 private String brand;
private int price; 
private boolean isElectric;


public void setBrand(String brand){
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
public void setisElectric (boolean isElectric){
 this.isElectric=isElectric;
}
public String toString() {
return brand+","+price+","+isElectric;
}

public Cycle(String brand, int price, boolean isElectric) {
this.brand=brand; 
this.price=price;
this.isElectric=isElectric;
}

}
