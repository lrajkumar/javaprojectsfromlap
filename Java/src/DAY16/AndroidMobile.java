package DAY16;

public class AndroidMobile extends Mobile {
	public String screenType() {
		return "Gorilla Glass";
	}
	
	public static void main(String[] args) {
		AndroidMobile am=new AndroidMobile();
		System.out.println(am.screenType());
		System.out.println(am.isChargable());
	}

}
