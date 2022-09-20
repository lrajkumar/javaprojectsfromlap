package DAY15;

public class AC extends Fan {
 public String cool(int temp) {
	 if(temp>25) {
		 return "Temperature is hot";
		 
	 }
	 else {
		 return "Temperature is cool";
	 }
 }


public static void main(String[] args) {
	AC a=new AC();
	System.out.println(a.rotation(5));
	System.out.println(a.cool(26));
}
}
