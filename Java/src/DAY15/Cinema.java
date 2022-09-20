package DAY15;

public class Cinema {
	public String movie(float rating) {
		if(rating>=4.1) {
			return "Movie is ExOrdinary";
			
		}
		else if(rating>=3.1 && rating<=3.9) {
			return "Movie is ordinary";
			
		}
		else if(rating>=2.1 && rating<=3.0) {
			return "Normal";
			
		}
		else {
			return "Movie is bad";
		}
	}
	
	public String movie(String name) {
		if(name.equals("RRR")) {
			return "String is equal";
		}
		else {
			return "String not equal";
		}
	}
	
	public static void main(String[] args) {
		Cinema c=new Cinema();
		System.out.println(c.movie(3.5f));
		System.out.println(c.movie("Beast"));
	}
	
	}


