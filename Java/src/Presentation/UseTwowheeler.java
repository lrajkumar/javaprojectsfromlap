package Presentation;

public class UseTwowheeler {
	public static void main(String[] args) {
		Twowheeler  t=new Twowheeler();
		Fourwheeler f=new Fourwheeler();
		
		Parking p = new Twowheeler();
		
		if(t instanceof Parking) {
			t.twoWheelerParkingRate();
		}
		else {
			System.out.println("The rate is undefined");
		}
	}

}
